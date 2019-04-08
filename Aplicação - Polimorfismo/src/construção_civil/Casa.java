package construção_civil;

public class Casa extends Construção {
	
	Construção casa = new Construção();
	
	Casa() {
		casa.setTipo("CONSTRUIR SOBRADO");
	}
	
	public void constroi() {
		System.out.println("FAZENDO ===" + casa.getTipo());
	}
	

}
