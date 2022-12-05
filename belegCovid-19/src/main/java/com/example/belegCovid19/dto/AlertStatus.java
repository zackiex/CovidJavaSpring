package com.example.belegCovid19.dto;

import java.util.List;
public class AlertStatus {

    private String alertLevel;//RED, GREEN, ORNAGE

    private List<String> measuresToBeTaken;// was muss man tun ? Beschreibung

    private StateData summaryData;

    public StateData getSummaryData() {
        return summaryData;
    }

    public void setSummaryData(StateData summaryData) {
        this.summaryData = summaryData;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public List<String> getMeasuresToBeTaken() {
        return measuresToBeTaken;
    }

    public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
        this.measuresToBeTaken = measuresToBeTaken;
    }
}