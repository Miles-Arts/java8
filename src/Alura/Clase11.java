package Alura;

import model.Curso;
import model.CursoTipo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Clase11 {

    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now().minusMonths(10).plusDays(13);

        LocalDate fechaMundialFutbol = LocalDate.of(2024,9,15);

        System.out.println(fechaActual);

        System.out.println(fechaMundialFutbol);

        //comparar años
        System.out.println(fechaMundialFutbol.getYear() - fechaActual.getYear());

        //diferencias de ´dias

        System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundialFutbol));

        //meses diferencia
        System.out.println(ChronoUnit.MONTHS.between(fechaActual, fechaMundialFutbol));

        //time diferencia
        System.out.println(ChronoUnit..between(fechaActual, fechaMundialFutbol));

    }
}




