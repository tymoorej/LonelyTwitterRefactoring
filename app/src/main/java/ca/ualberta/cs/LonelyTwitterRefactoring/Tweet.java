package ca.ualberta.cs.LonelyTwitterRefactoring;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public abstract class Tweet implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    Tweet(){}

    Tweet(String text, Date date){}

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public String getTweetBody() {
        return tweetBody;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }

}
