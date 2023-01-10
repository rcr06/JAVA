package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str);
    }
}