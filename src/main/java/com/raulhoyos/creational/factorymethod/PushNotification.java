package com.raulhoyos.creational.factorymethod;

public class PushNotification  implements Notification{
    
    @Override
    public String notifyUser(){
        return  "Sending PUSH message  to user...";
    }
}
