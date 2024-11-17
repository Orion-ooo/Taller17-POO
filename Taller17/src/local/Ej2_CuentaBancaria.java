
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_CuentaBancaria {
    protected double saldo;

    public Ej2_CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("deposito realizado con exito! : " + monto);
        } else {
            System.out.println("el monto a depositar debe ser positivo");
        }
    }
    public void retirar(double monto){
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("retiro realizado con exito!");
        } else {
            System.out.println("monto no valido o saldo insuficiente");
        }
    }
    public double consultarSaldo(){
        return saldo;
    }
}
