package org.example;

import java.util.Scanner;

public class Main {

    public static final int n=10;

    public static int[] inserisciArray(int[]array){
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci numeri:");
        for (int i=0;i<n;i++){
            array[i]= input.nextInt();
        }
        return array;
    }



    
    public static void main(String[] args) {
        int[] array = new int[n];
        int[] stampa = inserisciArray(array);
        for (int i=0;i<n;i++){
            System.out.println(stampa[i]);
        }
    }
}