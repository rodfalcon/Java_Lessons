package urna;

public class Principal {

	public static void main(String[] args) {
		Eleicao x = new Eleicao(2018);
		Candidato Lula = new Candidato("Luiz Inácio Lula da Silva", 13, 10000000, Partido.VERMELHO);
		Candidato Sergio_Moora = new Candidato("Bolsonazi", 17, 5700000, Partido.AZUL);
		Candidato frouxo = new Candidato("Ciro", 12, 12000, Partido.VERDE);
		
		x.cadastrar(Lula);
		x.cadastrar(Sergio_Moora);
		x.cadastrar(frouxo);
		Lula.votar();
		Lula.mostrar_info();
		Sergio_Moora.votar();
		frouxo.mostrar_info();
		Sergio_Moora.votar();
		Sergio_Moora.mostrar_info();
		
		x.mostrarAno();
		x.mostrarVotos();
		x.mostrarVotosPartido();
		
		
	}

}
