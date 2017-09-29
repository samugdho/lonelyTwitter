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
     * Constructor with only message
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a Tweet object with message and date
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Set the date
     * Not used yet
     * @param date
     */
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

    /**
     * Gets the date when tweet was created
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * get the message for the tweet
     * @return message
     */
    public String getMessage() {
        return message;
    }


    /**
     * Returns the date | message
     * @return string
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
