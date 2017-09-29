/*
 * Class Name: Mood
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Base class for Moods
 * @author Sadman
 * @version 1.0
 * @since 1.0
 * @see Sad
 * @see Happy
 *
 */

public abstract class Mood {
    private Date date;

    /**
     * Sets mood date to now
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * set a date to Mood
     * @param date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Get the Mood set date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the creations date for the Mood
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
