import java.util.Scanner;
/*
3.	Confeccionar un programa que dado un número entero como dato de entrada 
    imprima la secuencia de números (incrementos de 1) de la siguiente forma:
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int x = sc.nextInt();
        sc.close();

        String nros="";
        for(int i=1;i<=x;i++){
            nros += String.valueOf(i);
            System.out.println(nros);
        }
    }
    
}
