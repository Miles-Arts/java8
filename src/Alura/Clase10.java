package Alura;

import model.Curso;
import model.CursoTipo;

import java.util.*;
import java.util.stream.Collectors;

public class Clase10 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Curso de Física", 200));
        cursos.add(new Curso("Curso de Java 8", 500));
        cursos.add(new Curso("Curso de Geometría del espacio", 400));
        cursos.add(new Curso("Curso de Historia Universal", 300));

        List<CursoTipo> cursosTipos = new ArrayList<>();

        cursosTipos.add(new CursoTipo("Curso de Física", 200, 1));
        cursosTipos.add(new CursoTipo("Curso de Java 8", 500, 1));
        cursosTipos.add(new CursoTipo("Curso de Geometría del espacio", 400, 2));
        cursosTipos.add(new CursoTipo("Curso de Historia Universal", 300, 2));

        cursos.sort(Comparator.comparing(Curso::getHoras));

        int sum = cursos.stream().mapToInt(x -> x.getHoras()).sum();

        OptionalInt max = cursos.stream().mapToInt(x -> x.getHoras()).max();

         boolean validfatodos = cursos.stream().allMatch(x -> x.getHoras() > 200);

        /*Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHoras() > 600 ).findFirst();

        if(optionalCurso.isPresent()) {
            System.out.println(optionalCurso.get().getNombre());

        } else {
            System.out.println("No hay registro");
        }*/

        //cursos.stream().filter(x -> x.getHoras() > 300).findFirst().ifPresent(System.out::println);

        Curso curso = cursos.stream().filter(x -> x.getHoras() > 300).findFirst().orElse(new Curso("No existe " , 0));

        //System.out.println(curso);

        //cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toList()).forEach(System.out::println);


        Map<Integer, String> mapaCursos =  cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toMap(Curso::getHoras,Curso::getNombre));

        //cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toMap(Curso::getHoras,Curso::getNombre)).forEach((llave, valor) -> System.out.println(valor));

        mapaCursos.forEach((llave, valor) -> System.out.println(valor));

        Map<Integer, List<CursoTipo>> mapaCursosTipos =  cursosTipos.stream().filter(x -> x.getHoras() > 100).collect(Collectors.groupingBy(CursoTipo::getTipo));

        mapaCursosTipos.get(1).forEach(System.out::println);
        mapaCursosTipos.get(2).forEach(System.out::println);
    }
}




