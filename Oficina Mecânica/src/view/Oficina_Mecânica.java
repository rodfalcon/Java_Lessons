package view;

public class Oficina_Mecânica {
	private String marca;
	private String modelo;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String pintura() {
		return "pintura verde ";
	}
	public String funilaria() {
		return "Desamassar o teto";
	}
	public String elétrica() {
		return "instalando alarme";
	}
}
