
public class Teste {

	public static void main(String[] args) {
		Gato g = new Gato("Branco");
		System.out.println(g);
		//Animal a = new Animal();
		//Cachorro c = new Cachorro();
		//PELO HERANÇA OS OBJETOS c e g CONSEGUEM
		//ACESSA o dormir().
		//a.dormir();
		//g.dormir();
		//c.dormir();
		//EM TEMPO DE EXECUÇÃO, SABE-SE QUE
		//c e g são Cachorro e Gato especificamente.
		//Logo, será invocado o emitirSom correto.
		//que nos permite concluir que, em tempo
		//de execução, ocorre esta invocação.
		//a.emitirSom();
		//g.emitirSom();
		//c.emitirSom();
	}

}
