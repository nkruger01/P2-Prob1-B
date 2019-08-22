package Teste;

public class WAVPlayer implements AudioAdapter {

	boolean emExecucao = false;

	@Override
	public void abrir(String nomeArquivo) {
		System.out.println("O nome do arquivo para abrir é " + nomeArquivo);
		reproduzir();
	}

	@Override
	public void reproduzir() {
		this.emExecucao = true;
		play();
	}
	
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	// Métodos nativos

	public void WAVPlayer(String nomeArquivo) {
		abrir(nomeArquivo);
	}

	public void play() {
		System.out.println("Iniciando a reprodução do ponto pausado");
	}

	public void stop() {
		System.out.println("Execução parada");
		this.emExecucao = false;
		pausar();
	}

	public int forward(int segundos) {
		avancar(segundos);
		return segundos;
	}

	public int reward(int segundos) {
		retornar(segundos);
		return segundos;
	}

	protected void finalize() {
		liberar();
		System.out.println("Arquivo liberado da memória");
	}

}
