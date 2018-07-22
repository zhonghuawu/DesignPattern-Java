package com.huaa.structural.Proxy;

public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();

        searcher.search("hUaa", "gg");

        searcher.search("zzh", "ggg");
    }
}
