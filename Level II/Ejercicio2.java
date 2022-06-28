import java.util.ArrayList;
import java.util.List;

/* 2. Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio 
      de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el 
      tamaño de la misma (antes y después de agregar a en la primera y última posición). */

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> nros= new ArrayList<Integer>();
        nros.add(4);
        nros.add(456);
        nros.add(23);
        nros.add(234);
        nros.add(4566);

        System.out.println("\nCantidad de numeros: "+ Integer.toString(nros.size()));
        
        for (Integer n : nros) {
            System.out.println(n);
        }

        System.out.println("\n**************************\n");    
        
        nros.add(0, -100);
        nros.add( 100000);

        System.out.println("Cantidad de numeros: "+ Integer.toString(nros.size()));
        
        for (Integer n : nros) {
            System.out.println(n);
        }

    }
}
