package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreAlumno = "";
        System.out.println("Ingresa el nombre del alumno: \n");
        nombreAlumno = sc.nextLine();
        System.out.println("El nombre del alumno que ingreso es: " + nombreAlumno);

        int numeroContenedor = 5;
        System.out.println("Digite las calificaciones: ");

        int[] arrayCalificaciones = new int[numeroContenedor];
        for (int i = 0; i <numeroContenedor; i++) {
            System.out.println("Digite la calificacion numero " + (i+1) + ":" );
            arrayCalificaciones[i]= sc.nextInt();
         System.out.println("La calificacion ingresada numero " + (i+1) + " es: " + arrayCalificaciones[i] + "\n");

        }
        Promedio alumno1 = new Promedio(nombreAlumno,arrayCalificaciones);
        double promedioAlumno1 = alumno1.obtenerPromedio(arrayCalificaciones);
        String calificacionAlumno1 = alumno1.obtenerCalificacion(promedioAlumno1);

        alumno1.imprimirdatos(nombreAlumno, arrayCalificaciones, promedioAlumno1, calificacionAlumno1);

    }

}
