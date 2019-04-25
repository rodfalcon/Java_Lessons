public class Semaforo{
    private Cor cor;
    
    public Semaforo(Cor cor){
        this.cor = cor;
    }
    
    public void mensagem(){
        switch(cor){
            case AMARELO: System.out.println("ACELERE!"); break;
            case VERMELHO: System.out.println("PARE!"); break;
            case VERDE: System.out.println("SIGA!"); break;
        }
    }
}