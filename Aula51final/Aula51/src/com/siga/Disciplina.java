package com.siga;
import java.util.ArrayList;

public class Disciplina {
	private String nome;
	//LISTA LINEAR LIGADA.
	private ArrayList<Aluno> alunos;
	public Disciplina(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void matricular(Aluno a) {
		//INSIRO O ALUNO NA DISCIPLINA.
		//O add N FUNCIONARIA SE TIVESSEMOS
		//Aluno[].
		if(a != null && !alunos.contains(a)) {
			a.adicionarDisciplina(this);
			alunos.add(a);
		}else
			System.out.println("Erro");
	}
	
	public void listagem() {
		//FAZ O LOOP SEM DEPENDER DE INDICES.
		//ELE EH ORIENTADO PARA ELEMENTOS E N
		//INDICES.
		//AO INVES DE USAR i inteiro PARA O LOOP
		//USAMOS, AQUI, UMA REFERENCIA DE Aluno
		//chamada aluno.
		for(Aluno aluno : alunos) {
			aluno.mostrarDados();
		}
	}
	
	public void trancar(Aluno a) {
		if(a != null && alunos.contains(a)) {
			a.removerDisciplina(this);
			alunos.remove(a);
		}else
			System.out.println("Erro");
	}

	public String getNome() {
		return nome;
	}
	
}





