package Organiza_Cidade;

public class Logradouro extends Região_de_Santos {
	private String tipo_Logradouro;
	private String local_logradouro;
	
	public Logradouro() {
		super ("l");
	}
	
	public String getTipo_Logradouro() {
		return tipo_Logradouro;
	}
	public void setTipo_Logradouro(String tipo_Logradouro) {
		this.tipo_Logradouro = tipo_Logradouro;
	}
	public String getLocal_logradouro() {
		return local_logradouro;
	}
	public void setLocal_logradouro(String local_logradouro) {
		this.local_logradouro = local_logradouro;
	}
	
	
}
