package controllers;

public class Date {
    public String mois;
    public int annee;
    String[] month = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};

    Date(){
        mois = "Janvier";
        annee = 2022;
    }

    public void Up(String mos){
    boolean check = false;
        for (int i = 0; i < month.length; i++) {
            if (mos.equals("Decembre")){
                mois = "Janvier";
                check = true;
            }
            else if (mos.equals(month[i])){
                mois = month[i+1];
            }
        }
        if (check){
            annee++;
        }

    }
    public void Down(String mos){
        boolean check = false;
        for (int i = 0; i < month.length; i++){
            if (mos.equals("Janvier")){
                mois =  "Decembre";
                check = true;
            }
            else if (mos.equals(month[i])){
                mois = month[i-1];
            }
        }
        if (check){
            annee--;
        }

    }
}

