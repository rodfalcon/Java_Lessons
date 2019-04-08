import java.util.ArrayList;

public class Aluno {
	private String nome, ra;
	private ArrayList<Disciplina> ds;

	public Aluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;
		this.ds = new ArrayList<Disciplina>();
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: "   + ra);
	}
	
	public void adicionarDisciplina(Disciplina d) {
		if(d != null && !ds.contains(d))
			ds.add(d);
		else
			System.out.println("Erro");
	}
	
	public void removerDisciplina(Disciplina d) {
		if(d != null && ds.contains(d))
			ds.remove(d);
		else
			System.out.println("Erro");
	}
	
	public void listarDisciplina() {
		System.out.println("Aluno: " + nome);
		for(Disciplina d : ds) {
			System.out.println(d.getNome());
		}
	}
	
}
