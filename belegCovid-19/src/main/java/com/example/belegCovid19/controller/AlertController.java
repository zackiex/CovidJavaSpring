package com.example.belegCovid19.controller;

import com.example.belegCovid19.dto.AlertStatus;
import com.example.belegCovid19.dto.SummaryData;
import com.example.belegCovid19.controller.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deutschland/")
public class AlertController {

    @Autowired // to go to the service @service
    private AlertService alertService;

    // info about the state
    @GetMapping("/{state}")
    public AlertStatus getAlertAboutState(@PathVariable String state){
        return alertService.getAlertAboutState(state);
    }

    @GetMapping("/summary")
    public SummaryData getOverAllSummary(){

        return alertService.getOverAllSummary();
    }
}