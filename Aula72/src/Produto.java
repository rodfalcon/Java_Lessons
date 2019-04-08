import java.util.HashMap;
import java.util.Map.Entry;

public class Produto {
	//COMO SE FOSSE O ARRAYLIST
	//ArrayList<T> == HashMap<Integer,T>
	private HashMap<String,Double> hm;
	
	public Produto() {
		hm = new HashMap<String,Double>();
	}
	
	public void inserir(String nome, double preco) {
		//nome indice e preco valor.
		hm.put(nome, preco);
	}
	
	public void mostrarProduto(String nome) {
		System.out.println(hm.get(nome));
	}
	
	public void listar() {
		for(Entry<String,Double> e : hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
	
	
	
	
}
