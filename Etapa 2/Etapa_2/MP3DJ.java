package Etapa_2;

public class MP3DJ implements Facade {

	private String nomeArquivo;

	// M�todos nativos
	public MP3DJ(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String setFile() {
		return this.nomeArquivo;
	}

	public int forward(int milissegundos) {
		System.out.println("M�sica pulada em " + milissegundos + " milessegundos");
		return milissegundos;
	}

	public int reward(int milissegundos) {
		System.out.println("M�sica retrocedida em " + milissegundos + " milessegundos");
		return milissegundos;
	}

}
