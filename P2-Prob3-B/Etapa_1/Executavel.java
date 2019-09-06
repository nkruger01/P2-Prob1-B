package Etapa_1;

import java.util.Date;

public class Executavel {
	
	public static void main(String args[]){
		
		Produto lapis = new Produto("Lapís", 3.50, 1);
		Produto grampeador = new Produto("Grampeador", 10, 2);
		
		Pedido pedido = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", "SEDEX");
		pedido.incluirItem(lapis, 100);
		pedido.incluirItem(grampeador, 200);
		
		System.out.println("Valor dos Produtos: R$ " + pedido.getValorPedido());
		System.out.println("Valor Entrega: R$ " + pedido.getValorEntrega());
		
		
	}

}
