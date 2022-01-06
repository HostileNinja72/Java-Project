package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInController {

    @FXML
    private PasswordField passwordIn;

    @FXML
    private VBox VBox;
    private Parent fxml;

    @FXML
    private Label warning;

    @FXML
    void connexion(ActionEvent event) throws IOException {
        String password = passwordIn.getText();
        if(password.equals("1234")){
            VBox.getScene().getWindow().hide();
            Stage home = new Stage();
            fxml = FXMLLoader.load(getClass().getResource("/interfaces/sample.fxml"));
            Scene scene = new Scene(fxml);
            home.setScene(scene);
            home.show();
        }
        else{
        warning.setText("Le mot de passe est incorrect ");
        }

    }

}
