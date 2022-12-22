package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci giorni: ");
        int giorni = input.nextInt();
        System.out.print("Inserisci ore: ");
        int ore = input.nextInt();
        System.out.print("Inserisci minuti: ");
        int minuti = input.nextInt();
        System.out.print("Inserisci secondi: ");
        int secondi = input.nextInt();

        input.close();

        int totSec = 0;
        totSec += giorni*86400;
        totSec += ore*3600;
        totSec += minuti*60;
        totSec += secondi;

        System.out.print("Totale secondi: " + totSec);

    }
}