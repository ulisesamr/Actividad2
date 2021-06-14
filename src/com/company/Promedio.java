package com.company;

public class Promedio {

    String nombre;
    int[] calificaciones;
    public Promedio (String nombre,int[] calificaciones){
        this.nombre=nombre;
        this.calificaciones=calificaciones;
    }

    public double obtenerPromedio(int[] calificaciones){
        double suma = 0;
        for (int i=0; i<calificaciones.length; i++) {
            suma=suma+calificaciones[i];
        }
        double promedio = (suma/ calificaciones.length);
        return promedio;
    }
    public String obtenerCalificacion(double promedio){

        if (promedio <=50) {
            return "F";
        } else if (promedio >50 && promedio<=60) {
            return "E";
        } else if (promedio >60 && promedio<=70) {
            return "D";
        } else if (promedio >70 && promedio<=80) {
            return "C";
        } else if (promedio >80 && promedio<=90) {
            return "B";
        } else {
            return "A";
        }
    }

    public void imprimirdatos (String nombre, int[] calificaciones, double promedio, String calificacion){
        System.out.println("***** la calificacion del alumno es: ***** \n");
        System.out.println("Nombre del alumno: " + nombre);
        for (int i=0; i< calificaciones.length; i++){
            System.out.println("Calificacion " + (i+1) + " es: " + calificaciones[i]);

        }
        System.out.println("promedio: " + promedio);
        System.out.println("calificacion: " + calificacion);
    }


}