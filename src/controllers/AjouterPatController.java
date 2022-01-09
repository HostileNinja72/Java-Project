package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class AjouterPatController implements Initializable {


    @FXML
    private JFXButton Enregistrer;

    @FXML
    private TextField tf_CIN;

    @FXML
    private TextField tf_Etat;

    @FXML
    private TextField tf_Nom;

    @FXML
    private TextField tf_Prenom;

    @FXML
    private TextField tf_maladie;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Enregistrer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                if (!tf_Etat.getText().trim().isEmpty() && !tf_CIN.getText().trim().isEmpty() && !tf_Nom.getText().trim().isEmpty() && !tf_Prenom.getText().trim().isEmpty() && !tf_maladie.getText().trim().isEmpty() )
                {
                    Utils.patients(event, tf_CIN.getText(), tf_Nom.getText(), tf_Prenom.getText(), Enregistrer);

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText(" Merci d'entrer tout les informations ");
                    alert.show();
                }
            }
        });

        }
    }

