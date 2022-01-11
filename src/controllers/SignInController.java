package controllers;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    @FXML
    private ImageView loading;

    @FXML
    private PasswordField passwordIn;

    @FXML
    private VBox VBox;
    private Parent fxml;

    @FXML
    private Label warning;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    loading.setVisible(false);
    }

    @FXML
    void connexion(ActionEvent event) throws IOException {
        String password = passwordIn.getText();
        if(password.equals("1234")){
            loading.setVisible(true);
            PauseTransition pt = new PauseTransition();
            pt.setDuration(Duration.seconds(1));
            pt.play();
            pt.setOnFinished(event1 -> {
                VBox.getScene().getWindow().hide();
                Stage home = new Stage();
                try {
                    fxml = FXMLLoader.load(getClass().getResource("/interfaces/sample.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(fxml);
                home.setScene(scene);
                home.setResizable(false);
                home.show();});

        }
        else{
            warning.setText("Le mot de passe est incorrect ");
        }

    }


}
