package Organiza_Cidade;

public class Cidade_de_Santos {
	private String região;
	private int população;
	
	public Cidade_de_Santos() {	}
	
	Cidade_de_Santos(String s){
		if(s == "r")
			System.out.println("Secretaria de Região");
		if(s=="b")
			System.out.println("Secretaria de Bairros");
		if(s=="l")
			System.out.println("Secretaria de Ruas");
	}

	public String getRegião() {
		return região;
	}

	public void setRegião(String região) {
		this.região = região;
	}

	public int getPopulação() {
		return população;
	}

	public void setPopulação(int população) {
		this.população = população;
	}
	

}
