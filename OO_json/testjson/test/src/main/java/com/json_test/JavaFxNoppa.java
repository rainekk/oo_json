package com.json_test;

import org.json.JSONObject;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

public class JavaFxNoppa extends Application {
    @Override
    public void start(Stage ikkuna) {
        JSONObject json = new JSONObject("{ \"abc\" : \"def\" }");
        Label textLabel = new Label(json.toString());

        FlowPane testAsettelu = new FlowPane();
        testAsettelu.getChildren().add(textLabel);

        Scene nakyma = new Scene(testAsettelu);
        ikkuna.setScene(nakyma);

        ikkuna.setTitle("JSON-test");
        ikkuna.show();
    }
}