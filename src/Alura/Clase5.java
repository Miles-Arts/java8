package Alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Clase5 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espacio");
        cursos.add("Curso de Historia Universal");

        Function<String, Integer> funcion = x -> x.length();

        cursos.sort(Comparator.comparing(funcion));

        cursos.forEach(x -> System.out.println(x));
    }
}



