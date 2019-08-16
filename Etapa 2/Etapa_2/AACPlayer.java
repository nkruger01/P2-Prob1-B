package Etapa_2;

public class AACPlayer implements FormatoAudio{
	
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
	
	public AACPlayer(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public void open(){
		abrir(this.nomeArquivo);
	}
	
	public String setFile(){
		return this.nomeArquivo;
	}	
	
	public void setLocation(int posicaoArquivo) {
		if (posicaoArquivo < 0) {
			throw new IllegalArgumentException("Posição inválida!");
		}else if(posicaoArquivo == 0){
			System.out.println("O arquivo iniciará a partir do início: "+ posicaoArquivo);
		}
		System.out.println("O arquivo iniciará a partir de: "+ posicaoArquivo);
	}
	
	public void getLocation(){
		int segundoIndicado = 0;
		System.out.println("A reprodução está no segundo: " + segundoIndicado);
	}
	
	public void play(){
		open();
		setLocation(0);
	}
	
	public void stop(){
		parar();
		System.out.println("Pausando o arquivo");
	}
	
}
