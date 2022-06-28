/*4.	Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
 */
import java.util.Scanner;
 public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n=sc.nextInt();

        int fac= Ejercicio4.Factrial(n);
        System.out.println(String.format("%d! = %d", n,fac));
        sc.close();
    }


    
    public static int Factrial(int n){
        if(n==1)
            return 1;
        else
            return n*Factrial(n-1);
    }
    
}
