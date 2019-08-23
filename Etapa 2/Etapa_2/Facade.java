package Etapa_2;

public interface Facade {

	public default void play(){
		System.out.println("Reproduzindo o arquivo. Iniciando no segundo: ");
	}
	
	public static void stop(){
		System.out.println("Pausando o arquivo");
	}
	
	
}
