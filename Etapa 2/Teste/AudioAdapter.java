package Teste;

public interface AudioAdapter extends Facade, FormatoAudio {

	public void abrir(String nomeArquivo);

	public void reproduzir();

	public void pausar();

	public void parar();

	public default void avancar(int tempo) {
		System.out.println("Música pulada em " + tempo + " segundos");
	};

	public default void retornar(int tempo){
		System.out.println("Música pulada em " + tempo + " segundos");
	};

	public void liberar();

	public default void play() {
		System.out.println("Reproduzindo o arquivo. Iniciando no segundo: ");
	}

	public static void stop() {
		System.out.println("Pausando o arquivo");
	}

}
