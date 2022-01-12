package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.time.LocalDate;


import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

public class CalendrierController implements Initializable {

    @FXML
    private AnchorPane AccPane;

    @FXML
    private Button calButton11;

    @FXML
    private Button calButton112;

    @FXML
    private Button calButton1121;

    @FXML
    private Button calButton11211;

    @FXML
    private Button calButton1122;

    @FXML
    private Button calButton113;

    @FXML
    private Button calButton1131;

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
    private Button calButton41;

    @FXML
    private Button calButton411;

    @FXML
    private Button calButton42;

    @FXML
    private Button calButton421;

    @FXML
    private Button calButton43;

    @FXML
    private Button calButton431;

    @FXML
    private Button calButton44;

    @FXML
    private Button calButton45;

    @FXML
    private Label date;

    @FXML
    private Label dateAn;

    @FXML
    private Button down;

    @FXML
    private Label jeudi;

    @FXML
    private Label lundi;

    @FXML
    private Label mardi;

    @FXML
    private Label mercredi;

    @FXML
    private Text text11;

    @FXML
    private Text text12;

    @FXML
    private Text text13;

    @FXML
    private Text text14;

    @FXML
    private Text text15;

    @FXML
    private Text text16;

    @FXML
    private Text text17;

    @FXML
    private Text text21;

    @FXML
    private Text text22;

    @FXML
    private Text text23;

    @FXML
    private Text text24;

    @FXML
    private Text text25;

    @FXML
    private Text text26;

    @FXML
    private Text text27;

    @FXML
    private Text text31;

    @FXML
    private Text text32;

    @FXML
    private Text text33;

    @FXML
    private Text text34;

    @FXML
    private Text text35;

    @FXML
    private Text text36;

    @FXML
    private Text text37;

    @FXML
    private Text text41;

    @FXML
    private Text text42;

    @FXML
    private Text text43;

    @FXML
    private Text text44;

    @FXML
    private Text text45;

    @FXML
    private Text text46;

    @FXML
    private Text text47;

    @FXML
    private Text text51;

    @FXML
    private Text text52;

    @FXML
    private Text text53;

    @FXML
    private Button up;

    @FXML
    private Label vendredi;

    @FXML
    private Label vendredi1;

    @FXML
    private Label vendredi11;






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] months = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
        String[] days = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        Text[] paths = new Text[]{text11, text12, text13, text14, text15, text16, text17, text21, text22, text23, text24, text25, text26, text27, text31, text32, text33, text34, text35, text36, text37, text41, text42, text43, text44, text45, text46, text47, text51, text52, text53 };
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Utils.SetNumbers(paths, calendar);



        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Utils.DeleteCalendar(paths);
                calendar.add(Calendar.MONTH, 1);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                dateAn.setText(String.valueOf(calendar.get(Calendar.YEAR)));
                date.setText(months[calendar.get(Calendar.MONTH)]);

                Utils.SetNumbers(paths, calendar);


            }
        });
        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Utils.DeleteCalendar(paths);
                calendar.add(Calendar.MONTH, -1);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                dateAn.setText(String.valueOf(calendar.get(Calendar.YEAR)));
                date.setText(months[calendar.get(Calendar.MONTH)]);

                Utils.SetNumbers(paths, calendar);

            }
        });
        calButton11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        calButton14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton24.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton31.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton32.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton33.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton34.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton35.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton41.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton42.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton43.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton44.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        calButton45.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Utils.VoirPatient(text11.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
