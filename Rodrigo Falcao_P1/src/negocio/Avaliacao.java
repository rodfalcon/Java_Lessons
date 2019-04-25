package negocio;

public class Avaliacao implements IMedia, IPresenca {
	
	private float media;
	private float presenca;

	public void setMedia(float media) {
		this.media = media;
	}


	public void setPresenca(float presenca) {
		this.presenca = presenca;
	}


	public float getMedia() {
		return media;
	}
	

	public float getPresenca() {
		return presenca;
	}
	
	public String retornarSituacao()
	{ if (media >= 6 && presenca >= 75)
		return "Aprovado, BOOOA"; 
	else return "Reprovado, até o próximo semestre"; }

	@Override
	public void calcularMedia(float p1, float p2) {
		media = (p1 + p2)/2;
		
	}

	@Override
	public void calcularMedia(float p1, float p2, float p3) {
		if (p1 > p3 && p2 > p3)
		media = (p1 + p2 + p3)/3;
		if (p3 > p1 && p2 > p1)
			media =  (p2 + p3)/2;
		 if (p1 > p2 && p3 > p2)
			 media = (p1 + p3)/2;
	}

	@Override
	public void calcularPercentualPresenca(float totalAulas, float qtdePresencas) {
		presenca = (qtdePresencas * 100)/totalAulas;
		
	}

}
