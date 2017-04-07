package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
// Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.  Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.
public class uzdavinys6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mas = new String[5];
        System.out.println("Irasykite 5 zodius");
        for (int i=0; i<5; i++) {
            System.out.println("Iveskite " + (i+1) + " zodi");
            mas[i]= sc.nextLine();

        }
        System.out.println("Jusu ivesti zodziai  ");
        for (int i=0; i<5; i++) {
            System.out.print(mas[i] + "\t");
        }



    }
}
