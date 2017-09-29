/*
 * Class Name: Tweet
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
*/

package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 * @author Sadman
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     *
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Sets tweet messages
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() <= 140){
            this.message = message;
        }else{
            throw new TweetTooLongException();
        }

    }
    public abstract Boolean isImportant();

    public Date getDate(){
        return date;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<Mood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }
    public void addMood(Mood mood) {
        this.moods.add(mood);
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
