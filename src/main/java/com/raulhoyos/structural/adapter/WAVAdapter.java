package com.raulhoyos.structural.adapter;

public class WAVAdapter implements MusicPlayer {
    
    private WAVPlayer wavPlayer;
    
    public WAVAdapter(WAVPlayer wavPlayer){
        this.wavPlayer = wavPlayer;
    }


    public void play(String fileName){
        System.out.println("WAVAdapter → using an external WAVPlayer...");
        wavPlayer.playWAV(fileName);
    }
}
