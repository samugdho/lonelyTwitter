/*
 * Class Name: Normal Tweet
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This tweet is not Important
 * @author Sadman
 * @version 1.0
 * @since 1.0
 * @see ImportantTweet
 *
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);
    }

    /**
     * @see Tweet
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Check if Tweet is important;
     * Returns false
     * @return boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
