package com.enfocat.filarmonica;

import com.alexco.media.MP3Player;
import com.alexco.samples.media.MP3PlayerDemo;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gralla extends Instrumento {

    @Override
    String getNombre() {
        return "trumpet";
    }

    @Override
    void sonar(String url, String nombre) {
        MP3Player mp3;
        try {
            mp3 = new MP3Player(MP3PlayerDemo.class.getResource(url + "trumpet.mp3"));
            mp3.play();
        } catch (Exception ex) {
            Logger.getLogger(MP3PlayerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
