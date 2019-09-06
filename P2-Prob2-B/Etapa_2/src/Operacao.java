package Etapa_2.src;

import java.util.Date;

public class Operacao {
    public double valor;
    public double saldoAnterior;
    public ContaCorrente conta;
    public Date data;
    public TipoOperacao tipo;
    
    
    
    public Operacao() {
		
	}

	public Operacao(double valor, double saldoAnterior, ContaCorrente conta, Date data, TipoOperacao tipo) {
		this.valor = valor;
		this.saldoAnterior = saldoAnterior;
		this.conta = conta;
		this.data = data;
		this.tipo = tipo;
	}

	public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacao tipo) {
        this.tipo = tipo;
    }
    
    
    
}
