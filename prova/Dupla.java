public class Dupla<T,S>{
    private S s;
    private T t;
    
    public Dupla(T t, S s){
        this.s = s;
        this.t = t;
    }
    
    public S getS(){
        return s;
    }
    
    public T getT(){
        return t;
    }
    
    public Dupla<S,T> trocar(Dupla<T,S> d){
        return new Dupla(d.getS(),d.getT());
    }
    
    public Dupla<T,T> diag1(Dupla<T,S> d){
        return new Dupla(d.getT(),d.getT());
    }
    
    public Dupla<S,S> diag2(Dupla<T,S> d){
        return new Dupla(d.getS(),d.getS());
    }
    
    public <K> Dupla<T,Dupla<S,K>> assoc(Dupla<Dupla<T,S>,K> d){
        K k = d.getS();
        Dupla<S,K> d1 = new Dupla<S,K>(d.getT().getS(),k);
        Dupla<T,Dupla<S,K>> d2 = new Dupla<T,Dupla<S,K>>(d.getT().getT(),d1); 
        return d2;
    }
    
    public static void main(String args[]){
        System.out.println("OLA");
    }
}