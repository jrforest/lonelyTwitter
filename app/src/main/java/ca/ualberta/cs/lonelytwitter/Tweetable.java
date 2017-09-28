
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
 * Interface for tweetable objects.
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
