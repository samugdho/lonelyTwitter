package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Sadman on 2017-09-14.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;
    }

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

}
