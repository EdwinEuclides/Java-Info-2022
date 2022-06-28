/*   9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece 
        una letra dada.
 */

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la frase: ");        
        String frase=sc.next();
             
        System.out.println("Inrese la letra que hay que contar: ");
        String sltr= sc.next();
        
        char[] chFrase = frase.toCharArray();
        char ch = sltr.charAt(0);
        
        int cant=0;
        for (char c : chFrase) {
            if(c==ch) cant++;
        }

        System.out.println(String.format("En la frase: %s aparece %d veces \"%s\"", frase,cant,sltr));

        sc.close();
    }
}
