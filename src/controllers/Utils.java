package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class Utils {
    public static void patients(ActionEvent event, String cIN, String nom, String prenom, JFXButton Enregistrer){
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fxcabinet", "root", "Souf1234*");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM patients WHERE CIN = ?");
            psCheckUserExists.setString(1, cIN);
            resultSet = psCheckUserExists.executeQuery();
            if(resultSet.isBeforeFirst()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Ce patients existe deja");
                alert.show();
            }else{
                psInsert = connection.prepareStatement("Insert INTO patients (CIN, Nom, Prenom) VALUES (?, ? , ?)");
                psInsert.setString(1, cIN);
                psInsert.setString(2, nom);
                psInsert.setString(3, prenom);
                psInsert.executeUpdate();
                Stage stage = (Stage) Enregistrer.getScene().getWindow(); //nnnnnnnnn
                stage.close();
            }

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (psCheckUserExists != null){
                try {
                    psCheckUserExists.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (psInsert != null){
                try {
                    psInsert.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void ChercherPatient(ActionEvent event, String CIN, TableView<?> patientsTable ){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fxcabinet", "root", "Souf1234*");
            preparedStatement = connection.prepareStatement("SELECT CIN, Nom, Prenom FROM patients WHERE CIN = ?");
            preparedStatement.setString(1, CIN);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.isBeforeFirst()){
                System.out.println("Ce patient n'exista pas");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(" veuillez ajouter ce utilisateur ou verifiez votre donnée ");
                alert.show();
            } else {
                while(resultSet.next()){
                    String retrieveCIN = resultSet.getString("CIN");
                    String retrieveNom = resultSet.getString("Nom");
                    String retrievePrenom = resultSet.getString("Prenom");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fxcabinet", "root", "Souf1234*");
        return connection;
    }
    public static void VoirPatient(String Date) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Utils.class.getResource("/interfaces/AfficherPatients.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("New Window");
        stage.setScene(scene);
        stage.show();
    }



}
