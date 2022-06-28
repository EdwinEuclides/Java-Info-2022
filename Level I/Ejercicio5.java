
/*5.  Se desea una aplicación que solicite 2 números enteros y realice la operación de 
      multiplicación por sumas sucesivas (sin uso de librerías). */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el 2do numero: ");
        int y = sc.nextInt();
        sc.close();

        int prod = Ejercicio5.ProductoConSumas(x, y);

        System.out.println(String.format("%d x %d = %d", x, y, prod));

    }

    private static int ProductoConSumas(int x, int y) {
        if (y == 1)
            return x;
        else
            return x + ProductoConSumas(x, y - 1);
    }
}
