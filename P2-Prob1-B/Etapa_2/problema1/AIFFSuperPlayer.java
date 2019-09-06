/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etapa_2.problema1;

/**
 *
 * @author natha
 */
public class AIFFSuperPlayer {

    public String arquivo;
    public int tempo;

    public AIFFSuperPlayer(String arquivo) {
        this.arquivo = arquivo;
    }

    public void play() {
        System.out.println("Reproduzindo arquivo a partir do tempo: " + tempo);
    }

    public void stop() {
        System.out.println("Arquivo parado. \n Tempo retornado para o início. \n É necessário definir uma nova posição no arquivo para executar novamente a música.");
    }

    public int pause() {
        System.out.println("Arquivo pausado em: " + tempo);
        return tempo;
    }

    public void setCursor(int i) {
        this.tempo = i;
    }

    public void release() {
        stop();
        System.out.println("Arquivo fechado. Memória liberada.");
    }

}
