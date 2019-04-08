package formulario;

public class Principal {

	public static void main(String[] args) {
		Calculo x1 = new Calculo();
		
		x1.setNome("Rodrigo");
		x1.setSalario(18);
		x1.calcular_salario();
		System.out.println("O salario é:" + x1.mostra_salario());
		
	}

}
