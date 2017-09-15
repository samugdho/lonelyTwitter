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
