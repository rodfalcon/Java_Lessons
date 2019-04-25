import java.util.ArrayList;
public class Eleicao{
    private int ano;
    private ArrayList<Candidato> candidatos;
    
    public Eleicao(int ano){
        this.ano = ano;
        candidatos = new ArrayList<Candidato>();
    }
    
    public void cadastrar(Candidato c){
        candidatos.add(c);
    }
    
    public void mostrarAno(){
        System.out.println(ano);
    }
    
    public void votarNumero(int numero){
        for(Candidato c : candidatos){
            if(numero == c.getNumero()){
                c.votar();
                break;
            }
        }
    }
    
    public void mostrarVotos(){
        for(Candidato c : candidatos){
            c.mostrarInfo();
        }
    }
    
    public void mostrarVotosPartido(){
        int qtVerde = 0;
        int qtVermelho = 0;
        int qtAzul = 0;
        for(Candidato c : candidatos){
            switch (c.getPartido()){
                case AZUL: qtAzul+=c.getQtVotos(); break;
                case VERMELHO: qtVermelho+=c.getQtVotos(); break;
                case VERDE: qtVerde+=c.getQtVotos(); break;
                default: break;
            }
        }
        System.out.println(qtVerde);
        System.out.println(qtAzul);
        System.out.println(qtVermelho);
    }
}