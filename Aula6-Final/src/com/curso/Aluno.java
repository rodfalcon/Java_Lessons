package com.curso;

public class Aluno {
	private String nome, ra, cidade;

	public Aluno(String nome, String ra, String cidade) {
		this.nome = nome;
		this.ra = ra;
		this.cidade = cidade;
	}
	
	public void mostrarDados() {
		System.out.println(nome);
		System.out.println(ra);
		System.out.println(cidade);
	}

	public String getCidade() {
		return cidade;
	}
	
}
