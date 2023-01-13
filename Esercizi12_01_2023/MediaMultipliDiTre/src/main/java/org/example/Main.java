package org.example;

import java.util.Scanner;

public class Main {


    public static double mediaMultipliTre(int[] array, int n){
        double result = 0;

        for (int i=0;i<array.length;i++){
            if (array[i]%3==0){
                result+=array[i];
            }
        }

        return result/ array.length;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri da inserire? ");
        int n =input.nextInt();

        int[] array = new int[n];
        System.out.println("Inserisci numeri:");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Media dei multipli di tre: "+mediaMultipliTre(array, n));
    }
}