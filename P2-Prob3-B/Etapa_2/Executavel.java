package Etapa_2;

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
		
		Pedido pedido2 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", "LEX");
		pedido.incluirItem(lapis, 350);
		pedido.incluirItem(grampeador, 500);
		
		Pedido pedido3 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", "Motoboy");
		pedido.incluirItem(lapis, 350);
		pedido.incluirItem(grampeador, 500);
		
		System.out.println("Valor dos Produtos pedido: R$ " + pedido.getValorPedido());
		System.out.println("Valor Entrega pedido: R$ " + pedido.getValorEntrega());
		
		System.out.println("Valor dos Produtos pedido1: R$ " + pedido1.getValorPedido());
		System.out.println("Valor Entrega1 pedido1: R$ " + pedido1.getValorEntrega());
		
		System.out.println("Valor dos Produtos pedido2: R$ " + pedido1.getValorPedido());
		System.out.println("Valor Entrega pedidos2: R$ " + pedido1.getValorEntrega());
		
		System.out.println("Valor dos Produtos pedido 3: R$ " + pedido3.getValorPedido());
		System.out.println("Valor Entrega pedidos 3: R$ " + pedido3.getValorEntrega());
		
	}
	

}
