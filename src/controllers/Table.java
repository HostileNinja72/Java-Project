package controllers;

import java.sql.Time;

public class Table {
    String CIN;
    String Nom;
    String Prenom;
    String RDV_time;

    public Table(String CIN, String nom, String prenom, String RDV_time) {
        this.CIN = CIN;
        Nom = nom;
        Prenom = prenom;
        this.RDV_time = RDV_time;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getTime() {
        return RDV_time;
    }

    public void setTime(String RDV_time) {
        this.RDV_time = RDV_time;
    }


}
