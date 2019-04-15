
public final class Cachorro extends Animal{
	
	public Cachorro(String nome) {
		super(nome);
	}

	@Override 
	public void emitirSom() {
		System.out.println("AU AU AU");
	}
}
