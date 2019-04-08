package com.produtos;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Produto> produtos;
	
	public Loja() {
		produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto p) {
		if(p!= null && !produtos.contains(p))
			produtos.add(p);
		else
			System.out.println("Erro");
	}
	
	public void mostrarTodos() {
		for(Produto p : produtos)
			p.mostrarDados();
	}
	
	public double maiorDigital() {
		//PEGO O PRECO DO PRIMEIRO PRODUTO
		double aux = produtos.get(0).getPreco();
		for(Produto p : produtos)
			if(p.getTipo() == TipoProduto.DIGITAL)
				aux = Math.max(aux, p.getPreco());
		return aux;
	}
	
	
	
	
	
	
	
}
