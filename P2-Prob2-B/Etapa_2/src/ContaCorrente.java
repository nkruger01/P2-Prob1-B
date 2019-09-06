package Etapa_2.src;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Observable;

public class ContaCorrente extends Observable{

    private int numero;
    private int agencia;
    private Cliente cliente;
    private double saldo;
    private double investimento;
    private ArrayList<Operacao> operacoes = new ArrayList<Operacao>();
    private ArrayList<Servico> servicos = new ArrayList<Servico>();
    
    public void adicionarServico(Servico servico){    	
    	servicos.add(servico);
    	setChanged();
        notifyObservers();    	
    }

    public void sacar(double valor) {
    	
    	if(getSaldo() >= valor){
    		System.out.println("Cliente " + this.cliente.nome + " sacou R$ " + valor + " da conta " + this.numero);
    	}else{
    		System.out.println("Valor excede o saldo em conta");
    	}

    }

    public void depositar(double valor) {
        
    	this.saldo = this.getSaldo() + valor;
    	System.out.println("Cliente " + this.cliente.nome + " depositou R$ " + valor + " na conta " + this.numero);
    	
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
    	
    	if(getSaldo() >= valor){
    		this.saldo = this.getSaldo() - valor;
    		contaDestino.saldo = contaDestino.getSaldo() + valor;
    		System.out.println("Cliente " + this.cliente.nome + " depositou R$ " + valor + " na conta " + contaDestino.getNumero());
    	}else{
    		System.out.println("Valor da tranferência excede o saldo em conta");
    	}
    	
    }
    
    //==================================================================//
    //==================================================================//
    public ContaCorrente(){    	
    }
    
    public ContaCorrente(Cliente cliente, int numero, int agencia, double saldo, double investimento) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}

    
    
}
