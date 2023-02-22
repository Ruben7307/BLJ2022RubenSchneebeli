package com.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onDButtonClick() {
        welcomeText.setText("Nice to hear");
    }
}