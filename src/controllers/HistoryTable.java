package controllers;

public class HistoryTable {
    String idHistory;
    String Description;

    public HistoryTable(String idHistory, String description) {
        this.idHistory = idHistory;
        Description = description;
    }


    public String getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(String idHistory) {
        this.idHistory = idHistory;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
