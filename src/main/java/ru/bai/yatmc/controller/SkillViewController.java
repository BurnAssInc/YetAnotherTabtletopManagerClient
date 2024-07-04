package ru.bai.yatmc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ru.bai.yatmc.HelloApplication;
import ru.bai.yatmc.model.DndCharacter;
import ru.bai.yatmc.model.Skill;
import ru.bai.yatmc.service.GetResponseByUrl;
import ru.bai.yatmc.service.ParseJsonService;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;


public class SkillViewController implements Serializable {

    @FXML
    private TableView<Skill> tableView;
    @FXML
    private TableColumn<Skill, String> skillName;
    @FXML
    private TableColumn<Skill, String> skillDescription;
    @FXML
    private TableColumn<Skill, Integer> skillRank;
    @FXML
    private Button backButton;

    List<Skill> skillList;

    ParseJsonService parseJsonService = new ParseJsonService();
    GetResponseByUrl getResponseByUrl = new GetResponseByUrl();
    String responseBody = getResponseByUrl.getResponseBody("http://localhost:8080/character/?characterName=pupa");

    @FXML
    void initialize() {

        try {
            ArrayList<DndCharacter> arrayList = parseJsonService.jsonParseToCharacterList(responseBody);
            skillList = arrayList.stream().findFirst().map(DndCharacter::getDndCharacterSkillSet)
                    .orElse(Collections.emptySet()).stream().toList();


        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        ObservableList<Skill> skillObservableList = FXCollections.observableArrayList(skillList);

        skillName.setCellValueFactory(new PropertyValueFactory<Skill, String>("skillName"));
        skillDescription.setCellValueFactory(new PropertyValueFactory<Skill, String>("skillDescription"));
        skillRank.setCellValueFactory(new PropertyValueFactory<Skill, Integer>("skillRank"));

        tableView.setItems(skillObservableList);

        backButton.setOnAction(actionEvent -> {
            try {
                backwards();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public void backwards() throws IOException {
        Stage stage = (Stage) backButton.getScene().getWindow();
        //stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("test-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage primaryStage = new Stage();//каждый раз создается новая сцена, необходимо возвращать прежнюю
        primaryStage.setTitle("Просмотр скилов персонажа");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
