package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PatientsController implements Initializable {

    @FXML
    private JFXButton AjouterPat;

    @FXML
    private JFXButton SupprPatient;

    @FXML
    private JFXButton ModifierPatient;

    @FXML
    private TableColumn<modelTable, String> col_CIN;

    @FXML
    private TableColumn<modelTable, String> col_Nom;

    @FXML
    private TableColumn<modelTable, String> col_Prenom;

    @FXML
    private TableView<modelTable> patientsTable;

    @FXML
    private JFXButton searchButton;

    @FXML
    private DatePicker date_Birthdate;

    @FXML
    private TextField tf_CIN;

    @FXML
    private TextField tf_Nom;

    @FXML
    private TextField tf_Prenom;

    ObservableList<modelTable> oblist = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        col_CIN.setCellValueFactory(new PropertyValueFactory<>("CIN"));
        col_Nom.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        col_Prenom.setCellValueFactory(new PropertyValueFactory<>("Prenom"));



        AjouterPat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Utils.DeleteTable(patientsTable);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/interfaces/AjouterPatients.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setTitle("New Window");
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        SupprPatient.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Utils.SupprimerPatient(patientsTable.getSelectionModel().getSelectedItem().getCIN());
                System.out.println(patientsTable.getSelectionModel().getSelectedItem().getCIN());
                patientsTable.getItems().removeAll(patientsTable.getSelectionModel().getSelectedItem());



            }
        });
        ModifierPatient.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Utils.DeleteTable(patientsTable);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/interfaces/AjouterPatients.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setTitle("New Window");
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        searchButton.setOnAction(event -> {
            if(tf_CIN.getText().equals("") && tf_Nom.getText().equals("") && tf_Prenom.getText().equals("")) {
                try {
                    Utils.DeleteTable(patientsTable);
                    Connection con = Utils.getConnection();
                    ResultSet rs = con.createStatement().executeQuery("select * from patients");

                    while (rs.next()) {
                        oblist.add(new modelTable(rs.getString("CIN"), rs.getString("Nom"), rs.getString("Prenom")));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                patientsTable.setItems(oblist);
            }
            else if (!tf_CIN.getText().equals("") || !tf_Nom.getText().equals("") || !tf_Prenom.getText().equals("")){
                Utils.DeleteTable(patientsTable);
                try {
                    Connection con = Utils.getConnection();
                    String Q = null;
                    if(!tf_CIN.getText().equals("") && !tf_Nom.getText().equals("") && !tf_Prenom.getText().equals("") ){Q = "select * from patients where CIN = '" + tf_CIN.getText() + "' && Nom = '" + tf_Nom.getText() +"' && Prenom ='" +tf_Prenom.getText() +"'" ;}
                    else if(!tf_CIN.getText().equals("") && !tf_Nom.getText().equals("")){Q = "select * from patients where CIN = '" + tf_CIN.getText() + "' && Nom = '" + tf_Nom.getText() +"'";}
                    else if(!tf_CIN.getText().equals("") && !tf_Prenom.getText().equals("")){Q = "select * from patients where CIN = '" + tf_CIN.getText() + "' && Prenom = '" + tf_Prenom.getText() +"'";}
                    else if(!tf_Prenom.getText().equals("") && !tf_Nom.getText().equals("")){Q = "select * from patients where Prenom = '" + tf_Prenom.getText() + "' && Nom = '" + tf_Nom.getText() +"'";}
                    else if(!tf_CIN.getText().equals("")){Q = "select * from patients where CIN = '" + tf_CIN.getText() + "'";}
                    else if(!tf_Nom.getText().equals("")){Q = "select * from patients where Nom = '" + tf_Nom.getText() + "'";}
                    else if(!tf_Prenom.getText().equals("")){Q = "select * from patients where Prenom = '" + tf_Prenom.getText() + "'";}
                    ResultSet rs = con.createStatement().executeQuery(Q);
                    while (rs.next()) {
                        oblist.add(new modelTable(rs.getString("CIN"), rs.getString("Nom"), rs.getString("Prenom")));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                patientsTable.setItems(oblist);
            }

        });

    }
}
