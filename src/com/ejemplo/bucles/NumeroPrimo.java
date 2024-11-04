package com.ejemplo.bucles;

public class NumeroPrimo {

    public static void main(String[] args) {

       int num=5;
        boolean primo = true;

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo)
            System.out.println("El número es Primo.");
        else
            System.out.println("El número NO es primo.");


    }

}
