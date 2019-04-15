import java.util.Scanner;

public class Tela {
	Scanner s;
	
	public void principal() {
		System.out.println("Digite o peso: ");
		double peso = s.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = s.nextDouble();
		IMC imc = new IMC();
		System.out.println("O IMC EH: " + 
		    imc.calcular(peso, altura));
	}
	
	public Tela() {
		s = new Scanner(System.in);
	}
	
	public void menu() {
		int opt = 0;
		while(opt != 2) {
			System.out.println("--- PROGRAMA IMC ---");
			System.out.println("1. Calcular");
			System.out.println("2. Sair");
			System.out.println("Digite a opcao: ");
			opt = s.nextInt();
			switch(opt) {
				case 1: this.principal();
						break;
				case 2: this.sair();
						break;
				default: this.erro();
			}
		}
	}
	
	public void erro() {
		System.out.println("Opção inválida");
	}
	
	public void sair() {
		System.out.println("Fim do programa");
		s.close();
	}
	

}
