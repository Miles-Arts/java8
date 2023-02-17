package Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase4 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espacio");
        cursos.add("Curso de Historia Universal");

        cursos.sort((o1, o2) ->
           // Integer.compare(o1.length(), o2.length())
            Integer.compare(o2.length(), o1.length())
        );
        /*cursos.sort((o1, o2) -> {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return  0;
        });*/

        cursos.forEach( s -> System.out.println(s));
    }
}

class CompararClase4 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return  0;
    }
}
    /*public static class Clase3 {

        public static void main(String[] args) {

            List<String> cursos = new ArrayList<>();

            cursos.add("Curso de Física");
            cursos.add("Curso de Java 8");
            cursos.add("Curso de Geometría del espacio");
            cursos.add("Curso de Historia Universal");

            Collections.sort(cursos, new CompararClase4());

            for (String curso : cursos) {

                System.out.println(curso);

            }
        }
    }
}*/
