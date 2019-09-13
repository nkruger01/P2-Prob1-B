package teste.Etapa_2;

public class TipoEntregaPAC implements CalculoEntrega {

	@Override
	public double CalculaValorEntrega(Pedido pedido) {
		//Pedido pedido = new Pedido();
		try {
			if (pedido.getPesoTotalPedido() <= 1000) {
				return 10;
			} else if (pedido.getPesoTotalPedido() > 1000 && pedido.getPesoTotalPedido() <= 2000) {
				return 15;
			} else if (pedido.getPesoTotalPedido() > 2000 && pedido.getPesoTotalPedido() <= 3000) {
				return 20;
			} else if (pedido.getPesoTotalPedido() > 3000 && pedido.getPesoTotalPedido() <= 5000) {
				return 30;
			} else if (pedido.getPesoTotalPedido() > 5000) {
				throw new TipoEntregaInvalidoException("Peso total do pedido excedido!");
			}

		} catch (TipoEntregaInvalidoException e) {
			e.printStackTrace();
		}

		return 0;

	}

}
