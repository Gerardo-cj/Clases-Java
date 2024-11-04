package com.ejemplo.bucles;

public class ConvertirPalabra {
    public static void main(String[] args) {

    String cadena = "francia";
    String resultado = cadena.toUpperCase();
        System.out.println("Palabra en mayuscula: " + resultado);

        int contador = 0;

        for(int x=0;x<cadena.length();x++) {
            if (Character.toLowerCase(cadena.charAt(x))=='a') {

                contador++;
                System.out.println("Volcal: a");}
                else if (Character.toLowerCase(cadena.charAt(x))=='e'){
                contador++;
                System.out.println("Volcal: e");}
                else if (Character.toLowerCase(cadena.charAt(x))=='i'){
                contador++;
                System.out.println("Volcal: i");}
                else if (Character.toLowerCase(cadena.charAt(x))=='o'){
                contador++;
                System.out.println("Volcal: o");}
                else if (Character.toLowerCase(cadena.charAt(x))=='u'){
                contador++;
                System.out.println("Volcal: u");}

               else{
               }

            }
        System.out.println("La palabra " + resultado + " contiene " + contador + " vocales");

    }



}
