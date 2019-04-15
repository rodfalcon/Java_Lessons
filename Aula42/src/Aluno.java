
public class Aluno {
	private String nome;
	private Endereco endereco;
	private Curso curso;
	public Aluno(String nome, Endereco endereco, Curso curso) {
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
	}
	
	public void mostrarAluno() {
		System.out.println("Nome: " + nome);
		//O METODO MOSTRAR, PUBLICO, SE
		//ENCARREGA DE EXIBIR OS DADOS
		//DO ENDERECO SEM A NECESSIDADE DE
		//MANIPULACAO DIRETA DE SEUS ATRIBUTOS.
		//LOGO, O ACOPLAMENTO ENTRE Aluno e
		//Endereco eh BAIXO.
		endereco.mostrar();
		System.out.println("Curso: " + curso);
	}
	
	
}
