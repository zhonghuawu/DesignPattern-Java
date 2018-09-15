package com.huaa.action.ChainOfResponsibility;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 1:11
 */

public class GroupLeader implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("GroupLeader=====>request: " + request.toString());

        if (request.getDays() > 1) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setGroupLeaderInfo(request.getName()+"平时表现不错，现在项目不忙")
                    .build();
            return chain.process(newRequest);
        }
        return new Result(true, "GroupLeader: 早去早回");
    }
}
