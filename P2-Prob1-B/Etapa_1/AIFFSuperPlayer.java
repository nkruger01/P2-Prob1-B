package Etapa_1;

public class AIFFSuperPlayer implements FormatoAudio{
	
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

	public void AIFFSuperPlayer(String nomeArquivo){
		abrir(nomeArquivo);
	}
	
	public void play(){
		System.out.println("Iniciando a reprodu��o do ponto pausado");
	}
	
	public void stop(){
		System.out.println("Execu��o parada");
		this.emExecucao = false;
	}
	
	public void pause(){
		System.out.println("M�sica pausada");
	}
	
	public void setCursor(int posicao){
		System.out.println("Posi��o para execu��o: " + posicao);
	}
	
	public void realese(){
		if(this.emExecucao){
			stop();
			System.out.println("Arquivo liberado da mem�ria");
		}else{
			System.out.println("Arquivo liberado da mem�ria");
		}
	}

}
