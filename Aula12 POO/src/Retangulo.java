
public class Retangulo extends Quadrilatero{
	
	private double lado2;
	
	public Retangulo(double lado1,double lado2) {
		super(lado1);
		this.lado2 = lado2;
	}

	@Override
	public void calcPerim() {
		System.out.println(2*lado1+2*lado2);
	}

	@Override
	public void calcArea() {
		System.out.println(lado1*lado2);
	}
}
