/*
 * Class Name: Happy
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Happy Mood for tweets
 * @author Sadman
 * @version 1.0
 * @since 1.0
 * @see Mood
 */

public class Happy extends Mood {
    /**
     * Does nothing for now...
     */
    public Happy() {
    }

    /**
     * Does nothing for now...
     * @param date
     */
    public Happy(Date date) {
        super(date);
    }

    /**
     * Custom string for Happy Mood
     * @return string
     */
    @Override
    public String toString() {
        return "I am happy XD";
    }
}
