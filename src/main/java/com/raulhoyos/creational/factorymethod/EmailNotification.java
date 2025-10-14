package com.raulhoyos.creational.factorymethod;

public class EmailNotification implements Notification {
    
    
   @Override
   public String notifyUser(){
     return "Sending Email to user...";
   }
    
}
