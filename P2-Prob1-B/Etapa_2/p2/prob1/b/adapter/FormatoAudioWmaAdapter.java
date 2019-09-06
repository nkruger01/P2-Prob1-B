package Etapa_2.p2.prob1.b.adapter;

import Etapa_2.p2.prob1.b.FormatoAudio;
import Etapa_2.problema1.wmaPlay;

import java.security.InvalidParameterException;

/**
 * Adpter para manuseio de um arquivo de audio com o formato <code>wma</code>.
 */
public class FormatoAudioWmaAdapter implements FormatoAudio {

    public FormatoAudioWmaAdapter(String arquivo) {
        abrir(arquivo);
    }

    /**
     * Reprodutor do formato <code>wma</code>.
     */
    private wmaPlay reprodutorWma = new wmaPlay();

    /**
     * LocalizaÃ§Ã£o atual da reproduÃ§Ã£o do arquivo (em segundos).
     */
    private Integer localizaoAudioAuxiliar = 0;

    /**
     * @see FormatoAudio#abrir(java.lang.String)
     */
    @Override
    public void abrir(String arquivo) {
        if (arquivo == null) {
            throw new InvalidParameterException("Nome de arquivo de audio INVÃ�LIDO!");
        }
        if (reprodutorWma == null) {
            reprodutorWma = new wmaPlay();
        }

        reprodutorWma.setFile(arquivo);
        reprodutorWma.open();
    }


    @Override
    public void reproduzir() {
        reprodutorWma.setLocation(localizaoAudioAuxiliar);
        reprodutorWma.play();
    }

    
    @Override
    public void pausar() {
        reprodutorWma.stop();
        localizaoAudioAuxiliar = reprodutorWma.getLocation();
    }


    @Override
    public void parar() {
        reprodutorWma.stop();
        reprodutorWma.setLocation(0);
        localizaoAudioAuxiliar = 0;
    }

    @Override
    public void avancar(int segundos) {
        reprodutorWma.setLocation(reprodutorWma.getLocation() + segundos);
    }

    @Override
    public void retornar(int segundos) {
        reprodutorWma.setLocation(reprodutorWma.getLocation() - segundos);
    }

    @Override
    public void liberar() {
        reprodutorWma = null;
        System.gc();
    }
}
