package com.huaa.action.ChainOfResponsibility;

public interface Ratify {

    public Result deal(Chain chain);

    interface Chain {
        Request request();

        Result process(Request request);
    }
}
