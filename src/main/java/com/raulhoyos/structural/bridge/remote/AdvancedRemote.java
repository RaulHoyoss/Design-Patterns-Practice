package com.raulhoyos.structural.bridge.remote;

import com.raulhoyos.structural.bridge.device.Device;
import com.raulhoyos.structural.bridge.device.RadioDevice;
import com.raulhoyos.structural.bridge.device.SmartSpeakerDevice;
import com.raulhoyos.structural.bridge.device.TvDevice;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device){
        super(device);
    }

    public void mute(){
        System.out.println("[AdvancedRemote] Mute activated");
        device.setVolume(0);
    }

    public void setVolume(int percent) {
        int newVol = Math.max(0, Math.min(100, percent));
        device.setVolume(newVol);
        System.out.println("[AdvancedRemote] Volume set to " + newVol + "%");
    }

    public void setChannel(int channel) {
        if (channel < 1) channel = 1;
        device.setChannel(channel);
        System.out.println("[AdvancedRemote] Switched to channel " + channel);
    }

    public void movieMode(){
        if(device instanceof TvDevice){
             System.out.println("[AdvancedRemote] Changing to movie mode...");
            this.setVolume(30);
            this.setChannel(5);
           
        }
        else{
            System.out.println("[AdvancedRemote] Movie mode not supported on this device");
        }
    }

    public void scanNext(){
        if(device instanceof RadioDevice){
            System.out.println("[AdvancedRemote] Radio: Scanning next frequency...");
            this.channelUp();
        }
        else{
            System.out.println("[AdvancedRemote] Change frequency not supported on this device");
        }
    }

    public void playFavorite(){
        if(device instanceof SmartSpeakerDevice){
            System.out.println("[AdvancedRemote] Smart Speaker: Playing favorite playlist");
            this.setChannel(1);
        }
        else{
            System.out.println("[AdvancedRemote] Favourite mode not supported on this device");
        }
    }

    
}
