package Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase2 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espacio");
        cursos.add("Curso de Historia Universal");

        //Collections.sort(cursos, new CompararClase2());
        cursos.sort(new CompararClase2());
        cursos.forEach(new ConsumidorClase2());


       /* for (String curso : cursos) {

            System.out.println(curso);

        }*/
    }
}

class ConsumidorClase2 implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s.length());
    }
}

class CompararClase2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
          return  0;
    }

    public static class Clase2 {

        public static void main(String[] args) {

            List<String> cursos = new ArrayList<>();

            cursos.add("Curso de Física");
            cursos.add("Curso de Java 8");
            cursos.add("Curso de Geometría del espacio");
            cursos.add("Curso de Historia Universal");

            Collections.sort(cursos, new CompararClase2());

            for (String curso : cursos) {

                System.out.println(curso);

            }
        }
    }
}
