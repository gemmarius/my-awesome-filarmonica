package com.enfocat.filarmonica;




public class Programa {
    
        private static final String URL = "/com/enfocat/filarmonica/media/";

        public static void main(String[] a) {
            
        Instrumento gralla = new Gralla();
        gralla.sonar(URL,gralla.getNombre());
        Instrumento piano = new Piano();
        piano.sonar(URL,piano.getNombre());
        Instrumento violin = new Violin();
        violin.sonar(URL,violin.getNombre());
    }
}
