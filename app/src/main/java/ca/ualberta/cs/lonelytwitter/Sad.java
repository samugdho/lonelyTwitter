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
 * Created by Sadman on 2017-09-14.
 */

public class Sad extends Mood {
    public Sad() {
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String toString() {
        return "I am sad :(";
    }
}
