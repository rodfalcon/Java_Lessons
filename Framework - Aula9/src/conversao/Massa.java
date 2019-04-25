package conversao;

public class Massa implements IMassa {
	private float massa;

	public float getMassa() {
		return massa;
	}

	@Override
	public void converterDeQuiloParaLibra(float quilo) {
		massa = (float) (quilo * 2.2046);
		
	}

	@Override
	public void converterDeLibraParaQuilo(float libra) {
		massa = (float) (libra/2.2046);
		
	}

}
