
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Circulo extends Ej1_Figura{
    private double radio;

    public Ej1_Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
