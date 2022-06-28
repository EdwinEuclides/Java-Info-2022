import java.util.ArrayList;
import java.util.List;

/* 4. Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos
      (3 arrayList) e imprimir dichos cursos. */

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> Estudiantes = new ArrayList<String>();
        Estudiantes.add("Ana");
        Estudiantes.add("Luisa");
        Estudiantes.add("Felipe");
        Estudiantes.add("Pablo");
        Estudiantes.add("Arevalos");
        Estudiantes.add("Maciel");
        Estudiantes.add("Julio");
        Estudiantes.add("Mercedes");
        Estudiantes.add("Miguel");
        Estudiantes.add("Bosio");
        Estudiantes.add("Cesar");
        Estudiantes.add("Danilo");

        System.out.println("\nLista Completa: " + Estudiantes);

        List<String> Curso1 = Estudiantes.subList(0, 4);
        List<String> Curso2 = Estudiantes.subList(4, 8);
        List<String> Curso3 = Estudiantes.subList(8, 12);

        System.out.println("\nCurso 1:");
        for (String c : Curso1) System.out.println("\t"+ c);

        
        System.out.println("\nCurso 2:");
        for (String c : Curso2) System.out.println("\t"+ c);

        
        System.out.println("\nCurso 3:");
        for (String c : Curso3) System.out.println("\t"+ c);
    }

}
