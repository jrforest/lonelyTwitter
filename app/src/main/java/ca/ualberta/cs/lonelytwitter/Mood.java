package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jrforest on 9/13/17.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public void setDate (Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract String getMood();

}
