package org.example;

import java.util.Scanner;

public class Main {
    static final int n=10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[n];
        System.out.println("Inserisci numeri:");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        for (int i=n;i>0;i--){
            System.out.println(array[i-1]);
        }

    }
}