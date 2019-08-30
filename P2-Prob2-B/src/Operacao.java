
import java.util.Calendar;
import java.util.Date;

public class Operacao {
    public int valor;
    public int saldoAnterior;
    public ContaCorrente conta;
    public Date data;
    public TipoOperacao tipo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(int saldoAnterior) {
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
