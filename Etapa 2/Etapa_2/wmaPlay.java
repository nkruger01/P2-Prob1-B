package Etapa_2;

public class wmaPlay implements FormatoAudio{

	@Override
	public void abrir(String nomeArquivo) {
		setFile(nomeArquivo);		
	}
	
	public void setFile(String nomeArquivo) {
		System.out.println("O nome do arquivo utilizado é: " + nomeArquivo);
		open();
	}
	
	public void setLocation(int posicaoArquivo) {
		if (posicaoArquivo < 0) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		System.out.println("O arquivo iniciará a partir de: "+ posicaoArquivo);
	}
	
	public void getLocation(){
		int segundoIndicado = 0;
		System.out.println("A reprodução está no segundo: " + segundoIndicado);
	}
	
	public void open(){
		System.out.println("Abrindo o arquivo carregado");
	}
	
	public void play(){
		reproduzir();
		System.out.println("Reproduzindo o arquivo. Iniciando no segundo: ");
	}
	
	public void stop(){
		parar();
		System.out.println("Pausando o arquivo");
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

}
