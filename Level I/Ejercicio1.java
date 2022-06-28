
/*   1.	Solicitar por consola el nombre del usuario e imprimir por pantalla el 
        siguiente mensaje “HOLA {USUARIO}!!!” 
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su Nombre:");
        String nom = sc.next();

        sc.close();
        System.out.println(String.format("Hola %s", nom));

    }
}