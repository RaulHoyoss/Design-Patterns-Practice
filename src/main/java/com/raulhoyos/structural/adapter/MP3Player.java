package com.raulhoyos.structural.adapter;

public class MP3Player implements MusicPlayer {
  
    
    public void play(String fileName){
        System.out.println("reproducing <" + fileName + ">.mp3");
    }
}
