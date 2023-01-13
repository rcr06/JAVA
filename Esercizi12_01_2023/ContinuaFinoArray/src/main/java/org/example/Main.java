package org.example;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[100];
        int somma=0;
        for (int i = 0; i<n.length; i++) {
            System.out.print("inserisci un numero negativo divisibile per due o uno positivo divisibile per tre: ");
            n[i]=input.nextInt();
            if (n[i]%2==0&&n[i]<0||n[i]%3==0&&n[i]>0){
                somma+=n[i];
            }else {
                System.out.println("il numero non è divisibile per due e/o non è negativo oppure il numero non è divicibile per tre e/o è negativo");
                break;
            }
        }
        System.out.println("Somma: "+somma);
        }
    }
