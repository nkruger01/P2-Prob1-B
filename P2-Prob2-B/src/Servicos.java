/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author natha
 */
public class Servicos {

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
