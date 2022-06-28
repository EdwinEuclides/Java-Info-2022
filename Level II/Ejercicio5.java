import java.util.ArrayList;
import java.util.List;

/* 5. Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen 
     de carga de horas semanal de un empleado. Se debe generar otra lista que contenga 
     los totales y luego imprimir el total final a cobrar.*/

public class Ejercicio5 {
    private static List<Integer> horas;
    private static List<Integer> valores;
    public static void main(String[] args) {
        
        Ejercicio5.Cargar();
        
        List<Integer> totales = new ArrayList<Integer>();      
        int total = 0;

        for(int i=0;i<horas.size();i++)
        {
            int t =horas.get(i)*valores.get(i);
            total+=t;
            totales.add(t);
        }
        
        System.out.println(" ");
        System.out.println(totales);
        System.out.println(String.format("\tTotal final:$ %d", total) );
    }

    private static void Cargar()
    {
        horas = new ArrayList<Integer>();
        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);

        valores = new ArrayList<Integer>();
        valores.add(350);
        valores.add(345);
        valores.add(550);
        valores.add(600);
        valores.add(320);
    }
}
