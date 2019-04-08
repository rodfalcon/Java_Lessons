package urna;

public class Candidato {
	private String nome;
	private int numero, qtd_voto;
	private Partido partido;
	
	public Candidato(String nome, int numero, int qtd_voto, Partido partido) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.qtd_voto = qtd_voto;
		this.partido = partido;
	}
	public int getNumero() {
		return numero;
	}
	public int getQtd_voto() {
		return qtd_voto;
	}
	public Partido getPartido() {
		return partido;
	}
	public void votar() {
		qtd_voto++;
	}
	public void mostrar_info() {
		System.out.println(nome);
		System.out.println(qtd_voto);
		System.out.println(partido);
		System.out.println(numero);

	}
	
	
	
	
}
