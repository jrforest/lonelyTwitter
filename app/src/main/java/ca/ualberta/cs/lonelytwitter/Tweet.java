
/*
 * Copyright (c) 2017. Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jrforest on 9/13/17.
 */
/**
 * Represents a tweet
 *
 * @author team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private Mood mood;

    /**
     * Constructs a Tweet object
     * @param message tweet message
     */
    public Tweet(String message) {
        date = new Date();
        this.message = message;
        mood = new HappyMood();
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
        mood = new HappyMood();
    }


    /**
     * Returns the tweet message.
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }

    }

    /**
     * Sets mood to Sad
     */
    public void setSadMood(){
        mood = new SadMood();
    }

    /**
     * Sets mood to Sad
     * @param date date mood was set
     */
    public void setSadMood(Date date){
        mood = new SadMood(date);
    }

    /**
     * Sets mood to Happy
     */
    public void setHappyMood(){
        mood = new HappyMood();
    }

    /**
     * Sets mood to Happy
     * @param date date mood was set
     */
    public void setHappyMood(Date date){
        mood = new HappyMood(date);
    }

    /**
     * Get mood in string format
     * @return mood in string format
     */
    public String getMood(){
        return mood.getMood();
    }

    /**
     * Returns boolean representing if tweet is important
     * @return True if tweet is important and False otherwise
     */
    public abstract Boolean isImportant();

    /**
     * Returns string representation of tweet
     * @return String with tweet date and tweet message
     */
    public String toString(){
        return date.toString() + '|' + message;
    }




}
