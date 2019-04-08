package com.teste;
import com.siga.Aluno;
import com.siga.Disciplina;

public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("MAURICIO","0050481620032");
		Aluno a2 = new Aluno("RAFAEL L","0050481713030");
		Disciplina d = new Disciplina("Programação Orientada a Objetos");
		Disciplina d2 = new Disciplina("Programação para Mainframe");
		d.matricular(a1);
		d.matricular(a2);
		d2.matricular(a2);
		d.listagem();
		a2.listarDisciplina();
	}

}
