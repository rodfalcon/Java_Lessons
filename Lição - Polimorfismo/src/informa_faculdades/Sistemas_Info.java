package informa_faculdades;

public class Sistemas_Info extends Fatec{
	
	Fatec curso = new Fatec();
	//construtor
	public Sistemas_Info() {
		curso.mostra_curso();
		curso.setNm_curso("ADS");
		curso.setQtd_alunos(12);
		
		curso.atualiza_aluno(10);
		curso.mostra_curso();
		
		mostra_curso();
	}
	
	//onde acontece o polimorfismo
	public void mostra_curso() {
		curso.setNm_curso("Bacharel em Análise e Desenvolvimento de Sistemas");
		curso.setQtd_alunos(30);
	System.out.println("Nome do Curso = " + curso.getNm_curso() + "\nNúmerode alunos = " + curso.getQtd_alunos());	
	}

}
