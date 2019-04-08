import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) throws Exception {
		Usuario<NaoLogado> usr = Sessao.getConvidado();
		Usuario<Logado> usr2 = Sessao.autenticar("root", "root");
		Sessao.dashboard(usr2);
		//Produto p = new Produto();
		//p.inserir("Caneta", 15);
		//p.inserir("Borracha", 3);
		//p.inserir("Resma A4", 60);
		//p.listar();
		/*Dupla<String,Integer> d1 = new Dupla<String,Integer>("Caneta",5);
		ListaDeDupla<String,Integer> ld = 
				new ListaDeDupla<String,Integer>();
		ld.inserir(d1);
		ld.inserir(new Dupla<String,Integer>("Cobol",10));
		ArrayList<String> as = ld.extrairColuna1();
		ArrayList<Integer> bs = ld.extrairColuna2();
		System.out.println(as.get(0));
		System.out.println(as.get(1));
	    */
	}

}
