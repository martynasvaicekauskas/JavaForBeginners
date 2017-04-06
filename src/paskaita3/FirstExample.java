package paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-06.
 */
public class FirstExample {
    public static void main(String[] args) {

        int a = 50;
        int b = 40;
        if (a >= b) {
            System.out.println("Taip tai tiesa");
        } else {
            System.out.println("Ne ne");
        }


        System.out.println("Value is >>" + (a != b ? 120 : 100));
        if (a < b) {
            System.out.println("tiesa");
        } else if (a != b) {
            System.out.println("tiesa2");
        } else {
            System.out.println("Ne");
        }
        int val = 3;
        switch (val) { // naudojamas meniu punktams, patogu tureti viena servisa kuris viska tvarko.
            case 1:
                System.out.println("radom 1");
                break;

            case 2:
                System.out.println("radom 2");
                break;
            default:
                System.out.println("Nieko nerado");
                break;

        }
        exceptionExample();
        masExample();

    }

    private static void masExample() { // masyvo pavyzdys
        int[] mas = new int[3];
        // reiksmes idejimas i masyva
        mas[0] = 12;
        mas[1] = 1;
        mas[2] = 5;
        // reiksmes paemimas is masyvo
        System.out.println("1 reiksme yra " + mas[0]);
        printMas(mas);
    }
    private static void printMas (int[] mas) { // ciklo pavyzdys
        for (int i=0; i < mas.length; i++) {
            System.out.println("mas["+i+"] yra >>" + mas[i]);
        }
    }



    private static void exceptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("irasykite tik skaiciu!!");
        try {
            int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra >>" + numb);
        } catch (InputMismatchException e) {
            System.out.println("Juk prasiau ivesti skaiciu");
        }


    }
}
