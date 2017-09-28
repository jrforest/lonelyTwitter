
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
 * Represents an important tweet
 * @author team X
 * @version 1.5
 * @since 1.0
 * @see Tweet
 * @see NormalTweet
 */
public class ImportantTweet extends Tweet{
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an important tweet
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);

    }

    /**
     * Shows whether tweet is important
     * @return True
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Returns date tweet was made.
     * @return date of tweet
     */
    public Date getDate() {
        return null;
    }
}
