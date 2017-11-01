package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// Made package-private to eliminate redundancy
interface Tweetable {

    // Removed 'public' modifier since it's of no use in interface
    String getMessage();

    // Removed 'public' modifier since it's of no use in interface
    Date getDate();

}
