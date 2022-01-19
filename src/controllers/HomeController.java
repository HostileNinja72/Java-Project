package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    AnchorPane AccPane;
    AnchorPane next;

    @FXML
    private Button AcceuilBotton;

    @FXML
    private Button CalendrierButton;

    @FXML
    private Button HistoriqueButton;

    @FXML
    private Button PatientsButton;

    @FXML
    private Button Prmbutton;

    @FXML
    private Button RDVbutton;

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
        HistoriqueButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    next = (AnchorPane) FXMLLoader.load(getClass().getResource("/interfaces/Historique.fxml"));
                    AccPane.getChildren().add(next);
                    AnchorPane.setLeftAnchor(next, 0.0);
                    next.toFront();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }

            }

        });
        RDVbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    next = (AnchorPane) FXMLLoader.load(getClass().getResource("/interfaces/Rdv.fxml"));
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




}
