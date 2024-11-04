package com.ejemplo;

public class operadorCondicional {

    public static void main(String[] args) {
        int edad = 9;
        int numero1 = 10;
        int numero2 = 5;
        int suma = numero1 + numero2;

       // System.out.println("suma: "+suma);

//condicional if
        String resultadoCondicional = "Es menor de edad";

        if (edad>=11) {
            resultadoCondicional = "Es mayor de edad";
        }
                System.out.println("resultado edad: "+resultadoCondicional);


    }
}
