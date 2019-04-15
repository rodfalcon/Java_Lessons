package view;

public class Automovel {
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	public Automovel(int ano, String marca, String modelo, double preco) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}
	public void mostrar_carro() {
		System.out.println("\n" + "carro marca:\t"+ marca + "\n"
				+ "carro modelo:\t" + modelo + "\n"
				+ "carro preço:\t" + preco + "\n"
				+ "carro ano:\t" + ano);
		
	}

}
