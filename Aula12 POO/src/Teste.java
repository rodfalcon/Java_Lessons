
public class Teste {

	public static void main(String[] args) {
		Gato g = new Gato("Branco");
		System.out.println(g);
		//Animal a = new Animal();
		//Cachorro c = new Cachorro();
		//PELO HERAN�A OS OBJETOS c e g CONSEGUEM
		//ACESSA o dormir().
		//a.dormir();
		//g.dormir();
		//c.dormir();
		//EM TEMPO DE EXECU��O, SABE-SE QUE
		//c e g s�o Cachorro e Gato especificamente.
		//Logo, ser� invocado o emitirSom correto.
		//que nos permite concluir que, em tempo
		//de execu��o, ocorre esta invoca��o.
		//a.emitirSom();
		//g.emitirSom();
		//c.emitirSom();
	}

}
