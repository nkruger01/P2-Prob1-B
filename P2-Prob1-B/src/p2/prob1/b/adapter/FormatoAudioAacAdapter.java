package src.p2.prob1.b.adapter;

import src.p2.prob1.b.FormatoAudio;
import src.problema1.AACPlayer;


public class FormatoAudioAacAdapter implements FormatoAudio {

    public FormatoAudioAacAdapter(String arquivo) {
        abrir(arquivo);
    }

    
    private AACPlayer reprodutor;

  
    @Override
    public void abrir(String arquivo) {
        reprodutor = new AACPlayer(arquivo);
        reprodutor.open();
        reprodutor.setLocation(0);
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
        reprodutor.stop();
    }

  
    @Override
    public void avancar(int segundos) {
        reprodutor.setLocation(reprodutor.getLocation() + segundos);
    }

   
    @Override
    public void retornar(int segundos) {
        reprodutor.setLocation(reprodutor.getLocation() - segundos);
    }

   
    @Override
    public void liberar() {
        reprodutor = null; 
        System.gc();
    }
}