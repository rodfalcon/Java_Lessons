package informa_faculdades;

//construtor
public class Fatec {
	private String nm_curso;
	private int qtd_alunos;
	
	Fatec(){
		nm_curso = "";
		qtd_alunos = 0;
	}

	public String getNm_curso() {
		return nm_curso;
	}

	public void setNm_curso(String nm_curso) {
		this.nm_curso = nm_curso;
	}

	public int getQtd_alunos() {
		return qtd_alunos;
	}

	public void setQtd_alunos(int qtd_alunos) {
		this.qtd_alunos = qtd_alunos;
	}
	
	//onde acontece o polimorfismo
	public void mostra_curso() {
		System.out.println("Nome do curso === " + nm_curso + "\n Numero de alunos = " + qtd_alunos );
	}
	public void atualiza_aluno(int matricula) {
		qtd_alunos = qtd_alunos + matricula;
	}
}
