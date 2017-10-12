package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jrforest on 10/11/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList getTweets(){
        return sort();
    }

    private ArrayList sort() {
        ArrayList<Tweet> sortedTweets = tweets;
        for(int i = 0; i < sortedTweets.size(); i++){
            for(int j = 0; j < sortedTweets.size(); j++){
                if (sortedTweets.get(i).getDate().after(sortedTweets.get(j).getDate())){
                    Tweet tempi = sortedTweets.get(i);
                    Tweet tempj = sortedTweets.get(j);
                    sortedTweets.remove(i);
                    sortedTweets.add(i, tempj);
                    sortedTweets.remove(j);
                    sortedTweets.add(j, tempi);
                }
            }
        }

        return sortedTweets;
    }

    public int getCount(){
        return tweets.size();
    }

}
