package com.huaa.structural.Proxy;

public class ProxySearcher implements Searcher {
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator = new AccessValidator();
    private Logger logger = new Logger();

    public String search(String userId, String keyword) {
        if (validate(userId)) {
            String result = searcher.search(userId, keyword);
            log(userId);
            return result;
        }
        return null;
    }

    public boolean validate(String userId) {
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger.log(userId);
    }

}
