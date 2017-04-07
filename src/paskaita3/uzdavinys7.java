package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
// Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko.
// Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
public class uzdavinys7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu ketinate ivesti?");
        int x = sc.nextInt();
        boolean isNumberIsFound = false;
        int[] mas = new int[x];
        for (int i=0; i< mas.length; i++) {
            System.out.println("Iveskite  " + (i+1) + " skaiciu");
            mas [i] = sc.nextInt();
        }
        for (int i=0; i<mas.length; i++) {
            if ( mas [i] >= 100) {
                System.out.print((mas [i]) + "\t"  );
                isNumberIsFound = true;
            }

        }

        if (!isNumberIsFound){
            System.out.println("Neradome");

        }

    }
}
