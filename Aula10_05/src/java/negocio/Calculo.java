
package negocio;

/**
 *
 * @author dreis
 */
public class Calculo implements ICalculo{

    private float v1, v2;

    public Calculo(float v1, float v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    @Override
    public float somar() {
        return v1 + v2;
    }

    @Override
    public float subtrair() {
        return v1 - v2;
    }

    @Override
    public float multiplicar() {
        return v1 * v2;
    }

    @Override
    public float dividir() {
        return v1 / v2;
    }
    
}
