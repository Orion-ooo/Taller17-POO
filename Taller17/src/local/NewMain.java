
package local;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Ejercicio 1
        Ej1_Figura figura1 = new Ej1_Circulo(19.3385083);
        Ej1_Figura figura2 = new Ej1_Rectangulo(260.32915, 25.092003);
        
        System.out.println("Area de " + figura1.getClass().getSimpleName() + " es: " + figura1.calcularArea());
        System.out.println("Area de " + figura2.getClass().getSimpleName() + " es: " + figura2.calcularArea());
        
        //Ejercicio 2
        Ej2_CuentaBancaria cuentaBancaria = new Ej2_CuentaAhorros(5, 100000);
        while (true) {
            System.out.println("Desea depositar o retirar?");
            System.out.println("Depositar = 1");
            System.out.println("Retirar = 2");
            System.out.println("Consultar el saldo = 3");
            System.out.println("salir = 4");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("cuanto desea depositar?");
                    cuentaBancaria.depositar(entrada.nextDouble());
                }
                case 2 -> {
                    System.out.println("cuanto desea retirar?");
                    cuentaBancaria.retirar(entrada.nextDouble());
                }
                case 3 -> {
                    System.out.println("su saldo es de: " + cuentaBancaria.consultarSaldo());
                }
                case 4 -> {
                    return;
                }
                default -> {
                }
            }
        }
        
        //Ejercicio 3
        
    }
}
