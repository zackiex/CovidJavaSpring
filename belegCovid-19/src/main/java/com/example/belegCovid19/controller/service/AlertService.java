package com.example.belegCovid19.controller.service;

import com.example.belegCovid19.dto.AlertStatus;
import com.example.belegCovid19.dto.StateData;
import com.example.belegCovid19.dto.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AlertService {

    @Autowired // to go to servce and crate instance
    private Covid19DataProvider covid19DataProvider;

    //logic to create the alert about the state
    public AlertStatus getAlertAboutState(String state) {
        AlertStatus alertStatus = new AlertStatus();
        StateData stateData = covid19DataProvider.getStateData(state);

        alertStatus.setSummaryData(stateData);
        if (stateData.getTotalConfirmed() < 500) {
            alertStatus.setAlertLevel("GREEN");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("GREEN", "Die Situation ist akzeptabel"));
        } else if (stateData.getTotalConfirmed() > 1000 && stateData.getTotalConfirmed() < 50000) {
            alertStatus.setAlertLevel("ORANGE");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("ORANGE", "Es sind nur wesentliche Dienste zulässig"));
        } else {
            alertStatus.setAlertLevel("RED");
            alertStatus.setMeasuresToBeTaken(Arrays.asList("RED", "Absoluter Lock-Down"));
        }

        return alertStatus;
    }

    public SummaryData getOverAllSummary() {
        return covid19DataProvider.getSummaryData();
    }
}