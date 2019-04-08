package construção_civil;

public class Apartamento extends Construção{
	
	Construção apartamento = new Construção();
	
	Apartamento(){
		apartamento.setTipo("APARTAMENTO");
	}
	
	public void constroi() {
		System.out.println("FAZENDO ===" + apartamento.getTipo());
	}

}
