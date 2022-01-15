package controllers;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;



import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;

public class CalendrierController implements Initializable {

    @FXML
    private AnchorPane AccPane;

    @FXML
    private Button calButton11;

    @FXML
    private Button calButton12;

    @FXML
    private Button calButton13;

    @FXML
    private Button calButton14;

    @FXML
    private Button calButton15;

    @FXML
    private Button calButton16;

    @FXML
    private Button calButton17;

    @FXML
    private Button calButton21;

    @FXML
    private Button calButton22;

    @FXML
    private Button calButton23;

    @FXML
    private Button calButton24;

    @FXML
    private Button calButton25;

    @FXML
    private Button calButton26;

    @FXML
    private Button calButton27;

    @FXML
    private Button calButton31;

    @FXML
    private Button calButton32;

    @FXML
    private Button calButton33;

    @FXML
    private Button calButton34;

    @FXML
    private Button calButton35;

    @FXML
    private Button calButton36;

    @FXML
    private Button calButton37;

    @FXML
    private Button calButton41;

    @FXML
    private Button calButton42;

    @FXML
    private Button calButton43;

    @FXML
    private Button calButton44;

    @FXML
    private Button calButton45;

    @FXML
    private Button calButton46;

    @FXML
    private Button calButton47;

    @FXML
    private Button calButton51;

    @FXML
    private Button calButton52;

    @FXML
    private Button calButton53;

    @FXML
    private Button calButton54;

    @FXML
    private Button calButton55;

    @FXML
    private Button calButton56;

    @FXML
    private Button calButton57;

    @FXML
    private Label date;

    @FXML
    private Label dateAn;

    @FXML
    private Button down;

    @FXML
    private Text text11, text12, text13, text14, text15, text16, text17, text21, text22, text23, text24, text25, text26, text27, text31, text32, text33, text34, text35, text36, text37, text41, text42, text43, text44, text45, text46, text47, text51, text52, text53, text54, text55, text56, text57;

    @FXML
    private Button up;






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] months = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        String[] days = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        Text[] paths = new Text[]{text11, text12, text13, text14, text15, text16, text17, text21, text22, text23, text24, text25, text26, text27, text31, text32, text33, text34, text35, text36, text37, text41, text42, text43, text44, text45, text46, text47, text51, text52, text53, text54, text55, text56, text57 };
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Utils.SetNumbers(paths, calendar);



        up.setOnAction(event -> {
            Utils.DeleteCalendar(paths);
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            dateAn.setText(String.valueOf(calendar.get(Calendar.YEAR)));
            date.setText(months[calendar.get(Calendar.MONTH)]);


            Utils.SetNumbers(paths, calendar);


        });
        down.setOnAction(event -> {
            Utils.DeleteCalendar(paths);
            calendar.add(Calendar.MONTH, -1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            dateAn.setText(String.valueOf(calendar.get(Calendar.YEAR)));
            date.setText(months[calendar.get(Calendar.MONTH)]);

            Utils.SetNumbers(paths, calendar);

        });
        calButton11.setOnAction(event -> {
            try {
                Utils.VoirPatient(text11.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton12.setOnAction(event -> {
            try {
                Utils.VoirPatient(text12.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton13.setOnAction(event -> {
            try {
                Utils.VoirPatient(text13.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        calButton14.setOnAction(event -> {
            try {
                Utils.VoirPatient(text14.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton15.setOnAction(event -> {
            try {
                Utils.VoirPatient(text15.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton16.setOnAction(event -> {
            try {
                Utils.VoirPatient(text16.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton17.setOnAction(event -> {
            try {
                Utils.VoirPatient(text17.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton21.setOnAction(event -> {
            try {
                Utils.VoirPatient(text21.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton22.setOnAction(event -> {
            try {
                Utils.VoirPatient(text22.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton23.setOnAction(event -> {
            try {
                Utils.VoirPatient(text23.getText(),calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton24.setOnAction(event -> {
            try {
                Utils.VoirPatient(text24.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton25.setOnAction(event -> {
            try {
                Utils.VoirPatient(text25.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton26.setOnAction(event -> {
            try {
                Utils.VoirPatient(text26.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton27.setOnAction(event -> {
            try {
                Utils.VoirPatient(text27.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton31.setOnAction(event -> {
            try {
                Utils.VoirPatient(text31.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton32.setOnAction(event -> {
            try {
                Utils.VoirPatient(text32.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton33.setOnAction(event -> {
            try {
                Utils.VoirPatient(text33.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton34.setOnAction(event -> {
            try {
                Utils.VoirPatient(text34.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton35.setOnAction(event -> {
            try {
                Utils.VoirPatient(text35.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton36.setOnAction(event -> {
            try {
                Utils.VoirPatient(text36.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton37.setOnAction(event -> {
            try {
                Utils.VoirPatient(text37.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton41.setOnAction(event -> {
            try {
                Utils.VoirPatient(text41.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton42.setOnAction(event -> {
            try {
                Utils.VoirPatient(text42.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton43.setOnAction(event -> {
            try {
                Utils.VoirPatient(text43.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton44.setOnAction(event -> {
            try {
                Utils.VoirPatient(text44.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton45.setOnAction(event -> {
            try {
                Utils.VoirPatient(text45.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton46.setOnAction(event -> {
            try {
                Utils.VoirPatient(text46.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton47.setOnAction(event -> {
            try {
                Utils.VoirPatient(text47.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton51.setOnAction(event -> {
            try {
                Utils.VoirPatient(text51.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton52.setOnAction(event -> {
            try {
                Utils.VoirPatient(text52.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton53.setOnAction(event -> {
            try {
                Utils.VoirPatient(text53.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton54.setOnAction(event -> {
            try {
                Utils.VoirPatient(text54.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton55.setOnAction(event -> {
            try {
                Utils.VoirPatient(text55.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton56.setOnAction(event -> {
            try {
                Utils.VoirPatient(text56.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calButton57.setOnAction(event -> {
            try {
                Utils.VoirPatient(text57.getText(), calendar);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
