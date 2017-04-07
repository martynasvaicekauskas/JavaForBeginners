package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
// 1.5.  Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.
public class uzdavinys5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[5];
        int sum = 0;
        System.out.println("Iveskite 5 skaičius");
        for (int i=0; i < 5; i++){
            System.out.println("Iveskite " + (i +  1) + " skaiciu");
            mas[i] = sc.nextInt();
            sum += mas[i];
            }
        System.out.println("Jus ivedete tokius skaicius");
        for (int i =0; i <5; i++) {
            System.out.print(mas[i] + "\t"); // jeigu nera "ln" spausdina vienoje eilute, \t yra "all tabs"
        }
        System.out.println("Skaičių suma " + sum);
              }
    }


