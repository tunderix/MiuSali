package com.example.ioni.miusali;

import java.io.Serializable;
import java.util.Date;

public class TrainingSession implements Serializable {
    private Date date;
    public TrainingSession(Date date){
        this.date = date;
    }

    public String getDate(){
        return this.date.toString();
    }

    public String getTime(){
        return "16:00";
    }
}
