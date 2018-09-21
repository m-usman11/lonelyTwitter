package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {
    ImportantTweet() {
        super();
    }

    ImportantTweet(String message, Mood mood) {
        super(message, mood);
    }

    @Override
    public Boolean isImportant() {
        return true;
    }

}
