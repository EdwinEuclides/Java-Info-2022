
/* 7. Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si 
es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular 
y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4    */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el 1er numero: ");
        int ni = sc.nextInt();

        System.out.println("ingrese el 2do numero: ");
        int nf = sc.nextInt();
        sc.close();

        String[] arrayFizz = Ejercicio7.Fizz(ni, nf);

        for (String s : arrayFizz) {
            System.out.println(s);
        }

    }

    private static String[] Fizz(int ini, int fin){
        
        String[] f = new String[fin-ini];
 
        for(int i=ini;i<fin;i++){
            int pos=i-ini;           
            
            if(i%2==0 && i%3==0)
                f[pos]="FizzBuzz";
            else if(i%2==0)
                f[pos]="Fizz";
            else if(i%3==0)
                f[pos]="Buzz";
            else
                f[pos]=Integer.toString(i);
        }

    return f;
    }
}
