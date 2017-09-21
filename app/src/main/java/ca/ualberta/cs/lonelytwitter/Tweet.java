package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jrforest on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private Mood mood;


    public Tweet(String message) {
        date = new Date();
        this.message = message;
        mood = new HappyMood();
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
        mood = new HappyMood();
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }

    }

    public void setSadMood(){
        mood = new SadMood();
    }

    public void setSadMood(Date date){
        mood = new SadMood(date);
    }

    public void setHappyMood(){
        mood = new HappyMood();
    }

    public void setHappyMood(Date date){
        mood = new HappyMood(date);
    }

    public String getMood(){
        return mood.getMood();
    }


    public abstract Boolean isImportant();

    public String toString(){
        return date.toString() + '|' + message;
    }




}
