package com.raulhoyos.creational.factorymethod;

public class SMSService extends NotificationService  {
    
    @Override
    public Notification createNotification(){
        return new SMSNotification();
    }
}
