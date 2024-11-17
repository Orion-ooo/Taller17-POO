
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Bicicleta extends Ej3_Transporte{

    public Ej3_Bicicleta() {
        super();
    }
    
    public void pedalear(){
        System.out.println(nombreUsuario + " esta pedaleando la bicicleta");
    }
    
    @Override public void desplazar(){
        System.out.println(nombreUsuario + " se esta desplazando en bicicleta");
    }
}
