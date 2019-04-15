public class Teste{
	public static void main(String[] args) {
		Bicicleta b = new Bicicleta("CALOI");
		b.acelerar();
		b.mostrarStatus();
		b.encherPneu1(70);
		System.out.println("APOS ENCHER");
		b.mostrarStatus();
		b.acelerar();
	}
}