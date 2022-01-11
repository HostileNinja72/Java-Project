package controllers;

public class Date {
    public String mois;
    public int annee;
    String[] month = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};

    Date(){
        mois = "Janvier";
        annee = 2002;
    }

    public void Up(String mos){

        for (int i = 0; i < month.length; i++) {
            if (mos.equals("Decembre")){
                mois = "Janvier";
                annee++;
            }
            else if (mos.equals(month[i])){
                mois = month[i+1];
            }
        }

    }
    public void Down(String mos){
        for (int i = 0; i < month.length; i++){
            if (mos.equals("Janvier")){
                mois =  "Decembre";
                annee--;
            }
            else if (mos.equals(month[i])){
                mois = month[i-1];
            }
        }

    }
}

