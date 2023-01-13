package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somma=0;
        for (int i = 1; i >0; i++) {
            System.out.print("inserisci un numero negativo divisibile per due o uno positivo divisibile per tre: ");
            int n=input.nextInt();
            if (n%2==0&&n<0||n%3==0&&n>0){
                somma+=n;
            }else {
                System.out.println("il numero non è divisibile per due e/o non è negativo oppure il numero non è divicibile per tre e/o è negativo");
                break;
            }
        }
        System.out.println("Somma: "+somma);
    }
}