package Alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase5 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espacio");
        cursos.add("Curso de Historia Universal");

        cursos.sort((o1, o2) ->
            Integer.compare(o2.length(), o1.length())
        );

        cursos.forEach( s -> System.out.println(s));
    }
}



