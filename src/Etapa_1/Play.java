package Etapa_1;

public class Play implements FormatoAudio{

	
	public void setFile(String nomeArquivo) {
		System.out.println("O nome do arquivo utilizado é: " + nomeArquivo);
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
