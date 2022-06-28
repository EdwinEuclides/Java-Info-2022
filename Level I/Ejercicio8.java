/*   8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
        Nombre y Apellido
        Edad
        Dirección
        Ciudad
Luego imprimirá el siguiente mensaje: {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}   */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombres y Apellido: ");
        String apyNom = sc.next();
        System.out.println("Ingrese la Edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese Dirección: ");
        String dir = sc.next();
        System.out.println("Ingrese la Ciudad: ");
        String cdad = sc.next();
        sc.close();
        System.out.println(String.format("%s - %s - %d - %s", cdad, dir, edad, apyNom));
    }
}
