package com.huaa.action.ChainOfResponsibility;

/**
 * Desc:
 *
 * @author Huaa
 * @date 2018/9/16 0:49
 */

public class Client {
    public static void main(String[] args) {
        Request request = new Request.Builder().setName("huaa").setDays(5).setReason("sick").build();
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);
        System.out.println("result: " + result);
    }

}
