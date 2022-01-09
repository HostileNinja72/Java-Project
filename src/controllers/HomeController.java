package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    AnchorPane AccPane;
    AnchorPane next;
    @FXML
    private JFXButton AcceuilBotton;

    @FXML
    private JFXButton CalendrierButton;

    @FXML
    private JFXButton HistoriqueButton;

    @FXML
    private JFXButton PatientsButton;

    @FXML
    private JFXButton PrmButton;

    @FXML
    private JFXButton RdvButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CalendrierButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    next = (AnchorPane) FXMLLoader.load(getClass().getResource("/interfaces/calendrier.fxml"));
                    AccPane.getChildren().add(next);
                    AnchorPane.setLeftAnchor(next, 0.0);
                    next.toFront();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });
        PatientsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    next = (AnchorPane) FXMLLoader.load(getClass().getResource("/interfaces/Patients.fxml"));
                    AccPane.getChildren().add(next);
                    AnchorPane.setLeftAnchor(next, 0.0);
                    next.toFront();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });
        AcceuilBotton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    next = (AnchorPane) FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
                    AccPane.getChildren().add(next);
                    AnchorPane.setLeftAnchor(next, 0.0);
                    next.toFront();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });


    }

    @FXML
    void acceuil(ActionEvent event) {


    }



    @FXML
    void historique(ActionEvent event) {

    }



    @FXML
    void prm(ActionEvent event) {

    }


    @FXML
    void rdv(ActionEvent event) {

    }


}
