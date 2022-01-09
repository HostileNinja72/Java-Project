package controllers;

public class modelTable {
    String CIN;
    String Nom;
    String Prenom;

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



    public modelTable(String CIN, String nom, String prenom) {
        this.CIN = CIN;
        Nom = nom;
        Prenom = prenom;
    }




}
