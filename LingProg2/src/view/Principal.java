
package view;

import negocio.Figura;
import negocio.Quadrado;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        // ******* UPCASTING ******* 
        // instancia objeto da classe filha Quadrado
        Quadrado objQuadradoUp = new Quadrado();
        objQuadradoUp.setLado(10);
        // atribui instância da filha à classe mãe, via casting implícito
        Figura objFiguraUp = objQuadradoUp;
        // utiliza objeto da classe mãe para executar uma regra implementada na filha
        System.out.println(String.format(
                "[Upcasting] Área da figura: %.2fcm².", objFiguraUp.calcularArea()));
        
        // ******* DOWNCASTING ******* 
        // instancia objeto da mãe a partir de uma instância da filha
        Figura objFiguraDown = new Quadrado();
        // atribui, via casting explícito, a instância da mãe a um objeto da classe filha
        Quadrado objQuadradoDown = (Quadrado)objFiguraDown;
        objQuadradoDown.setLado(5);
        // utiliza objeto da classe filha (após a inicialização ter sido na mãe)
        System.out.println(String.format(
                "[Downcasting] Área do quadrado: %.2fcm².", objQuadradoDown.calcularArea()));
        
         
    }
}
