
package financeiro;

/**
 *
 * @author dreis
 */
public class Aplicacao implements IAplicacao{

    private float valorFinal;

    public float getValorFinal() {
        return valorFinal;
    }
    
    @Override
    public void calcularRendimento(float valorAplicado, int prazo, float taxa) {
        valorFinal = valorAplicado * (float)Math.pow((1 + taxa/100), prazo);
    }
}
