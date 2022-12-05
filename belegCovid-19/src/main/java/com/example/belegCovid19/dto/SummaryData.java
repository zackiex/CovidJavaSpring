package com.example.belegCovid19.dto;

import java.time.ZonedDateTime;

public class SummaryData extends BaseDataClass{

    private int total;
    private int confirmedButLocationUnidentified;

    private ZonedDateTime updateTime;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getConfirmedButLocationUnidentified() {
        return confirmedButLocationUnidentified;
    }

    public void setConfirmedButLocationUnidentified(int confirmedButLocationUnidentified) {
        this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
    }

    public ZonedDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(ZonedDateTime updateTime) {
        this.updateTime = updateTime;
    }
}