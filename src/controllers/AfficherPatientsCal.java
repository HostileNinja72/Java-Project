package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.ResourceBundle;

public class AfficherPatientsCal implements Initializable {
    public static String date;
    public static Calendar calendar;

    @FXML
    private TableColumn<Table, String> CIN_col;

    @FXML
    private TableColumn<Table, String> Nom_col;

    @FXML
    private TableView<Table> afficherTableau;

    @FXML
    private TableColumn<Table, String> prenom_Col;

    @FXML
    private TableColumn<Table, String> time_Col;

    ObservableList<Table> oblist1 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CIN_col.setCellValueFactory(new PropertyValueFactory<>("CIN"));
        Nom_col.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        prenom_Col.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        time_Col.setCellValueFactory(new PropertyValueFactory<>("Time"));
        try {
            Connection con = Utils.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from rdv");


            while (rs.next()) {
                oblist1.add(new Table(rs.getString("CIN"),null, null, rs.getTime("RDV_time").toString()));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        afficherTableau.setItems(oblist1);

    }
}
