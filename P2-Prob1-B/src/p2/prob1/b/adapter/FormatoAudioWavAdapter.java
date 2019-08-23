package p2.prob1.b.adapter;

import p2.prob1.b.FormatoAudio;
import problema1.WAVPlayer;

import java.security.InvalidParameterException;

public class FormatoAudioWavAdapter implements FormatoAudio {

    public FormatoAudioWavAdapter(String arquivo) {
        abrir(arquivo);
    }

    private WAVPlayer reprodutor;

    @Override
    public void abrir(String arquivo) {
        if (arquivo == null) {
            throw new InvalidParameterException("Nome de arquivo de audio INVÁLIDO!");
        }

        reprodutor = new WAVPlayer(arquivo);
    }

    @Override
    public void reproduzir() {
        reprodutor.play();
    }

    @Override
    public void pausar() {
        reprodutor.stop();
    }

    @Override
    public void parar() {
        reprodutor.stop();
        reprodutor.reward(reprodutor.reward(0));
    }

    @Override
    public void avancar(int segundos) {
        reprodutor.forward(segundos * 1000);
    }

  
    @Override
    public void retornar(int segundos) {
        reprodutor.reward(segundos * 1000);
    }

   
    @Override
    public void liberar() {
        reprodutor = null; 
        System.gc();
    }
}
