
public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("MAURICIO","0050481620032");
		Aluno a2 = new Aluno("RAFAEL L","0050481713030");
		Disciplina d = new Disciplina("Programa��o Orientada a Objetos");
		Disciplina d2 = new Disciplina("Programa��o para Mainframe");
		d.matricular(a1);
		d.matricular(null);
		d.matricular(a2);
		d.matricular(a2);
		d.matricular(a2);
		d2.matricular(a2);
		d.listagem();
		a2.listarDisciplina();
	}

}
