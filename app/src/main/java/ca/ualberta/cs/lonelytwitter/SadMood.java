
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
 * Represents a sad mood.
 * @author jrforest
 * @version 1.5
 * @since 1.5
 * @see Mood
 * @see HappyMood
 */
public class SadMood extends Mood {

    /**
     * Constructs sad mood.
     */
    public SadMood() {
        super();
    }

    /**
     * Constructs sad mood.
     * @param date date of tweet
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Returns string representation of tweet
     * @return String "Sad"
     */
    public String getMood() {
        return "Sad";
    }


}
