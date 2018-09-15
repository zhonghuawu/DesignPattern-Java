package com.huaa.action.ChainOfResponsibility;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 1:15
 */

public class Manager implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager=====>request: " + request.toString());

        if (request.getDays() > 3) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.getName()+"KPI考核不错，可以批准")
                    .build();
            return chain.process(newRequest);
        }
        return new Result(true, "Manager: 早点办完事，项目需要你");
    }
}
