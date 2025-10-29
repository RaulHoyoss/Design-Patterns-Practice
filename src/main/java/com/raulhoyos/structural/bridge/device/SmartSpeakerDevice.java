package com.raulhoyos.structural.bridge.device;

import com.raulhoyos.structural.bridge.Status;

public class SmartSpeakerDevice implements Device {
    private Status status;
    private int channel;
    private int volume;
    private boolean bluetoothConnection;


    public SmartSpeakerDevice( int volume){
        this.status = Status.off;
        this.bluetoothConnection = false;
        this.volume = volume;
        this.channel = 1;
    }

    @Override
   public boolean isEnabled(){
        return status == Status.on;
   }

   @Override
   public void enable(){
        status = Status.on;
        System.out.println("Smart Speaker booting up...");
   }

   @Override
   public void disable(){
        status = Status.off;
        System.out.println("Smart Speaker shutting down...");
   }

   @Override
   public int getVolume(){
        return this.volume;
   }

   @Override
    public void setVolume(int percent){
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        this.volume = percent;
        System.out.println("Volume set to " + volume + "%");
    }

    @Override
    public int getChannel(){
        return this.channel;
    }

    @Override
    public void setChannel(int channel){
        if (channel < 1) channel = 1;
        this.channel = channel;
        System.out.println("Smart Speaker switched to playlist #" + channel);
    }   

    @Override
    public void printStatus(){
         System.out.println("-------------------------------");
        System.out.println("Smart Speaker Status:");
        System.out.println("Power: " + status);
        if (status == Status.on) {
            System.out.println("Bluetooth: " + (bluetoothConnection ? "Connected" : "Disconnected"));
            System.out.println("Current Playlist: #" + channel);
            System.out.println("Volume: " + volume +"%");
        }
        System.out.println("-------------------------------");
    }

     // Métodos adicionales propios (no forman parte de Device)
    public void connectBluetooth() {
        bluetoothConnection = true;
        System.out.println("Bluetooth connected.");
    }

    public void disconnectBluetooth() {
        bluetoothConnection = false;
        System.out.println("Bluetooth disconnected.");
    }
}
