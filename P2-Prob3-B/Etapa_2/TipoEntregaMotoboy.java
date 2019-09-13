package Etapa_2;

public class TipoEntregaMotoboy implements CalculoEntrega{

	@Override
	public double CalculaValorEntrega(Pedido pedido) {
		if (pedido.getPesoTotalPedido() <= 25000 && pedido.getQuantidadeProdutos() <= 30) {
			return 7;
		}
		return 0;
	}

}
