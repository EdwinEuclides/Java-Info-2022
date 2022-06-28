import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 3. Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
      (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir 
      en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir. */

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> Cartas = new ArrayList<String>();
        
        for(int i=1;i<11;i++) Cartas.add(Integer.toString(i));
        
        Cartas.add("J");
        Cartas.add("Q");
        Cartas.add("K");

        System.out.println("\nMazo de naipes francesas\n");
        for (String c : Cartas) {
            System.out.println(c);
        }

        List<String> CartasRev = new ArrayList<String>(Cartas);
        Collections.reverse(CartasRev);

        System.out.println("\nMazo de naipes francesas en ordern Inverso\n");
        for (String c : CartasRev) {
            System.out.println(c);
        }

        System.out.println("\nMazo de naipes francesas despues de mezclar\n");

        Collections.shuffle(Cartas);
        for (String c : Cartas) {
            System.out.println(c);
        }
    }
}
