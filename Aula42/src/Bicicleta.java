
public class Bicicleta {
	private String modelo;
	private Pneu p1, p2;
	
	public Bicicleta(String modelo) {
		this.modelo = modelo;
		p1 = new Pneu(Pneu.MAXIMO);
		p2 = new Pneu(Pneu.MAXIMO);
	}
	
	public void acelerar() {
		if (p1 != null && p2 != null) {
			if(p1.boasCondicoes() && p2.boasCondicoes()) {
				p1.esvaziar();
				p2.esvaziar();
			}else {
				System.out.println("UM OU MAIS PNEUS EM MÁS CONDICOES");
			}
		}else {
			System.out.println("Falta um ou mais pneu(s)");
		}
	}
	
	public void mostrarStatus() {
		System.out.println(modelo);
		p1.verStatus();
		p2.verStatus();
	}
	
	public void encherPneu1(int pressao) {
		p1.encher(pressao);
	}
	
	public void encherPneu2(int pressao) {
		p2.encher(pressao);
	}
	
	
	
	
}
