package Etapa_2;

public class AACPlayer implements Facade{
	
	private String nomeArquivo;

	//M�todos nativos
	
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
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}else if(posicaoArquivo == 0){
			System.out.println("O arquivo iniciar� a partir do in�cio: "+ posicaoArquivo);
		}
		System.out.println("O arquivo iniciar� a partir de: "+ posicaoArquivo);
	}
	
	public void getLocation(){
		int segundoIndicado = 0;
		System.out.println("A reprodu��o est� no segundo: " + segundoIndicado);
	}

	
}
