package Alura;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase6 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espacio");
        cursos.add("Curso de Historia Universal");

        //Function<String, Integer> funcion = x -> x.length();

        //cursos.sort(Comparator.comparing(funcion));
        cursos.sort(Comparator.comparing(String::length));
        //cursos.forEach(System.out::println);

        //reverso
        cursos.sort(Comparator.comparing(String::length).reversed());


        cursos.forEach(System.out::println);
        /*cursos.forEach(x -> {
            System.out.println(x);
            System.out.println(x.length());
        });*/
    }
}



