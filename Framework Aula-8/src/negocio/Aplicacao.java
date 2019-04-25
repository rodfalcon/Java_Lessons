package negocio;

public class Aplicacao implements IAplicação {
	private float valor_final;
	
	public float getValor_final() {
		return valor_final;
	}

	@Override
	public void calcularRendimento(float valorAplicado, int prazo, float taxa) {
		valor_final = valorAplicado * (float)Math.pow((1 + taxa/100), prazo);
		
	}
	

}
