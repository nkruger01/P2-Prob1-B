package Etapa_2;


public class TipoEntregaSEDEX implements CalculoEntrega {

	@Override
	public double CalculaValorEntrega(Pedido pedido) {
		//Pedido pedido = new Pedido();
			if (pedido.getPesoTotalPedido() <= 0.500) {
				return 12.50;
			} else if (pedido.getPesoTotalPedido() > 0.500 && pedido.getPesoTotalPedido() <= 0.750) {
				return 20;
			} else if (pedido.getPesoTotalPedido() > 0.750 && pedido.getPesoTotalPedido() <= 1200) {
				return 30;
			} else if (pedido.getPesoTotalPedido() > 1200 && pedido.getPesoTotalPedido() <= 2000) {
				return 45;
			} else if (pedido.getPesoTotalPedido() > 2000) {
				double resto = pedido.getPesoTotalPedido() - 2000;
				resto = resto / 100;
				return  45 + (resto * 1.50);
			}
			return 0;
		} 
	}
