package Etapa_1;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.SwingUtilities;

public class Pedido {
	
	private int numero;
	private String nomeCLiente;
	private Date data;
	private String endereco;
	private String tipoEntrega;
	private ArrayList<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();
	
	public Pedido(int numero, String nomeCLiente, Date data, String endereco, String tipoEntrega) {
		this.numero = numero;
		this.nomeCLiente = nomeCLiente;
		this.data = data;
		this.endereco = endereco;
		this.tipoEntrega = tipoEntrega;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNomeCLiente() {
		return nomeCLiente;
	}
	
	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTipoEntrega() {
		return tipoEntrega;
	}
	
	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	public double getValorPedido(){
		
		double acumuladorValor = 0;
		
		for (int i = 0; i < itensPedidos.size(); i++) {
			ItemPedido item = itensPedidos.get(i);
			acumuladorValor += item.getQuantidade() * item.getValorItem();
		}
		
		return acumuladorValor;
		
	}
	
	public void incluirItem(Produto produto, int quantidade){
		ItemPedido item = new ItemPedido(quantidade, produto);
		itensPedidos.add(item);
	}
	
	public int getPesoTotalPedido(){

		double acumuladorPeso = 0;
		
		for (int i = 0; i < itensPedidos.size(); i++) {
			ItemPedido item = itensPedidos.get(i);
			acumuladorPeso += item.getQuantidade() * item.getProduto().getPeso();
		}
		
		int valorConvertido = (int) acumuladorPeso;
		
		return valorConvertido/1000;
		
	}
	
	public double getValorEntrega(){
		double valorEntrega = 0;
		switch (this.getTipoEntrega()) {
		case "Encomenda PAC":
			if(getPesoTotalPedido() <= 1000 ){
				valorEntrega = 10;
			}else if(getPesoTotalPedido() > 1000 && getPesoTotalPedido() <= 2000){
				valorEntrega = 15;
			}else if(getPesoTotalPedido() > 2000 && getPesoTotalPedido() <= 3000){
				valorEntrega = 20;
			}else if(getPesoTotalPedido() > 3000 && getPesoTotalPedido() <= 5000 ){
				valorEntrega = 30;
			}else if(getPesoTotalPedido() > 5000 ){
				System.out.println("-- LANÇAR EXEPTION TIPO ENTREGA INVÁLIDO");
			}
			break;
		case "SEDEX":
			if(getPesoTotalPedido() <= 0.500){
				valorEntrega = 12.50;
			}else if(getPesoTotalPedido() > 0.500 && getPesoTotalPedido() <= 0.750 ){
				valorEntrega = 20;
			}else if(getPesoTotalPedido() > 0.750 && getPesoTotalPedido() <= 1200 ){
				valorEntrega = 30;
			}else if(getPesoTotalPedido() > 1200 && getPesoTotalPedido() <= 2000 ){
				valorEntrega = 45;
			}else if(getPesoTotalPedido() > 2000 ){
				double resto = getPesoTotalPedido() - 2000;
				resto = resto / 100;
				valorEntrega = 45 + (resto * 1.50);
			}
			break;
		case "Retirada no Local":
			valorEntrega = 0;
			break;
		}
		return valorEntrega;
	}
	
	
}
