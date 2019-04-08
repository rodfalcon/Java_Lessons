
public class Sessao {
	public static Usuario<NaoLogado>
		getConvidado() {
		return new Usuario("convidado","");
	}
	
	public static Usuario<Logado> 
		autenticar(String login, String senha) throws Exception{
		if(login == "root" && senha == "root")
			return new Usuario(login,senha);
		else
			throw new Exception("Usuario invalido");
	}
	
	public static void 
		dashboard(Usuario<Logado> usuario) {
		System.out.println("Bem-vindo" + usuario.getLogin());
	}
	
}
