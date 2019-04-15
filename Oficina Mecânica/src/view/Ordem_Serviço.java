package view;

import javax.swing.JOptionPane;

public class Ordem_Serviço {
	static Oficina_Mecânica of = null;
	
	public Oficina_Mecânica Ordem_Serviço() {
		String escolha;
		escolha = JOptionPane.showInputDialog(null, "Digite a Marca do Veículo: Ford, Volks ou outra", "Oficina", 0);
		
		if(escolha.equals("Volks")) {
			of = new Concessionária_Volks();
			of.setMarca("Volks");
			of.setModelo("FUSCÃO");
			System.out.println(of.getMarca() + "\n" + of.getModelo() + "\n" + of.funilaria() + "\n" + of.elétrica() + "\n"
			+ of.pintura());
		}
		if(escolha.equals("Ford")) {
			
			of = new Concessionária_Ford();
			of.setMarca("Ford");
			of.setModelo("BELINA MELINDROSO");
			System.out.println(of.getMarca() + "\n" + of.getModelo() + "\n" + of.funilaria() + "\n" + of.elétrica() + "\n"
			+ of.pintura());
		}
		if(escolha.equals("outra")) {
			of = new Oficina_Mecânica();
			of.setMarca("Gurgel");
			of.setModelo("Xavante XT");
			System.out.println(of.getMarca() + "\n" + of.getModelo() + "\n" + of.funilaria() + "\n" + of.elétrica() + "\n"
			+ of.pintura());
		}
		
		
		
		return of;
	}
}
