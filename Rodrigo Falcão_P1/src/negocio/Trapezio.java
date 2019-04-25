package negocio;

public class Trapezio extends Figura {

    private float baseMenor, baseMaior, altura;
	
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public void setBaseMaior(float baseMaior) {
		this.baseMaior = baseMaior;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		area = (baseMenor + baseMaior) * altura / 2;
		
	}
}
