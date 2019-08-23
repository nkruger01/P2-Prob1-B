package Etapa_2;

public class WAVPlayer implements FormatoAudio{

	boolean emExecucao = false;
	
	@Override
	public void abrir(String nomeArquivo) {
		System.out.println("O nome do arquivo para abrir � " + nomeArquivo);
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
	public void parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avancar(int tempo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retornar(int tempo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}
	
	//M�todos nativos

	public void WAVPlayer(String nomeArquivo){
		abrir(nomeArquivo);
	}
	
	public void play(){
		System.out.println("Iniciando a reprodu��o do ponto pausado");
	}
	
	public void stop(){
		System.out.println("Execu��o parada");
		this.emExecucao = false;
	}
	
	public int forward(int milissegundos){
		System.out.println("M�sica pulada em " + milissegundos + " milessegundos");
		return milissegundos;
	}
	
	public int reward(int milissegundos){
		System.out.println("M�sica retrocedida em " + milissegundos + " milessegundos");
		return milissegundos;
	}
	
	public void finalize(){
		stop();
		System.out.println("Arquivo liberado da mem�ria");
	}

}
