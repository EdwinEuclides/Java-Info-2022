/*un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
  (con separador de espacio en blanco) y el value la edad del alumno. */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = cargarAlumnos();

        Map<String, Integer> mapAl = new HashMap<String, Integer>();

        alumnos.forEach(al -> mapAl.put(
                String.format("%s %s", al.getApellido(), al.getNombre()),
                LocalDate.now().getYear() - al.getFechaDeNacimiento().getYear()));
        
        System.out.println(mapAl);
    }

    private static List<Alumno> cargarAlumnos() {
        List<Alumno> lstAlumnos = List.of(
                new Alumno("Egger", "Edwin", LocalDate.parse("1963-05-23")),
                new Alumno("Mendoza", "Julio", LocalDate.parse("2001-11-17")),
                new Alumno("Arce", "Miguel", LocalDate.parse("2005-01-31")),
                new Alumno("Bracamonte", "Alicia", LocalDate.parse("2004-02-29")),
                new Alumno("Dalmasso", "Monica", LocalDate.parse("1985-12-08")),
                new Alumno("Zacarias", "Eduardo", LocalDate.parse("2010-02-28")),
                new Alumno("Acosta", "Gladis", LocalDate.parse("2002-06-25")));
        return lstAlumnos;
    }
}
