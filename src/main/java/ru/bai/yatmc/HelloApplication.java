package ru.bai.yatmc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;


public class HelloApplication extends Application {
    //стэк сцен
    private Stack<Scene> sceneStack = new Stack<>();
    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("test-view.fxml"));
        Scene sceneCharacterView = new Scene(fxmlLoader.load());
        //sceneStack.push(sceneCharacterView);

        stage.setScene(sceneCharacterView);
        stage.show();

    }
    //метод меняющий сцену, необходимо реализовать доступ с остальных классов
    public void switchScene (Scene scene){
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}