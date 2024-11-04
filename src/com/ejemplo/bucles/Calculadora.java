package com.ejemplo.bucles;

import java.util.Objects;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Operación matematica (suma, resta, multiplicacion, division, exponente): ");
        String Operacion = scanner.nextLine();

        System.out.println("Ingrese Primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese segundo número: ");
        double numero2 = scanner.nextDouble();

        if (Objects.equals(Operacion, "suma")){
            double suma1 = numero1+numero2;
            System.out.println("Resultado es: " + suma1);}

        else if (Objects.equals(Operacion, "resta")){
            double resta1 =numero1 - numero2;
            System.out.println("Resultado es: " + resta1);}

        else if (Objects.equals(Operacion, "multiplicacion")){
            double multiplicacion1 =numero1 * numero2;
            System.out.println("Resultado es: " + multiplicacion1);}

        else if (Objects.equals(Operacion, "division")){
            double division1 =numero1 / numero2;
            System.out.println("Resultado es: " + division1);}

        else if (Objects.equals(Operacion, "exponente")){
            double exponente1 = Math.pow(numero1, numero2);
            System.out.println("Resultado es: " + exponente1);}
        else {
            System.out.println("No se encontró la operación matemática");}
        }
    }


