package com.ejemplo.bucles;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EstacionDelAño {

    public static void main(String[] args) {
        // BUCLE FOR

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Mes: ");
        String mes = scanner.nextLine();

        List<String> listaEstaciones = List.of("Primavera", "verano", "Otoño", "Invierno");


        if (Objects.equals(mes, "marzo")||Objects.equals(mes, "abril")||Objects.equals(mes, "mayo")) {
            System.out.println("Estación del año: " + listaEstaciones.get(0));
        }
        else if (Objects.equals(mes, "junio")||Objects.equals(mes, "julio")||Objects.equals(mes, "agosto")) {
            System.out.println("Estación del año: " + listaEstaciones.get(1));
        }
        else if (Objects.equals(mes, "setiembre")||Objects.equals(mes, "octubre")||Objects.equals(mes, "noviembre")) {
            System.out.println("Estación del año: " + listaEstaciones.get(2));
        }
        else if (Objects.equals(mes, "diciembre")||Objects.equals(mes, "enero")||Objects.equals(mes, "febrero")) {
            System.out.println("Estación del año: " + listaEstaciones.get(3));
        }
        else {

            System.out.println("No se tiene registro");
        }
    }
}

