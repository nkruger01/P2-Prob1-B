package src.p2.prob1.b.adapter;

import src.p2.prob1.b.FormatoAudio;
import src.problema1.AIFFSuperPlayer;

import java.security.InvalidParameterException;

public class FormatoAudioAiffAdapter implements FormatoAudio {

    public FormatoAudioAiffAdapter(String arquivo) {
        abrir(arquivo);
    }

    private AIFFSuperPlayer reprodutor;

    @Override
    public void abrir(String arquivo) {
        if (arquivo == null) {
            throw new InvalidParameterException("Nome de arquivo de audio INVÃ�LIDO!");
        }

        reprodutor = new AIFFSuperPlayer(arquivo);
    }

    @Override
    public void reproduzir() {
        reprodutor.play();
    }

    @Override
    public void pausar() {
        reprodutor.pause();
    }

    @Override
    public void parar() {
        reprodutor.stop();
        reprodutor.setCursor(0);
    }

    @Override
    public void avancar(int segundos) {
        reprodutor.setCursor(reprodutor.pause() + segundos);
        reprodutor.play();
    }

    @Override
    public void retornar(int segundos) {
        final int localizacaoAtual = reprodutor.pause();
        reprodutor.setCursor(localizacaoAtual - segundos);
        reprodutor.play();
    }

    @Override
    public void liberar() {
        reprodutor.release();
    }
}
