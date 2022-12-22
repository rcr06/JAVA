package org.example;

import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        double perimetro;

        System.out.println("Inserisci lato del quadrato: ");
        float lato = input.nextInt();
        area = lato*lato;
        System.out.println("Area del quadrato: " + area + "cm^2");
        perimetro = lato*4;
        System.out.println("Perimetro del quadrato" + perimetro);

        System.out.println("Inserisci base del rettangolo: ");
        float base = input.nextInt();
        System.out.println("Inserisci altezza del rettangolo: ");
        double altezza = input.nextInt();
        area = base*altezza;
        perimetro = (base*2)+(altezza*2);
        System.out.println("Area del rettangolo: " + area + "cm^2");
        System.out.println("Perimetro del rettangolo: " + perimetro);

        System.out.println("Inserisci lato del triangolo equilatero: ");
        base = input.nextInt();
        altezza = Math.sqrt(3)/2*base;
        area = (base*altezza)/2;
        perimetro = base*3;
        System.out.println("Area del triangolo: " + area + "cm^2");
        System.out.println("Perimetro del rettangolo: " + perimetro);


        System.out.println("Inserisci raggio del cerchio: ");
        float raggio =input.nextInt();
        area = (raggio*raggio)*Math.PI;
        perimetro = (raggio*2)*Math.PI;
        System.out.println("Area del cerchio: " + area + "cm^2");
        System.out.println("Perimetro del cerchio: " + perimetro);


        input.close();
    }
}