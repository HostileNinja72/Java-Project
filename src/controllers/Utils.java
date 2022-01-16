package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Calendar;
import java.util.Optional;

public class Utils {
    public static void patients(ActionEvent event, String cIN, String nom, String prenom, JFXButton Enregistrer){
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExists = null;
        ResultSet resultSet = null;
        try{
            connection = Utils.getConnection();
            psCheckUserExists = connection.prepareStatement("SELECT * FROM patients WHERE CIN = ?");
            psCheckUserExists.setString(1, cIN);
            resultSet = psCheckUserExists.executeQuery();
            if(resultSet.isBeforeFirst()) {
                Utils.Error("Ce patients existe deja");
            }else{
                psInsert = connection.prepareStatement("Insert INTO patients (CIN, Nom, Prenom) VALUES (?, ? , ?)");
                psInsert.setString(1, cIN);
                psInsert.setString(2, nom);
                psInsert.setString(3, prenom);
                psInsert.executeUpdate();
                Stage stage = (Stage) Enregistrer.getScene().getWindow();
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


    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/fxcabinet", "root", "Souf1234*");
    }
    public static void VoirPatient(String Date, Calendar calendar) throws IOException {
        AfficherPatientsCal.date = Date;
        AfficherPatientsCal.calendar = calendar;
        AfficherPatientsCal.day = Date;
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Utils.class.getResource("/interfaces/AfficherPatients.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("New Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void SetNumbers(Text[] paths, Calendar calendar){
        String[] days = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Lundi")){
            for (int k=1, i = 6; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;

            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Mardi")){
            for (int k = 1, i = 0; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Mercredi")){
            for (int k = 1,i = 1; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Jeudi")){
            for (int k = 1, i = 2; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Vendredi")){
            for (int k = 1,i = 3; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Samedi")){
            for (int k = 1,i = 4; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
        if(days[calendar.get(Calendar.DAY_OF_WEEK)-1].equals("Dimanche")){
            for (int k = 1,i = 5; i < paths.length ; i++) {
                paths[i].setText(String.valueOf(k));
                k++;
                if (k > calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) break;
            }
        }
    }
    public static void DeleteCalendar(Text[] paths){
        for (Text path : paths) {
            path.setText("");
        }
    }

    public static void DeleteTable( TableView<modelTable> patientsTable){
        for (int i = 0; i < patientsTable.getItems().size(); i++) {
            patientsTable.getItems().clear();
        }
    }

    public static void SupprimerPatient(String CIN){
        Connection con = null;
        PreparedStatement Deletepatient= null;
        PreparedStatement CheckUserAppoint = null;
        ResultSet resultSet = null;


        try{
            con = Utils.getConnection();
            Deletepatient = con.prepareStatement("DELETE FROM patients WHERE CIN = ?");

            CheckUserAppoint = con.prepareStatement("Select * from rdv where CIN = ?");
            CheckUserAppoint.setString(1, CIN);

            resultSet = CheckUserAppoint.executeQuery();

            if(resultSet.isBeforeFirst()){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText("Ce patient a deja un rdv, etes vous sure de le supprimer?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get() == ButtonType.OK){
                    Deletepatient.setString(1, CIN);
                    Deletepatient.executeUpdate();
                }
                else if (option.get() == ButtonType.CANCEL){
                    alert.close();
                }

            }
            else{
                Deletepatient.setString(1, CIN);
                Deletepatient.executeUpdate();
            }

        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }

            }
            if (Deletepatient != null){
                try {
                   Deletepatient.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (CheckUserAppoint != null){
                try {
                    CheckUserAppoint.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (con != null){
                try {
                    con.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }
    }
    public static void Error(String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.show();
    }


}
