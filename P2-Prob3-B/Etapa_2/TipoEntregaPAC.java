package Etapa_2;

public class TipoEntregaPAC implements CalculoEntrega {

	public double CalculaValorEntrega(Pedido pedido) throws TipoEntregaInvalidoException {
		if (pedido.getPesoTotalPedido() <= 1000) {
			return 10;
		} else if (pedido.getPesoTotalPedido() > 1000 && pedido.getPesoTotalPedido() <= 2000) {
			return 15;
		} else if (pedido.getPesoTotalPedido() > 2000 && pedido.getPesoTotalPedido() <= 3000) {
			return 20;
		} else if (pedido.getPesoTotalPedido() > 3000 && pedido.getPesoTotalPedido() <= 5000) {
			return 30;
		} else {
			throw new TipoEntregaInvalidoException();
		}

	}

}
