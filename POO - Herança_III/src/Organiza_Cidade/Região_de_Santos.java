package Organiza_Cidade;

public class Região_de_Santos extends Cidade_de_Santos {

	public Região_de_Santos() {
		super ("r");
	}
	public Região_de_Santos(String s) {
		super ("s");
	}
	
	private String bairro;
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
