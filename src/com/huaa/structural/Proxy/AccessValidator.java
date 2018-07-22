package com.huaa.structural.Proxy;

public class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("validate: " + userId + "...");
        if (userId.equalsIgnoreCase("huaa")) {
            System.out.println(userId + " login successfully");
            return true;
        } else {
            System.out.println(userId + " login failed");
            return false;
        }
    }
}
