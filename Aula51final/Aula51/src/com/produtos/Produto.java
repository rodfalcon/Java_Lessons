package com.produtos;

public class Produto {
	private String nome;
	private double preco;
	private TipoProduto tipo;
	
	public Produto(String nome, double preco, TipoProduto tipo) {
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public TipoProduto getTipo() {
		return tipo;
	}
	
	public void mostrarDados() {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(tipo);
	}
	
}
