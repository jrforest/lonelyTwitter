
/*
 * Copyright (c) 2017. Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of
 * Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jrforest on 9/13/17.
 */

/**
 * Represents a mood.
 * @author team X
 * @since 1.0
 * @version 1.5
 * @see HappyMood
 * @see SadMood
 *
 */
public abstract class Mood {
    private Date date;

    /**
     * Constructs a mood
     */
    public Mood(){
        date = new Date();
    }

    /**
     * Constructs a mood
     * @param date date of mood
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Sets a new date for the mood
     * @param date mood date
     */
    public void setDate (Date date){
        this.date = date;
    }

    /**
     * Gets the mood's date
     * @return Date
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Returns string representation of the mood.
     * @return String
     */
    public abstract String getMood();

}
