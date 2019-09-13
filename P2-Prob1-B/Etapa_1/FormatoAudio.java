package Etapa_1;

public interface FormatoAudio {
	
	public void abrir(String nomeArquivo);		
	public void reproduzir();	
	public void pausar();	
	public void parar();
	public void avancar(int tempo);
	public void retornar(int tempo);
	public void liberar();
	
}