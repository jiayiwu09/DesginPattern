package com.DesignPatterns.Facade.Exercise;

public class Main {
    public static void main(String[] args) {
        var twitterAPI = new TwitterApi("appKey", "secret");
        var tweets = twitterAPI.getRecentTweets();
    }
}
