package Etapa_1.src;

import java.util.Calendar;

public class ContaCorrente {

    private int numero;
    private int agencia;
    private Cliente cliente;
    private int saldo;
    private int investimento;
    private String[] tipoServicos;

    public Operacao sacar(int valor) {
        String str = "";

        if (saldo >= valor) {
            Operacao operacao = new Operacao();
            operacao.setValor(valor);
            operacao.setSaldoAnterior(saldo);
            operacao.setTipo(TipoOperacao.SAIDA);
            operacao.setConta(this);
            operacao.setData(Calendar.getInstance().getTime());
            this.saldo = saldo - valor;
            str = "Saque realizado. Saldo atual: " + saldo;

//            for(int i = 0; i > tipoServicos.length-1; i++){
//                str += tipoServicos[i] + "/n";
//            }
            return operacao;
        } else if ((investimento + saldo) >= valor) {
            investimento = investimento + saldo;
            saldo = 0;
            investimento = investimento - valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        return null;
    }

    public Operacao depositar(int valor) {
        String str = "";

        Operacao operacao = new Operacao();
        operacao.setValor(valor);
        operacao.setSaldoAnterior(saldo);
        operacao.setTipo(TipoOperacao.ENTRADA);
        operacao.setConta(this);
        operacao.setData(Calendar.getInstance().getTime());
        this.saldo = saldo + valor;
        str = "Depósito realizado. Saldo atual: " + saldo;

//        for(int i = 0; i > tipoServicos.length; i++){
//                str += tipoServicos[i] + "/n";
//        }
        return operacao;
    }

    public OperacaoTransferencia transferir(int valor, ContaCorrente contaDestino) {
        String str = "";

        if (saldo >= valor) {
            OperacaoTransferencia opTrans = new OperacaoTransferencia();
            opTrans.setContaPartida(this);

            opTrans.setValor(valor);
            opTrans.setSaldoAnterior(saldo);
            opTrans.setTipo(TipoOperacao.SAIDA);
            opTrans.setConta(this);
            opTrans.setData(Calendar.getInstance().getTime());

            setSaldo(saldo - valor);
            receberTransferencia(valor, contaDestino);
            str = "Transferencia realizada. Saldo atual: " + saldo;

//        for(int i = 0; i > tipoServicos.length; i++){
//                str += tipoServicos[i] + "/n";
//        }
            return opTrans;
        } else if ((investimento + saldo) >= valor) {
            investimento = investimento + saldo;
            saldo = 0;
            investimento = investimento - valor;
        } else {
            throw new IllegalArgumentException("Valores inválidos.");
        }

        return null;
    }

    public OperacaoTransferencia receberTransferencia(int valor, ContaCorrente destino) {
        String str = "";
        
        OperacaoTransferencia opTrans = new OperacaoTransferencia();
        opTrans.setContaPartida(this);
        opTrans.setValor(valor);
        opTrans.setSaldoAnterior(destino.getSaldo());
        opTrans.setTipo(TipoOperacao.ENTRADA);
        opTrans.setConta(destino);
        opTrans.setData(Calendar.getInstance().getTime());

        destino.setSaldo(destino.getSaldo() + valor);
        str = "Transferencia recebida. Saldo atual: " + saldo;

//        for(int i = 0; i > tipoServicos.length; i++){
//                str += tipoServicos[i] + "/n";
//        }
        return opTrans;
    }

    public ContaCorrente(Cliente cliente, int numero, int agencia, int saldo, int investimento) {
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.investimento = investimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
