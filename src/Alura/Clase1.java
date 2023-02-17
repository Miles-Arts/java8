package Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clase1 {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Curso de Física");
        cursos.add("Curso de Java 8");
        cursos.add("Curso de Geometría del espaio");
        cursos.add("Curso de Historia Universal");

        Collections.sort(cursos, new Comparar());



        for (String curso : cursos) {

            System.out.println(curso);

        }

    }
}

class Comparar implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < 0o.length()) {
            return -1;
        }
          return  0;
    }
}
