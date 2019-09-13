package Etapa_2.p2.prob1.b;

/**
 * Interface responsável por definir a assinatura dos métodos para manipulação
 * de um arquivo de audio.
 */
public interface FormatoAudio {

    void abrir(String arquivo);

    void reproduzir();

    void pausar();

    void parar();

    void avancar(int segundos);

    void retornar(int segundos);

    void liberar();
}
