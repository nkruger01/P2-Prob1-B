/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author natha
 */
public class MP3DJ {
    
    public int tempo;
    public String arquivo;
    
    public void setFile(String nomeArquivo) {
        this.arquivo = nomeArquivo;
        System.out.println("Arquivo pronto para execução... Nome: " + nomeArquivo);
    }
    
     public void play() {
        System.out.println("Reproduzindo arquivo a partir do tempo: " + tempo);
    }

    public void stop() {
        System.out.println("Arquivo parado");
    }

    public int forward(int tempo) {
        int resultado = this.tempo += tempo;
        return resultado;
    }

    public int reward(int tempo) {
        int resultado = this.tempo -= tempo;
        return resultado;
    }
}
