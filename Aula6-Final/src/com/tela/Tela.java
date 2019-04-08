package com.tela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.curso.Aluno;
import com.curso.Curso;
import com.curso.TipoCurso;
import com.erro.AlunoException;

public class Tela {
	
	private static BufferedReader br 
		= BufferedFactory.getBF();
	
	public static void menuAluno(Curso c) throws IOException, AlunoException {
		System.out.println("Digite um nome: ");
		String nome = br.readLine();
		System.out.println("Digite o RA: ");
		String ra = br.readLine();
		System.out.println("Digite uma cidade: ");
		String cidade = br.readLine();
		c.inserir(new Aluno(nome,ra,cidade));
	}
	
	public static void menuCidade(Curso c) throws IOException {
		System.out.println("Digite uma cidade: ");
		String digitada = br.readLine();
		c.listarPorCidade(digitada);
	}
	
	public static void opcoes() {
		System.out.println("---- SIGA -----");
		System.out.println("1. Cadastrar Aluno");
		System.out.println("2. Listar");
		System.out.println("3. Listar por cidade");
		System.out.println("4. Sair");
		System.out.println("----------------");
	}
	
	public static void menu(Curso c) throws IOException, AlunoException {
		int digitada = -1;
		while(digitada != 4) {
			opcoes();
			digitada = Integer.parseInt(br.readLine());
			switch(digitada) {
				case 1:
					menuAluno(c);
					break;
				case 2: 
					c.listarTodos();
					break;
				case 3:
					menuCidade(c);
					break;
				case 4:
					System.out.println("Fim!");
					break;
				default:
					System.out.println("Erro");
			}
		}
		
	}
	//TRY-Catch : ERRO RESOLVIDO NA HORA
	//Throws : ERRO RESOLVIDO DEPOIS, OU SEJA, QUEM
	//CHAMA ESTE METODO QUE SE VIRE.
	public static void telaPrincipal() throws IOException, AlunoException {
		System.out.println("Digite um Curso");
		String digitada = br.readLine();
		TipoCurso tc = null; 
		try {
			tc = TipoCurso.valueOf(digitada);
		}catch(IllegalArgumentException e) {
			System.out.println("Curso inexistente, ASSUMIDO ADS");
			tc = TipoCurso.ADS;
		}
		Curso c = new Curso(tc);
		menu(c);
	}
}
