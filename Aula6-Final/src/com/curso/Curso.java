package com.curso;

import java.util.ArrayList;

import com.erro.AlunoException;

public class Curso {
	private TipoCurso tipo;
	private ArrayList<Aluno> alunos;
	
	public Curso(TipoCurso tipo) {
		this.tipo = tipo;
		//TEMOS 0 Aluno.
		alunos = new ArrayList<Aluno>();
	}
	
	public void inserir(Aluno aluno) throws AlunoException {
		if(aluno != null && !alunos.contains(aluno))
			alunos.add(aluno);
		else 
			throw new AlunoException();
	}
	
	public void listarTodos() {
		for(Aluno aluno : alunos) {
			aluno.mostrarDados();
		}
	}
	
	public void listarPorCidade(String cidade) {
		for(Aluno aluno : alunos) {
			if(cidade.equals(aluno.getCidade())) {
				aluno.mostrarDados();
			}
		}
	}
}




