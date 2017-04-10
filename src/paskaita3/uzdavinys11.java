package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-10.
 */
//  Parašyti programą kuri paprašo vartotojo įvesti skaičių n, tuomet leidžia pasirinkti ką suskaičiuoti,
// skaičių nuo 1 iki n sumą arba sandaugą (1 - suma, 2 - sandauga). Jeigu įvestas skaičius mažesnis nei vienas,
// programa turi informuoti apie blogą įvestį.
public class uzdavinys11 {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Bloga ivestis, skaiciu turi buti didesnis nei 1");
            return n; // ar taip galima?
        }
        System.out.println("Pasirinkite operacija: 1 - suma, 2 - sandauga");
        int operacija = sc.nextInt();
        switch (operacija) {
            case "suma":
                int sum = suma(n);
                System.out.println("Skaiciu suma lygi" + sum);
                break;
            case "sandauga":
                int saudauga = sandauga(n);
                System.out.println("Skaiciu sandauga lyg " + saudauga);
                break;
        }

    private static int suma(int numb) {
        int sum = 0;
        int i = 1;
        while (i <= numb) {
            sum += i;
            i++;
        }
        return sum;
    }

    private static int sandauga(int numb) {
        int sandauga = 1;
        int i = 2;
        while (i <= numb){
            sandauga *= i;
            i++;
        }
        return sandauga;


    }


}
}
