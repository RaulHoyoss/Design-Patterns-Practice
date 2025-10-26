package com.raulhoyos.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {

         List<MusicPlayer> players = new ArrayList<>();

        players.add(new MP3Player());
        players.add(new FLACAdapter(new FLACPlayer()));
        players.add(new WAVAdapter(new WAVPlayer()));
        

        System.out.println("\n Playing songs with Universal Player:\n");
        for (MusicPlayer player : players) {
            player.play("Blinding Lights_TheWeekend");
        }

    }
}
