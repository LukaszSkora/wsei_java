package com.example.wsei_lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public TextField txtLicznik;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Dzień dobry, kolego drogi!");
    }

    int clickCounter = 0;
    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if (clickCounter == 1)
            btnMain.setText("I jeszcze raz");
        txtLicznik.setText("" + clickCounter);
    }
}