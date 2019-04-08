//Foo eh uma classe Parametrica
//de parametro T. O tipo de
//T eh DESCONHECIDO e soh
//sera conhecido(ou n) no momento
//de sua instancia
public class Foo<T> {
	private T atr1;
	
	public T getAtr1() {
		return atr1;
	}
	
	public void setAtr1(T atr1) {
		this.atr1 = atr1;
	}
}





