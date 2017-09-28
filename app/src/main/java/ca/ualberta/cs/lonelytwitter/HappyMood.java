
/*
 * Copyright (c) 2017. Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of
 * Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a happy mood.
 * @author jrforest
 * @version 1.5
 * @since 1.5
 * @see Mood
 * @see SadMood
 */
public class HappyMood extends Mood{


    /**
     * Constructs happy mood
     */
    public HappyMood() {
        super();
    }

    /**
     * Construct happy mood
     * @param date date of mood
     */
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Returns string representation of mood
     * @return String "Happy"
     */
    public String getMood() {
        return "Happy!";
    }
}
