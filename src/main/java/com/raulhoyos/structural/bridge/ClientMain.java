package com.raulhoyos.structural.bridge;

import com.raulhoyos.structural.bridge.device.*;
import com.raulhoyos.structural.bridge.remote.*;
public class ClientMain {
    
    public static void main(String[] args) {
        
        Device tv = new TvDevice(1, 20);
        Device radio = new RadioDevice("FM", 99, 50);
        Device speaker = new SmartSpeakerDevice(40);

        System.out.println("=== BasicRemote controlling TV ===");
        BasicRemote basicRemoteTv = new BasicRemote(tv);
        basicRemoteTv.togglePower();
        basicRemoteTv.volumeUp();
        basicRemoteTv.channelUp();
        tv.printStatus();

        System.out.println("\n=== AdvancedRemote controlling TV ===");
        AdvancedRemote advRemoteTv = new AdvancedRemote(tv);
        advRemoteTv.movieMode();
        advRemoteTv.mute();
        tv.printStatus();

        System.out.println("\n=== AdvancedRemote controlling Radio ===");
        AdvancedRemote advRemoteRadio = new AdvancedRemote(radio);
        advRemoteRadio.togglePower();
        advRemoteRadio.scanNext();
        radio.printStatus();

        System.out.println("\n=== AdvancedRemote controlling Smart Speaker ===");
        AdvancedRemote advRemoteSpeaker = new AdvancedRemote(speaker);
        advRemoteSpeaker.togglePower();
        advRemoteSpeaker.playFavorite();
        speaker.printStatus();


    }
}
