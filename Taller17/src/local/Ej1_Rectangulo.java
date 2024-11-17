
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Rectangulo extends Ej1_Figura{
    private double alto;
    private double ancho;

    public Ej1_Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override public double calcularArea(){
        return alto * ancho;
    }
}
