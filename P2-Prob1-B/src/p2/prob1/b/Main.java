package src.p2.prob1.b;

import src.p2.prob1.b.facade.FormatoAudioFacade;
import src.p2.prob1.b.factory.FormatoAudioFactory;

public class Main {

    public static void main(String args[]) {
        System.out.println("WMA:");
        wma();
        System.out.println();
        System.out.println();
        System.out.println("AIFF:");
        aiff();
        System.out.println();
        System.out.println();
        System.out.println("WAV:");
        wav();
        System.out.println();
        System.out.println();
        System.out.println("AAC:");
        aac();
        System.out.println();
        System.out.println();
        System.out.println("MP3:");
        mp3();
    }

    private static void wma() {
        final String arquivo = "musica.wma";
        testar(arquivo);
    }

    private static void aiff() {
        final String arquivo = "musica.aiff";
        testar(arquivo);
    }

    private static void wav() {
        final String arquivo = "musica.wav";
        testar(arquivo);
    }

    private static void aac() {
        final String arquivo = "musica.aac";
        testar(arquivo);
    }

    private static void mp3() {
        final String arquivo = "musica.mp3";
        testar(arquivo);
    }

    private static void testar(String arquivo) {
        FormatoAudio dj = FormatoAudioFactory.getFormatoAudio(arquivo);
        dj.reproduzir();
        dj.avancar(20);
        dj.pausar();
        dj.reproduzir();
        dj.retornar(25);
        dj.parar();
        dj.reproduzir();
        dj.parar();
        dj.liberar();

        System.out.println("");
        System.out.println("Reproduzir (facade):");
        FormatoAudioFacade.reproduzirFacade(arquivo);
        System.out.println("Parar (facade):");
        FormatoAudioFacade.pararFacade();
    }
}
