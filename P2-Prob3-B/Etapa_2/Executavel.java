package Etapa_2;

import java.util.Date;

public class Executavel {
	
	public static void main(String args[]) throws TipoEntregaInvalidoException {
		Produto lapis = new Produto("Lapís", 3.50, 1);
		Produto grampeador = new Produto("Grampeador", 10, 2);
		
		TipoEntregaMotoboy motoboy = new TipoEntregaMotoboy();
		TipoEntregaNoLocal noLocal = new TipoEntregaNoLocal();
		TipoEntregaPAC pac = new TipoEntregaPAC();
		TipoEntregaSEDEX sedex = new TipoEntregaSEDEX();
		
		Pedido pedido0 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", sedex);
		pedido0.incluirItem(lapis, 100);
		pedido0.incluirItem(grampeador, 200);
		
		Pedido pedido1 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", pac);
		pedido1.incluirItem(lapis, 1000);
		pedido1.incluirItem(grampeador, 2000);
		
		Pedido pedido2 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", noLocal);
		pedido2.incluirItem(lapis, 350);
		pedido2.incluirItem(grampeador, 500);
		
		Pedido pedido3 = new Pedido(1, "Nathan Kruger", new Date(), "Ao lado da FURB", motoboy);
		pedido3.incluirItem(lapis, 350);
		pedido3.incluirItem(grampeador, 500);
		
		System.out.println("--- PEDIDO 0 ----");
		System.out.println("Valor dos Produtos pedido: R$ " + pedido0.getValorPedido());
		System.out.println("Valor Entrega pedido: R$ " + pedido0.getValorEntrega(pedido0));
		System.out.println("");
		
		System.out.println("--- PEDIDO 1 ----");
		System.out.println("Valor dos Produtos pedido1: R$ " + pedido1.getValorPedido());
		System.out.println("Valor Entrega1 pedido1: R$ " + pedido1.getValorEntrega(pedido1));
		System.out.println("");
		
		System.out.println("--- PEDIDO 2 ----");
		System.out.println("Valor dos Produtos pedido2: R$ " + pedido2.getValorPedido());
		System.out.println("Valor Entrega pedidos2: R$ " + pedido2.getValorEntrega(pedido2));
		System.out.println("");
		
		System.out.println("--- PEDIDO 3 ----");
		System.out.println("Valor dos Produtos pedido 3: R$ " + pedido3.getValorPedido());
		System.out.println("Valor Entrega pedidos 3: R$ " + pedido3.getValorEntrega(pedido3));
		
	}
	

}
