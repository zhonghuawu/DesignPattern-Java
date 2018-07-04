package com.huaa.creation.prototype;

import java.io.IOException;

public class Client
{
    public static void main(String[] args) {
        WeeklyLog log_prevision = new WeeklyLog();
        log_prevision.setName("zzh");
        log_prevision.setDate("12th week");
        log_prevision.setContent("work hard");
        Attachment attachment = new Attachment();
        attachment.setName("attachment");
        log_prevision.setAttachment(attachment);

        System.out.println("weekly log");
        System.out.println(log_prevision.getName());
        System.out.println(log_prevision.getDate());
        System.out.println(log_prevision.getContent());
        System.out.println(log_prevision.getAttachment());

        WeeklyLog log_new = log_prevision.clone();
        log_new.setDate("13th week");
        System.out.println("weekly log");
        System.out.println(log_new.getName());
        System.out.println(log_new.getDate());
        System.out.println(log_new.getContent());
        System.out.println(log_new.getAttachment());

        try {
            WeeklyLog log_now = log_prevision.deepClone();
            System.out.println(log_now.getName());
            System.out.println(log_now.getAttachment());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
