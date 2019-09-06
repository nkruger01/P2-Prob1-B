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
public class wmaPlay {

    public String arquivo;
    public int tempo;

    public void setFile(String nomeArquivo) {
        this.arquivo = nomeArquivo;
        System.out.println("Abrindo arquivo... Nome: " + nomeArquivo);
        open();
    }

    public void open() {
        System.out.println("Arquivo aberto com sucesso!");
    }

    public int getLocation() {
        return this.tempo;
    }

    public void setLocation(int tempo) {
        this.tempo = tempo;
    }

    public void play() {
        System.out.println("Reproduzindo arquivo a partir do tempo: " + tempo);
    }

    public void stop() {
        System.out.println("Arquivo parado");
    }
}
