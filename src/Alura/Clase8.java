package Alura;

import model.Curso;

import java.util.*;

public class Clase8 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Curso de Física", 200));
        cursos.add(new Curso("Curso de Java 8", 500));
        cursos.add(new Curso("Curso de Geometría del espacio", 400));
        cursos.add(new Curso("Curso de Historia Universal", 300));

        cursos.sort(Comparator.comparing(Curso::getHoras));

        //sumar clases mayotes de 300 horas
       //int suma = cursos.stream().filter(x -> x.getHoras() >= 300).mapToInt(x -> x.getHoras()).sum();

               //.forEach(x -> System.out.println(x.getNombre()));

        //sumar todas las horas de clases
        //int suma = cursos.stream().mapToInt(x -> x.getHoras()).sum();

        //se añade OptionalInt para imprimir la materia con más horas
        OptionalInt max = cursos.stream().mapToInt(x -> x.getHoras()).max();

        //System.out.println(suma);
        //System.out.println(max);


        //Cursos mayores a 100 horas
        boolean validfatodos = cursos.stream().allMatch(x -> x.getHoras() > 200);

        //System.out.println(validfatodos);

        //retornar cualquier valor mayor A 200
        //Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHoras() > 200 ).findFirst();

        Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHoras() > 600 ).findFirst();


        //System.out.println(optionalCurso.isPresent());
        if(optionalCurso.isPresent()) {
            System.out.println(optionalCurso.get().getNombre());

        } else {
            System.out.println("No hay registro");
        }




        // numero entero del optional
        //System.out.println(max.getAsInt());

    }
}



