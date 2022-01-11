package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


import java.io.IOException;
import java.net.URL;
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
    private Button calButton42;

    @FXML
    private Button calButton43;

    @FXML
    private Button calButton44;

    @FXML
    private Button calButton45;

    @FXML
    private Label date;

    @FXML
    private Button down;

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
    private Button up;

    @FXML
    private Label dateAn;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Date date1 = new Date();
        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                date1.Up(date.getText());
                date.setText(date1.mois);

            }
        });
        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                date1.Down(date.getText());
            date.setText(date1.mois);

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
