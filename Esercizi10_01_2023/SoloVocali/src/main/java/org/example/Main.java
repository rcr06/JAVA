package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("[bcdfghjklmnpqrstvwxyz BCDFGHJKLMNPQRSTVWXYZ]", "");
        System.out.println(str);
    }
}