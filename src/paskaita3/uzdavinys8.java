package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
// 1.8.  Realizuoti 1.7. užduotį panaudojant metodą kurio parametras  būtų vartotojo įvestų skaičių masyvas
// ir skaičių didesnių nei 100 atvaizdavimas vyktų pačiame metode.
public class uzdavinys8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu ketinate ivesti?");
        int x = sc.nextInt();
        int[] mas = new int[x];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite  " + (i + 1) + " skaiciu");
            mas[i] = sc.nextInt();
        }
        SecondClass(mas);
    }
        private static void SecondClass (int[]mas){
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] >= 100) {
                    System.out.print((mas[i]) + "\t");
                }

        {
        }

        }
    }


}

