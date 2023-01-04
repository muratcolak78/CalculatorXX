package com.example.calculatorxx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorXXApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorXXApplication.class.getResource("calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 440);
        stage.setTitle("Calculator by Colak.");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}