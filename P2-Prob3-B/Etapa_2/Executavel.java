package teste.Etapa_2;

import java.util.Date;

public class Executavel {
	
	public static void main(String args[]) {
		
		Produto lapis = new Produto("Lapís", 3.50, 1);
		Produto grampeador = new Produto("Grampeador", 10, 2);
		
		Pedido pedido = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", "SEDEX");
		pedido.incluirItem(lapis, 100);
		pedido.incluirItem(grampeador, 200);
		
		Pedido pedido1 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", "LEX");
		pedido.incluirItem(lapis, 1000);
		pedido.incluirItem(grampeador, 2000);
		
		System.out.println("Valor dos Produtos: R$ " + pedido.getValorPedido());
		System.out.println("Valor Entrega: R$ " + pedido.getValorEntrega());
		
		System.out.println("Valor dos Produtos1: R$ " + pedido1.getValorPedido());
		System.out.println("Valor Entrega1: R$ " + pedido1.getValorEntrega());
		
		
	}
	

}
