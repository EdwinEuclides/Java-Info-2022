import java.util.Scanner;

/*
2.	Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado 
    de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
*/

public class  Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero: ");
        int x = sc.nextInt();
        System.out.println("Ingrese el 2er numero: ");
        int y = sc.nextInt();
        sc.close();

        System.out.println(String.format("%d + %d = %d", x,y,x+y));
        System.out.println(String.format("%d - %d = %d", x,y,x-y));
        System.out.println(String.format("%d * %d = %d", x,y,x*y));
        System.out.println(String.format("%d / %d = %d", x,y,x/y));
        System.out.println(String.format("%d %% %d = %d", x,y,x%y));

    }
}
