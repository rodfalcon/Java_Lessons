
public abstract class Animal {
	private String nome;
	
	//NAO EH ACESSADO VIA new, POIS ESTA CLASSE
	//EH ABSTRATA.
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public final void dormir() {
		System.out.println("ZZZZ");
	}
	
	public abstract void emitirSom();
}
