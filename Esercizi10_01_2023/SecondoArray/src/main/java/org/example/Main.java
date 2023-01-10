package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 = new int [10];
        for (int i=0; i<array.length; i++) {
            array[i] = input.nextInt();
            if (array[i]>=0){
                array2[i]=array[i];
            }
        }
        for (int i=array2.length; i>0; i--){
            System.out.println(array2[i-1]);
        }
    }
}