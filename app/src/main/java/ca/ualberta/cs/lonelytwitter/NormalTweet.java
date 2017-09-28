
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
 * Represents a normal tweet.
 * @author team X
 * @version 1.5
 * @since 1.0
 * @see Tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet{

    /**
     * Constructs a normal tweet.
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a normal tweet.
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Shows whether Tweet is important.
     * @return False
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    /**
     * Returns date of tweet
     * @return tweet date
     */
    public Date getDate() {
        return null;
    }
}
