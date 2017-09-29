/*
 * Class Name: Sad
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Sad mood is a Mood
 * @see Mood
 * @author Sadman
 * @version 1.0
 * @since 1.0
 */

public class Sad extends Mood {
    /**
     * @see Mood
     */
    public Sad() {
    }

    /**
     * @see Mood
     * @param date
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * Custom string for Sad Mood
     * @return string
     */
    @Override
    public String toString() {
        return "I am sad :(";
    }
}
