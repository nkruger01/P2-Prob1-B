package Etapa_2;

public class MP3DJ implements FormatoAudio{
	
	private boolean emExecucao;
	private String nomeArquivo;
	
	@Override
	public void abrir(String nomeArquivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		
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

	
	//Métodos nativos
	public MP3DJ(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public String setFile(){
		return this.nomeArquivo;
	}

	public void play(){
		System.out.println("Iniciando a reprodução do ponto pausado");
	}
	
	public void stop(){
		System.out.println("Execução parada");
		this.emExecucao = false;
	}
	
	public int forward(int milissegundos){
		System.out.println("Música pulada em " + milissegundos + " milessegundos");
		return milissegundos;
	}
	
	public int reward(int milissegundos){
		System.out.println("Música retrocedida em " + milissegundos + " milessegundos");
		return milissegundos;
	}
	
	
	
	
	
	
	
	
	
	
}
