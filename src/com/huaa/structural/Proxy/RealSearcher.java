package com.huaa.structural.Proxy;

public class RealSearcher implements Searcher {
    @Override
    public String search(String userId, String keyword) {
        System.out.println("user " + userId + " search business information used keyword " + keyword);
        return "search result";
    }
}
