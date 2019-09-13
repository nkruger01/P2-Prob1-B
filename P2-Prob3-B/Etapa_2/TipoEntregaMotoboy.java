package Etapa_2;

public class TipoEntregaMotoboy implements CalculoEntrega{

	public double CalculaValorEntrega(Pedido pedido) throws TipoEntregaInvalidoException {
		if (pedido.getPesoTotalPedido() <= 25000 && pedido.getQuantidadeProdutos() <= 30) {
			return 7;
		}else{
			throw new TipoEntregaInvalidoException();
		}		
	}

}
