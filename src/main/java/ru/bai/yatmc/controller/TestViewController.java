package ru.bai.yatmc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.bai.yatmc.HelloApplication;
import ru.bai.yatmc.service.GetResponseByUrl;
import ru.bai.yatmc.service.ParseJsonService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TestViewController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button testButton;
    @FXML
    private Button skillButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField strTextField;
    @FXML
    private TextField dexTextField;
    @FXML
    private TextField conTextField;
    @FXML
    private TextField intTextField;
    @FXML
    private TextField wisTextField;
    @FXML
    private TextField chaTextField;

    ParseJsonService parseJsonService = new ParseJsonService();
    GetResponseByUrl getResponseByUrl = new GetResponseByUrl();

    @FXML
    void initialize() {
        testButton.setOnAction(actionEvent -> {
            String key = nameTextField.getText();
            String responseBody = getResponseByUrl.getResponseBody("http://localhost:8080/character/?characterName=" + key);

            try {
                strTextField.setText(parseJsonService.jsonParseByKey(responseBody, "strength").toString());
                conTextField.setText(parseJsonService.jsonParseByKey(responseBody, "constitution").toString());
                dexTextField.setText(parseJsonService.jsonParseByKey(responseBody, "dexterity").toString());
                intTextField.setText(parseJsonService.jsonParseByKey(responseBody, "intelligence").toString());
                wisTextField.setText(parseJsonService.jsonParseByKey(responseBody, "wisdom").toString());
                chaTextField.setText(parseJsonService.jsonParseByKey(responseBody, "charisma").toString());
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
        skillButton.setOnAction(actionEvent -> {
            try {
                skillsView();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void skillsView() throws IOException {

        Stage stage = (Stage) skillButton.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("skill-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Просмотр скилов персонажа");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}




