package Etapa_2.p2.prob1.b.facade;

import Etapa_2.p2.prob1.b.FormatoAudio;
import Etapa_2.p2.prob1.b.factory.FormatoAudioFactory;


public class FormatoAudioFacade {

    private static FormatoAudio formatoAudio;

    public static void reproduzirFacade(String arquivo) {
        formatoAudio = FormatoAudioFactory.getFormatoAudio(arquivo);
        formatoAudio.abrir(arquivo);
        formatoAudio.reproduzir();
    }

    public static void pararFacade() {
        formatoAudio.parar();
        formatoAudio.liberar();
    }
}
