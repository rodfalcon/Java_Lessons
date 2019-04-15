package Organiza_Cidade;

public class Prefeitura {

	public static void main(String[] args) {
		Região_de_Santos x = new Região_de_Santos();
		Bairro_de_Santos y = new Bairro_de_Santos();
		Cidade_de_Santos z = new Cidade_de_Santos();
		
		y.setBairro("Vila Mathias");
		y.setRegião("Canal 3");
		y.setRua("Comendador Martins");
		y.setPopulação(40000);
		System.out.println("Bairro: " + y.getBairro());
		System.out.println("Região: " + y.getRegião());
		System.out.println("Rua: " + y.getRua());
		System.out.println("População: " + y.getPopulação());
		
		x.setBairro("Marapé");
		x.setRegião("Canal 1");
		x.setPopulação(70000);
		System.out.println("Bairro: " + x.getBairro());
		System.out.println("Região: " + x.getRegião());
		System.out.println("População: " + x.getPopulação());
		
		z.setPopulação(2000);
		z.setRegião("Twilight Zone");
		System.out.println("Região:" + z.getRegião());
		System.out.println("Populi: "+ z.getPopulação());
		
		Logradouro x1 = new Logradouro();
		x1.setBairro("Morro do freio");
		x1.setLocal_logradouro("Número 22");
		x1.setPopulação(3000);
		x1.setRegião("Brék");
		x1.setTipo_Logradouro("A");
		
		
		System.out.println("\nBairro:" + x1.getBairro());
		System.out.println("" + x1.getLocal_logradouro());
		System.out.println("" + x1.getTipo_Logradouro());
		System.out.println("Região: " + x1.getRegião());
		System.out.println("População: " + x1.getPopulação());
		
		
	}

}
