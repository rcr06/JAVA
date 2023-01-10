package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,2,3,2};
        int sommaPari =0;
        int sommaDispari =0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                sommaPari+=array[i];
            }else{
                sommaDispari+=array[i];
            }
        }
        if (sommaPari==sommaDispari){
            System.out.println("Pari e dispari uguali");
        }else {
            System.out.println("Pari e dispari diversi");
        }
    }
}