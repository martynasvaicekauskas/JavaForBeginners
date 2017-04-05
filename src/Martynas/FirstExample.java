package Martynas;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-04.
 */
public class FirstExample {
    public static void main (String[] args){
        System.out.println("Hi Martynas");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();
        int sum = example.sum(10,20);
        // System.out.println (example.sum (10,20)); taip pat teisingas variantas.
        System.out.println(sum);
        Scanner scanner = new Scanner (System.in);
       /* System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.println ("Inserted number >>" + insertedNumb); */
        example.userName(scanner);
        System.out.println ("Please insert number one");
        System.out.println ("Please insert number two");
        int insertedNumb1 = scanner.nextInt();
        int insertedNumb2 = scanner.nextInt();
        System.out.println (example.sum(insertedNumb1, insertedNumb2));
        System.out.println (example.minus(insertedNumb1, insertedNumb2));
    }
}

class FirstExampleSupportClass {
    private void enterWord (String name) {
        System.out.println ("Vardo ilgis " + name.length());

    }


    public void userName(Scanner sc) {
        System.out.println("Please insert your name");
        String name = sc.nextLine();
        System.out.println("Hi " + name);
        enterWord(name);
    }

    public void sayHi () {
        System.out.println ("Labas");
    }

    public int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;


    }
    public int minus (int firstNumb, int secondNumb) {
        return firstNumb - secondNumb;
    }
        }