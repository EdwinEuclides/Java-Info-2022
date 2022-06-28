/*  6.	Se desea una aplicación que solicite 2 números enteros y realice 
    la operación de potencia (sin uso de librerías). */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base de la potencia: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el exponente: ");
        int e = sc.nextInt();

        int p = Ejercicio6.PoteciaConProductos(b, e);
        System.out.println(String.format("%d elevado a %d = %d", b, e, p));
        sc.close();

    }

    private static int PoteciaConProductos(int base, int exp) {

        if (exp == 1)
            return base;
        else
            return base * PoteciaConProductos(base, exp - 1);
    }

}
