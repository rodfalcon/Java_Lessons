package construção_civil;
import javax.swing.*;

public class Construtora {

	public static void main(String[] args) {
		Construção pedreiro = null;
		
		int tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digitar tipo de Construção===\n"
				+ "1 = CASA   2 = APARTAMENTO   3 = TUDO"));

		switch(tipo_construcao) {
		case 1:{
			pedreiro = new Casa();
			break;
		}
		case 2:{
			pedreiro = new Apartamento();
			break;
		}
		case 3:{
			
			pedreiro = new Construção();
			break;
		}
		default: System.out.println("Construção indefinida");
		System.exit(0);
				}
		pedreiro.constroi();
	}

}
