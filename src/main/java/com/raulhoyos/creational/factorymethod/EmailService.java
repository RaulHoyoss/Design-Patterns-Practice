package com.raulhoyos.creational.factorymethod;

public class EmailService extends NotificationService {
    
    @Override
    public Notification  createNotification(){
        return new EmailNotification();
        }
}
