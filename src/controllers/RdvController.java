package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RdvController implements Initializable {

    @FXML
    private Button Button1;

    @FXML
    private Button Button10;

    @FXML
    private Button Button11;

    @FXML
    private Button Button12;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;

    @FXML
    private Button Button4;

    @FXML
    private Button Button5;

    @FXML
    private Button Button8;

    @FXML
    private Button Button9;

    @FXML
    private TextField tfCIN;

    @FXML
    private TextField tfHeure;

    @FXML
    private TextField tfMins;

    @FXML
    private Button Enregistrer;

    @FXML
    private Button Annuler;

    @FXML
    private DatePicker DP;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Enregistrer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!tfCIN.getText().trim().isEmpty() && !tfHeure.getText().trim().isEmpty() && !tfMins.getText().trim().isEmpty() && DP.getValue() !=null) {
                    Utils.AjouterRDV(Utils.getRandom(), DP.getValue().toString(), tfCIN.getText(), tfHeure.getText(), tfMins.getText());

                }
                else{
                    Utils.Error("Merci d'entrer tout les informations");
                }

            }
        });
    }
}
