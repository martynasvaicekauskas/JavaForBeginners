package paskaita3;

        import java.util.InputMismatchException;
        import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */

// Papildykite 1.3. programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.
public class uzdavinys4 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int numb= 1;
            do {
                try {
                    System.out.println("Iveskite skaiciu");
                    numb = sc.nextInt();
                    sum += numb; // kad prie sumos būtų pridėta įvestų skaičių suma
                } catch (InputMismatchException e){
                    System.out.println("Ivedete ne skaiciu");
                    sc.nextLine(); // tam, kad toliau prasytu ivedineti skaiciu? Next ar Nextline?
                }
            } while (numb != 0);
            System.out.println("Ivestu skaiciu suma " + sum);

        }
    }
