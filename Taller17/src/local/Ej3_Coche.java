
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Coche extends Ej3_Transporte{

    public Ej3_Coche() {
        super();
    }
    
    public void pedalear(){
        System.out.println(nombreUsuario + " esta conduciendo un coche");
    }
    
    @Override public void desplazar(){
        System.out.println(nombreUsuario + " se esta desplazando en coche");
    }
}
