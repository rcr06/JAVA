package org.example;

import java.util.Scanner;

public class Main {

    public static final int n =10;
    public static void stampaInverso(int[] array){

        for (int i=0;i<n;i++){
            if (i%2==0){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[n];
        System.out.println("Inserisci 10 numeri:");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        stampaInverso(array);
    }
}