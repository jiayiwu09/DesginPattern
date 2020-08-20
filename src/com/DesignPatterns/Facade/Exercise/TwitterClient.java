package com.DesignPatterns.Facade.Exercise;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
    public List<Twitter> getRecentTweets(String accessToken) {
        System.out.println("Getting recent tweets");

        return new ArrayList<>();
    }
}
