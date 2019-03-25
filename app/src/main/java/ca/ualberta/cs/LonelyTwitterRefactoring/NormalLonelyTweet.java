package ca.ualberta.cs.LonelyTwitterRefactoring;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends Tweet {

	public NormalLonelyTweet() {
	    super();
	}

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10) {
			return false;
		}

		return true;
	}
}