
public final class Gato extends Animal{
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override 
	public void emitirSom() {
		System.out.println("MIAU MIAU");
	}
	
	//CONVERTE UM OBJETO PARA UMA STRING.
	@Override
	public String toString() {
		return "UM GATO AI";
	}
}
