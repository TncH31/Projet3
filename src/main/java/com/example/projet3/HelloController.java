package com.example.projet3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.FileInputStream;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void initialise(){

    }
}