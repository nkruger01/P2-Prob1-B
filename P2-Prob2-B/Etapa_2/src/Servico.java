package Etapa_2.src;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author natha
 */
public class Servico implements Observer {
	
	Observable conta;
	private String servico;
	
	public Servico(Observable conta, String servico) {
		this.conta = conta;
		this.servico = servico;
		this.conta.addObserver(this);
	}

	public Observable getConta() {
		return conta;
	}

	public void setConta(Observable conta) {
		this.conta = conta;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	@Override
	public void update(Observable observable, Object obj) {
		System.out.println("Uma conta foi adicionada");		
	}

	public String analiseInvestimento(Cliente cliente, ContaCorrente conta) {
        String saida = "Cliente: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + "\n"
                + "Agência: " + conta.getAgencia() + ". /n"
                + "Serviço: Analise de Investimento";
        return saida;
    }

    public String ofertaFinanciamento(Cliente cliente, ContaCorrente conta) {
        String saida = "Cliente: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + "\n"
                + "Agência: " + conta.getAgencia() + ". /n"
                + "Serviço: Oferta de Investimento";
        return saida;
    }

    public String notificacaoSaque(ContaCorrente conta, Cliente cliente) {
        return "Isto é uma operação de Saque!" + "/n "
                + "Nome: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + " " + conta.getAgencia() + "/n";

    }

    public String notificacaoTransferencia(ContaCorrente conta, Cliente cliente) {
        return "Isto é uma operação de Transferencia!" + "/n "
                + "Nome: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + " " + conta.getAgencia() + "/n";
    }

    public String notificacaoDeposito(ContaCorrente conta, Cliente cliente) {
        return "Isto é uma operação de depósito!" + "/n "
                + "Nome: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + " " + conta.getAgencia() + "/n";
    }

    public String ofertaFinanciamento(ContaCorrente conta, Cliente cliente) {
        return "Isto é uma oferta de financiamento!" + "/n "
                + "Nome: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + " " + conta.getAgencia() + "/n";
    }

    public String analiseInvestimento(ContaCorrente conta, Cliente cliente) {
        return "Isto é uma analise de investimento" + "/n "
                + "Nome: " + cliente.getNome() + "/n"
                + "Conta: " + conta.getNumero() + " " + conta.getAgencia() + "/n";
    }

	

}
