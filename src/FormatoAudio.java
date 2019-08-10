
public interface FormatoAudio {

	public void Abrir(String nomeArquivo);
	public void Reproduzir();
	public void Pausar();
	public void Parar();
	public void Avancar(int tempo);
	public void Retornar(int tempo);
	public void Liberar();
	
}