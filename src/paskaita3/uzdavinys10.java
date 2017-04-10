package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-10.
 */
// Parašyti programą kuri paprašo vartotojo įvesti skaičių n ir suskaičiuoja sumą visų skaičių nuo vieno iki n.
// Jeigu įvestas skaičius mažesnis nei vienas, programa turi informuoti apie blogą įvestį.
public class uzdavinys10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = 0;
        boolean tinka = true;
        do {
            System.out.println("Iveskite skaiciu");
            numb = sc.nextInt();
            if (numb < 1) {
                System.out.println("Skaicius blogas, turi buti didesnis uz 0");
                tinka = false;
            } else {
                tinka = true;
            }
        } while (!tinka);
        int sum = 0;
        for (int i=0; i<=numb; i++) {
            sum+=i;
            System.out.println(i + "");

        }
        System.out.println("Skaiciu suma nuo 1 iki Jusu ivesto skaiciaus yra " + sum);
    }
}
