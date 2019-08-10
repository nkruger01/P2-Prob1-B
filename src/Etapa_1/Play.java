package Etapa_1;

public class Play implements FormatoAudio{

	
	public void setFile(String nomeArquivo) {
		System.out.println("O nome do arquivo utilizado é: " + nomeArquivo);
	}
	public void setLocation(int posicaoArquivo) {
		if (posicaoArquivo < 0) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		System.out.println("O arquivo iniciará a partir de: "+ posicaoArquivo);
	}

	@Override
	public void Abrir(String nomeArquivo) {
		setFile(nomeArquivo);		
	}

	@Override
	public void Reproduzir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Parar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Avancar(int tempo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Retornar(int tempo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Liberar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
