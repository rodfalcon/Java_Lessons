
public class Quadrado extends Quadrilatero{

	public Quadrado(double lado1) {
		super(lado1);
	}

	@Override
	public void calcPerim() {
		System.out.println(4*lado1);
	}

	@Override
	public void calcArea() {
		System.out.println(lado1*lado1);
	}

}
