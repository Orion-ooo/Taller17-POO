
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_CuentaAhorros extends Ej2_CuentaBancaria{
    private double tasaInteres;

    public Ej2_CuentaAhorros(double tasaInteres, double saldoInicial) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(){
        double interes = saldo * tasaInteres;
        saldo += interes;
        System.out.println("se aplico el interes, total: " + saldo);
    }
}
