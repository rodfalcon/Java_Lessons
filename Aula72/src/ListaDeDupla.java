import java.util.ArrayList;

public class ListaDeDupla<T,S> {
	private ArrayList<Dupla<T,S>> lista;
	
	public ListaDeDupla(){
		//[(t1,s1),(t2,s2),...,(tn,sn)]
		lista = new ArrayList<Dupla<T,S>>();
	}
	
	public void inserir(Dupla<T,S> d) {
		lista.add(d);
	}
	
	public ArrayList<T> extrairColuna1() {
		ArrayList<T> aux = new ArrayList<T>();
		for(Dupla<T,S> dupla : lista) {
			aux.add(dupla.getCol1());
		}
		return aux;
	}
	
	public ArrayList<S> extrairColuna2() {
		ArrayList<S> aux = new ArrayList<S>();
		for(Dupla<T,S> dupla : lista) {
			aux.add(dupla.getCol2());
		}
		return aux;
	}
	
	
	
	
}
