package com.raulhoyos.structural.bridge.device;

import com.raulhoyos.structural.bridge.Status;

public class RadioDevice implements Device {
    private Status status;
    private int channel;
    private int volume;
    private String band;


    public RadioDevice(String band,int channel, int volume ){
        this.status = Status.off;
        this.band = band;
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
        System.out.println("Radio turned on");
   }

   @Override
   public void disable(){
        status = Status.off;
        System.out.println("Radio turned off");
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
        System.out.println("Radio Volume set to " + volume + "%");
    }

    @Override
    public int getChannel(){
        return this.channel;
    }

    @Override
    public void setChannel(int channel){
        if (channel < 1) channel = 1;
        this.channel = channel;
        System.out.println("Channel set to " + getFrequency());

    }  
    
     private String getFrequency() {
        // ejemplo: canal 1 = 88.0 MHz, canal 10 = 97.0 MHz
        double frequency = 87.5 + (channel * 0.5);
        return String.format("%.1f MHz %s", frequency, band);
    }

    

    @Override
    public void printStatus(){
         System.out.println("-------------------------------");
        System.out.println("Radio Device Status:");
        System.out.println("Power: " + status);
        if (status == Status.on) {
            System.out.println("Band" + band);
            System.out.println("Frequency: " + getFrequency());
            System.out.println("Volume: " + volume + "%");
        }
        System.out.println("-------------------------------");
    }
}
