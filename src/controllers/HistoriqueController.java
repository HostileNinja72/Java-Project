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
import java.util.ResourceBundle;

public class HistoriqueController implements Initializable {

    @FXML
    private TableView<HistoryTable> HistoryTable;

    @FXML
    private TableColumn<HistoryTable, String> idDes;

    @FXML
    private TableColumn<HistoryTable, String> idcol;

    ObservableList<HistoryTable> oblist1 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idcol.setCellValueFactory(new PropertyValueFactory<>("idHistory"));
        idDes.setCellValueFactory(new PropertyValueFactory<>("Description"));
        try {
            Connection con = Utils.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from history");

            while (rs.next()) {
                oblist1.add(new HistoryTable(String.valueOf(rs.getInt("idHistory")), rs.getString("Description")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HistoryTable.setItems(oblist1);


    }
}
