
public class Pneu {
	private int pressao;
	private boolean estaFurado;
	public final static int MAXIMO = 100;
	
	public Pneu(int pressao) {
		//SE A PRESSAO FOR NEGATIVA, DEIXEMOS EM
		// 0.
		this.pressao = Math.max(0, pressao);
		this.estaFurado = false;
	}
	
	public void verStatus() {
		System.out.println("Pressao: " + pressao);
		System.out.println("Furado: " + estaFurado);
	}
	
	public boolean boasCondicoes() {
		// ! => NAO
		return !estaFurado && pressao >= 10;
	}
	
	public void esvaziar() {
		if(boasCondicoes()) {
			pressao -= 10; 
		}
	}
	
	public void encher(int outraPressao) {
		int aposEncher = pressao + outraPressao;
		if (aposEncher > MAXIMO) {
			estaFurado = true;
			pressao = 0;
		}else {
			if (!estaFurado)
				pressao = aposEncher;
		}
	}
	
}
