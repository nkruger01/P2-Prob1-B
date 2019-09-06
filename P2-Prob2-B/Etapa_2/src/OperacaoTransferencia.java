package Etapa_2.src;

import java.util.Date;

public class OperacaoTransferencia extends Operacao{
	
    private ContaCorrente contaCorrente;
            
    public OperacaoTransferencia() {
    
	}

	public OperacaoTransferencia(double valor, double saldoAnterior, ContaCorrente conta, Date data, TipoOperacao tipo,
			ContaCorrente contaCorrente) {
		super(valor, saldoAnterior, conta, data, tipo);
		this.contaCorrente = contaCorrente;
	}

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

}
