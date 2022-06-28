import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 6. Se dispone de una colección de Empleados, de cada empleado se conoce:
            Nombre y Apellido
            DNI
            horasTrabajadas
            valorPorHora
      Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
      (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map 
      (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.  */

public class Ejercicio6 {

    private static Set<Empleado> empleados;

    public static void main(String[] args) {
        
        cargar();

        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();

        for (Empleado emp : empleados) {
            int sueldo = emp.getValorPorHora() * emp.getHorasTrabajadas();
            sueldos.put(emp.getDni(), sueldo);
        }

        System.out.println("\nNomina Salarial (sin ordenar)");
        mostrar(sueldos);
    }

    private static void cargar() {
        
        empleados = new HashSet<Empleado>();
        empleados.add(new Empleado("Juan", "Arce", 16367897, 325, 26));
        empleados.add(new Empleado("Pedro", "Roa", 322457, 400, 28));
        empleados.add(new Empleado("Ariel", "Moor", 45201328, 250, 30));
        empleados.add(new Empleado("Jhon", "Lee", 3400308, 1550, 20));
    }

    private static void mostrar(Map mapLst){

        Iterator it = mapLst.keySet().iterator();
        while (it.hasNext()) {
            Integer dni = (Integer) it.next();
            System.out.println(String.format("\tDni: %s - Sueldo: %d", dni, mapLst.get(dni)));
        }
    }
}
