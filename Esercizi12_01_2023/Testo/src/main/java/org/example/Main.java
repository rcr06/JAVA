package org.example;

import java.util.Scanner;

public class Main {

    public static boolean trovaParola(String testo, String parola) {
        int y, x=0;
        for (int i = 0; i < testo.length(); i++) {
            if (parola.charAt(0) == testo.charAt(i)) {
                y=i+1;
                for (int j=1; j<parola.length();j++){
                    if (testo.charAt(y)==parola.charAt(j)){
                        x++;
                        y++;
                        if (x==parola.length()-1){
                            return true;
                        }
                    }
                }
            }else{
                x=0;
            }
        }
        return false;
    }

    public static String trovataFacilmente(String testo, String parola){
        String facile = "";
        if (testo.contains(parola)){
            facile = "trovata!!";
        }
        return facile;
    }


    public static void main(String[] args) {
        System.out.print("Inserisci un testo: ");
        Scanner input = new Scanner(System.in);
        String testo = input.nextLine();
        System.out.print("parola da trovare: ");
        String parola = input.nextLine();
        System.out.println(trovaParola(testo, parola));
        System.out.println(trovataFacilmente(testo,parola));
    }
}