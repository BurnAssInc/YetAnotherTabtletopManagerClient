package ru.bai.yatmc.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Request request = new Request.Builder()
                .url("http://localhost:8080/character/?characterName=pupa")
                .build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            welcomeText.setText(response.body().string());
            //gson, jackson - библеотеки для парсинга json.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}