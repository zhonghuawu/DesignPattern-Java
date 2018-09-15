package com.huaa.action.ChainOfResponsibility;

import java.util.List;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 1:07
 */

public class RealChain implements Ratify.Chain {

    public Request request;
    public List<Ratify> ratifyList;
    public int index;

    public RealChain(Request request, List<Ratify> ratifyList, int index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result process(Request request) {
        Result result = null;
        if (index < ratifyList.size()) {
            RealChain chain = new RealChain(request, ratifyList, index + 1);
            Ratify ratify = ratifyList.get(index);
            result = ratify.deal(chain);
        }
        return result;
    }
}
