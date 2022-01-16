package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;



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
        Enregistrer.setOnAction(event -> {
            if (!tf_Etat.getText().trim().isEmpty() && !tf_CIN.getText().trim().isEmpty() && !tf_Nom.getText().trim().isEmpty() && !tf_Prenom.getText().trim().isEmpty() && !tf_maladie.getText().trim().isEmpty() )
            {
                Utils.patients(event, tf_CIN.getText(), tf_Nom.getText(), tf_Prenom.getText(), Enregistrer);

            } else {
               Utils.Error("Merci d'entrer toute les infromations");
            }
        });

        }
    }

