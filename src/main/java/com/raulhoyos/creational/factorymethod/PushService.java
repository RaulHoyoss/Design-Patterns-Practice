package com.raulhoyos.creational.factorymethod;

public class PushService extends NotificationService {
    
    @Override
    public Notification createNotification(){
        return new PushNotification();
    }
}
