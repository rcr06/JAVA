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

        System.out.println("x + y = " + somma);

    input.close();
    }
}