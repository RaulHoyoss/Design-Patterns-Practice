package com.raulhoyos.creational.factorymethod;

public class NotificationMain {
    
    public static void main(String[] args) {
        
        NotificationService emailService = new EmailService();
        NotificationService smsService = new SMSService();
        NotificationService pushService = new PushService();

        System.out.println("---- Trying EmailService ----");
        emailService.sendNotification();

        System.out.println("---- Trying SMSService ----");
        smsService.sendNotification();

        System.out.println("---- Trying PushService ----");
        pushService.sendNotification();

    }
}
