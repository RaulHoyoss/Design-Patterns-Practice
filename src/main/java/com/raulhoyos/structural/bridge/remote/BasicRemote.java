package com.raulhoyos.structural.bridge.remote;

import com.raulhoyos.structural.bridge.device.Device;

public class BasicRemote implements Remote {
    
    protected Device device;

    public BasicRemote(Device device){
        this.device = device;
    }

    public void togglePower(){

        if(device.isEnabled()){
            device.disable();
            System.out.println("[Remote] Power OFF");
        }
        else{
            device.enable();
            System.out.println("[Remote] Power ON");
        }
    } 

    public void volumeDown(){
        int newVolume = device.getVolume() - 10;  
        if(newVolume <0 ) newVolume = 0;
        device.setVolume(newVolume);
        System.out.println("[Remote] Volume down → " + newVolume + "%");
        
    }

    public void volumeUp(){
        int newVolume = device.getVolume() + 10;
        if (newVolume > 100) newVolume = 100;
        device.setVolume(newVolume);
        System.out.println("[Remote] Volume up → " + newVolume + "%");
    }

    public void channelDown(){
        int newChannel = device.getChannel() - 1;
        if (newChannel < 1) newChannel = 1;
        device.setChannel(newChannel);
        System.out.println("[Remote] Channel down → " + newChannel);
    }

    public void channelUp(){
        int newChannel = device.getChannel() + 1;
        device.setChannel(newChannel);
        System.out.println("[Remote] Channel up → " + newChannel);
    }

    public void setDevice(Device device) {
        this.device = device;
    }


}
