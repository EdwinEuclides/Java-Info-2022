import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 1. Dada una lista que contiene valores de tipo String, se deberá 
      filtrar todos los valores que NO sean null o vacío (""). */

public class Ejercicio1 {
    public static void main(String[] args) {
        
        var palabras= crearLista();
        
        List<String> filtradas = palabras.stream()
            .filter(p->p!=null&&p!="")
            .collect(Collectors.toList());
        for (String el : filtradas) {
            System.out.println(el);
        }
    }

    private static List<String> crearLista(){
        List<String> lst = new ArrayList<>();
        lst.add("Hola");
        lst.add(null);
        lst.add("Informatorio");
        lst.add("");
        return lst;
    }

}
