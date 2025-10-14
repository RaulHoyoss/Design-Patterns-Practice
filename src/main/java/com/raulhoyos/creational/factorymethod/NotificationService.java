package com.raulhoyos.creational.factorymethod;

public abstract class NotificationService {

    public abstract Notification createNotification();

    public void sendNotification(){

        Notification n = createNotification();
        System.out.println(n.notifyUser());
        
    }

}

