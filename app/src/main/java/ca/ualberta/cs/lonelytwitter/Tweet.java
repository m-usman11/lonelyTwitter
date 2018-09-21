package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements TweetTable {

    private Date date;
    private String message;
    private Mood mood;

    // Static modifier: Common for all instances
    // final: Not going to be modified
    private static final Integer MAX_CHARS = 140;

    Tweet() {
        this.date = new Date();
        this.message = "I am a default message";
    }

    Tweet(String message, Mood mood) {
        this.date = new Date();
        this.message = message;
        this.mood = mood;
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS)
            this.message = message;
        else
            throw new TweetTooLongException();
    }

    public Mood getMoodObj() {
        return this.mood;
    }

    public String getMood() {
        return this.mood.myMood();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public abstract Boolean isImportant();

}
