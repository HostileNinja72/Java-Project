package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
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
    private JFXButton RapportsButton;

    @FXML
    private JFXButton RdvButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void acceuil(ActionEvent event) {


    }

    @FXML
    void calendrier(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/interfaces/calendrier.fxml"));
        AnchorPane CalPane = (AnchorPane) fxmlLoader.load();
        AccPane.getChildren().clear();
        AccPane.getChildren().add(CalPane);
    }

    @FXML
    void historique(ActionEvent event) {

    }

    @FXML
    void patients(ActionEvent event) {

    }

    @FXML
    void prm(ActionEvent event) {

    }

    @FXML
    void rapports(ActionEvent event) {

    }

    @FXML
    void rdv(ActionEvent event) {

    }


}
