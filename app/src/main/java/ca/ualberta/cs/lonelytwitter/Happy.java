package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Sadman on 2017-09-14.
 */

public class Happy extends Mood {
    public Happy() {
    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String toString() {
        return "I am happy XD";
    }
}
