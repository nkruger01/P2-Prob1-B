package Etapa_2;

public class AACPlayer implements Facade{
	
	private String nomeArquivo;

	//Métodos nativos
	
	public AACPlayer(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void play() {
		System.out.println("Metodo da classe");
	}

	public void open(){
		play();
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

	
}
