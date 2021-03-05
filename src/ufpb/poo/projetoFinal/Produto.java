package ufpb.poo.projetoFinal;

import javax.swing.JTextField;



public class Produto {

	private String nomeProduto;
	private String codigoDeBarra;
	private double preco;
	

	public Produto(String nomeProduto, String codigoDeBarra, double preco) {
		this.nomeProduto = nomeProduto;
		this.codigoDeBarra = codigoDeBarra;
		this.preco = preco;
		
	}

      

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	

   @Override
	public String toString() {
		return  "Nome: "+nomeProduto + "\n"+"CODIGO DE BARRA: " + codigoDeBarra + "\n" +"VALOR: "+ preco  ;
	}

}

