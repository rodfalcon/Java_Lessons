package herança;
import javax.swing.JOptionPane;

public class Usa_Funcionario {

	public static void main(String[] args) {
		Funcionario x = new Funcionario();
		Pessoa_Juridica ps = new Pessoa_Juridica();
		
		String u,v,t,z;
		int x1;
		
		z = JOptionPane.showInputDialog("Digite 1 se o contribuinte for pessoa fisica\n"
				+ "Digite 2 se for pessoa Jurídica");
		
		x1 = Integer.parseInt(z);
		if(z.length()==1) {
			switch(x1) {
			case 1:{
				    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte");
					v = JOptionPane.showInputDialog("Digite o RG do contribuinte");
					z = JOptionPane.showInputDialog("Escrever o ID do Cartao");
					
					x.setNome(u);
					x.setRG(v);
					x.setCartao(z);
					System.out.println("Nome: " + x.getNome());
					System.out.println("RG: " + x.getRG());
					System.out.println("Cartao: " + x.getCartao());
					break;
					}
			case 2:{
				u = JOptionPane.showInputDialog("Escreva o nome da empresa");
				v = JOptionPane.showInputDialog("Digite o CNPJ da empresa");
				z = JOptionPane.showInputDialog("Escrever o ID do Cartao Funcionario");
				
				ps.setNome(u);
				ps.setCNPJ(v);
				x.setCartao(z);
				System.out.println("Nome da empresa: " + ps.getNome());
				System.out.println("CNPJ: " + ps.getCNPJ());
				System.out.println("Cartao Funcionario: " + x.getCartao());
				
			}
			
					
					
			
			}
			
			
		}
		
		
	}

}
