package com.raulhoyos.creational.factorymethod;

public class SMSNotification implements Notification{
    
    @Override
    public String notifyUser(){
        return "Sending SMS to user...";
    }
}
