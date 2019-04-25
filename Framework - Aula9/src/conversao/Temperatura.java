package conversao;

public class Temperatura implements ITemperatura {
	private float temperatura;
	
	
	public float getTemperatura() {
		return temperatura;
	}

	@Override
	public void converterDeCelsiusParaFahrenheit(float celsius) {
		temperatura = (float) ((celsius * 1.8) + 32);
		
	}

	@Override
	public void converterDeFahrenheitParaCelsius(float fahrenheit) {
		temperatura = (float) ((fahrenheit - 32)/1.8);
		
	}

}
