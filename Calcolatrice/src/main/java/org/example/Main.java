package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci x: ");
        float x = input.nextFloat();

        System.out.print("Inserisci y: ");
        float y = input.nextFloat();

        float somma = x+y;
        float differenza = x-y;
        float moltiplicazione = x*y;
        float divisione = x/y;

        System.out.println("x + y = " + somma);
        System.out.println("x - y = " + differenza);
        System.out.println("x * y = " + moltiplicazione);
        System.out.println("x / y = " + divisione);

        input.close();
    }
}