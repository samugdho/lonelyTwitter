/*
 * Class Name: ImportantTweet
 * Version: Version 1.0
 * Date: September 28, 2017
 * Copyright (c) TEAM Y, CMPUT 301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the
 * Code of Students Behaviour at University of Alberta
*/

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Designates tweet as important
 * @author Sadman
 * @version 1.0
 * @since 1.0
 *
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }
    public ImportantTweet(String message, Date date){
        super(message, date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
