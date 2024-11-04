package com.ejemplo.bucles;

public class CalcularInteres {
    public static void main(String[] args) {
        double interes = 25.5;
        double prestamo = 35500;
        int igv = 18;

        double resultadoInteres1 = (prestamo*interes)/100;
        double resultadoInteres2 = (resultadoInteres1*igv)/100;

        System.out.println("Interes ganado: " + resultadoInteres1);
        System.out.println("IGV del Interes: " + resultadoInteres2);

    }

}
