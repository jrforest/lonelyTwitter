package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jrforest on 9/13/17.
 */

public class HappyMood extends Mood{


    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    public String getMood() {
        return "Happy!";
    }
}
