package negocio;

public class Retangulo extends Figura {
	
	  private float base, altura;

	    public void setBase(float base) { 
	    	this.base = base;
	    	}
	    public void setAltura(float altura) { 
	    	this.altura = altura;
	    	}	        

	@Override
	public void calcularArea() {
		area = base * altura;
	}

}
