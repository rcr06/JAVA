package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci i secondi da trasformare: ");
        int totSec = input.nextInt();

        input.close();

        int giorni, ore, minuti, secondi, resti;

        giorni = totSec/86400;
        resti = totSec%86400;
        ore = resti/3600;
        resti%=3600;
        minuti=resti/60;
        resti%=60;
        secondi = resti;


        System.out.println("giorni:ore:minuti:secondi --> " + giorni + ":" + ore + ":" + minuti + ":" + secondi);
    }
}