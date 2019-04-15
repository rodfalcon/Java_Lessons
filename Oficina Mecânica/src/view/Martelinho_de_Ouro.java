package view;

public class Martelinho_de_Ouro {

	public static void main(String[] args) {
		Ordem_Serviço os = new Ordem_Serviço();
		Oficina_Mecânica oficina;
		oficina = os.Ordem_Serviço();
		oficina.elétrica();
		oficina.funilaria();
		oficina.pintura();
		
	}

}
