package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
public class uzdavinys3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int numb;
        do {
            System.out.println("Iveskite skaiciu");
            numb = sc.nextInt();
            sum += numb; // kad prie sumos būtų pridėta įvestų skaičių suma
        } while (numb != 0);
        System.out.println("Ivestu skaiciu suma " + sum);

                    }
    }


