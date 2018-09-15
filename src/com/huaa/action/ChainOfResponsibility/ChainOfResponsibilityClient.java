package com.huaa.action.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 1:22
 */

public class ChainOfResponsibilityClient {
    private List<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies = new ArrayList<>();
    }

    public void addRatify(Ratify ratify) {
        this.ratifies.add(ratify);
    }

    public Result execute(Request request) {
        ArrayList<Ratify> arrayList = new ArrayList<>();
        arrayList.addAll(this.ratifies);
        arrayList.add(new GroupLeader());
        arrayList.add(new Manager());
        arrayList.add(new DepartmentHeader());

        RealChain chain = new RealChain(request, arrayList, 0);
        return chain.process(request);
    }

}
