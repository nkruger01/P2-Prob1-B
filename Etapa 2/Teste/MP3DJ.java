package Teste;

public class MP3DJ implements AudioAdapter {

	private String nomeArquivo;

	// Métodos nativos
	public MP3DJ(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String setFile() {
		return this.nomeArquivo;
	}

	public int forward(int segundos) {
		System.out.println("Música pulada em " + segundos + " segundos");
		return segundos;
	}

	public int reward(int segundos) {
		System.out.println("Música retrocedida em " + segundos + " segundos");
		return segundos;
	}

}
