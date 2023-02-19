package Alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Curso de Física", 200));
        cursos.add(new Curso("Curso de Java 8", 500));
        cursos.add(new Curso("Curso de Geometría del espacio", 400));
        cursos.add(new Curso("Curso de Historia Universal", 300));

        //cursos.sort(Comparator.comparing(String::length));
        cursos.sort(Comparator.comparing(Curso::getHoras));

        //cursos.forEach(System.out::println);
        //cursos.forEach(x -> System.out.println(x.getNombre()));

        //Java TRADICIONAL

        /*for (Curso curso:
                cursos)
            if(curso.getHoras() >= 300)
                System.out.println();
        ) {
        }*/

        //después de Java 8
       cursos.stream().filter(x -> x.getHoras() >= 300).forEach(x -> System.out.println(x.getNombre()));

    }
        //cursos.stream().filter(x -> x.getHoras() >= 300);
        //cursos.forEach(x -> System.out.println(x.getNombre()));
}


class Curso {
    private String nombre;
    private int horas;

    public Curso(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }
}



