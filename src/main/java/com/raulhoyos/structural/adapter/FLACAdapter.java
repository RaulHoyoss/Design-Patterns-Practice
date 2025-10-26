package com.raulhoyos.structural.adapter;

public class FLACAdapter implements MusicPlayer {
    
    private FLACPlayer flacPlayer;


    public FLACAdapter(FLACPlayer flacPlayer){
        this.flacPlayer = flacPlayer;
    }

    @Override
    public void play(String fileName){

        System.out.println("FLACAdapter → using an external FLACPlayer...");

        flacPlayer.playFLAC(fileName);
    }
}
