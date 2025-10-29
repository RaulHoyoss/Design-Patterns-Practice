package com.raulhoyos.structural.bridge.device;

import com.raulhoyos.structural.bridge.Status;

public class TvDevice implements Device {
    
    private Status status;
    private int channel;
    private int volume;


    public TvDevice(int channel, int volume){
        this.status = Status.off;
        this.channel = channel;
        this.volume = volume;
    }

    @Override
   public boolean isEnabled(){
        return status == Status.on;
   }

   @Override
   public void enable(){
        status = Status.on;
        System.out.println("TV turned on");
   }

   @Override
   public void disable(){
        status = Status.off;
        System.out.println("TV turned off");
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
        System.out.println("Channel set to " + channel);

    }   

    @Override
    public void printStatus(){
         System.out.println("-------------------------------");
        System.out.println("TV Device Status:");
        System.out.println("Power: " + status);
        if (status == Status.on) {
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume + "%");
        }
        System.out.println("-------------------------------");
    }
}
