package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

/**
 * singleton class.
 * @author yayugu
 */
final class Data {
	private static final Data instance = new Data();

	private Data() {
	};

	public static Data getInstance() {
		return Data.instance;
	}

	public Twitter twitter;
	public RequestToken requestToken;
	public AccessToken accessToken = null;
	public String consumerKey = "tCE1HI1lUY0TiU7RnwKw";
	public String consumerSecret = "kRABRqr00z7Qhv0sHsGaRw0pRhFUZRPLToNtJm8v8";

	public void saveData() {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("data.dat"), "UTF-8"));
			bw.write(accessToken.getToken() + "\r\n");
			bw.write(accessToken.getTokenSecret() + "\r\n");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loadData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("data.dat"), "UTF-8"));
		String token = br.readLine();
		String tokenSecret = br.readLine();

		twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		accessToken = new AccessToken(token, tokenSecret);
		twitter.setOAuthAccessToken(accessToken);
		br.close();
	}

}
