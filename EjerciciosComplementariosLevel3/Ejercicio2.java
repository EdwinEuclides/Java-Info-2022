/* 2. Cada una lista que contiene números enteros, se deberá generar otra lista 
      que contendrá el resultado de aplicar la operación de potencia a 2. */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> enterosCuadr = enteros.stream()
                .map(e->e*e)
                .collect(Collectors.toList());
                
        for (Integer c : enterosCuadr) {
            System.out.println(c);
        }
    }

}
