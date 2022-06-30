/* 4. Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la 
      operación de factorial pero no se desean valores repetidos. */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> nros = List.of(1, 2, 4, 4, 4,2,5);
        Set<Integer> nSinDup = new HashSet<>(nros);
        List<Integer> lstFactoriales = nSinDup.stream().map(n -> Ejercicio4.Factorial(n))
                .collect(Collectors.toList());

        System.out.println(lstFactoriales);
    }

    private static Integer Factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }

}
