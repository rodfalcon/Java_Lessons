public class Candidato{
    private Partido partido;
    private int numero, qtVoto;
    private String nome;
    
    public Candidato(Partido partido, int numero,
                     int qtVoto, String nome){
        this.qtVoto = qtVoto;
        this.numero = numero;
        this.partido = partido;
        this.nome = nome;
    }
    
    public void votar(){
        qtVoto++;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getQtVotos(){
        return qtVoto;
    }
    
    public Partido getPartido(){
        return partido;
    }
    
    public void mostrarInfo(){
        System.out.println(nome);
        System.out.println(partido);
        System.out.println(qtVoto);
        System.out.println(numero);
    }
}