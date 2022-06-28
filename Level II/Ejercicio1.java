import java.util.ArrayList;
import java.util.List;

/*   1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
        luego imprimir por pantalla el ranking */

public class Ejercicio1
{
    public static void main(String[] args) {
        List<String> Ciudades = new ArrayList<String>();
        Ciudades.add("Buenos Aires");
        Ciudades.add("Rosario");
        Ciudades.add("Resistencia");

        for (String c : Ciudades) {
            System.out.println(String.format("#%d - %s", Ciudades.indexOf(c)+1,c));
        }
        
    }
}