package paskaita3;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-07.
 */
// 1.9.  Sukurti supaprastintą skaičiuoklės programą kuri paprašytų įvesti du skaičius ir operacijos tarp jų  skaičių
// (1 – suma, 2 – skirtumas, 3 – sandauga). Gautą rezultatą programa pavaizduotų ekrane ir paklaustų ar norėsime kartoti
// . Įvedus skaičių 5, programa turėtų kartoti darbą iš naujo, priešingu atveju programa baigtų darbą.
public class uzduotis9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Iveskite pirma skaiciu:");
        double firstNumb = getCorrectNumber(sc, "Iveskite pirma skaiciu");
       // System.out.println("Iveskite antra skaiciu:");
        double secondNumb = getCorrectNumber(sc, "Iveskite antra skaiciu");
        System.out.println("Iveskite komanda pvz (+;-; /; *): ");
        String action = sc.next();
        calculator(firstNumb, secondNumb, action);
    }
    private static double getCorrectNumber (Scanner scanner, String title){
        while (true) {
            System.out.println(title);
            try {
                double numb = scanner.nextDouble();
                return numb;
            } catch (Exception e) {
                System.out.println("KA TU DARAI AR MASTAI?");
                scanner.nextLine();

            }
        }


    }
    private static void calculator(double firstNumb, double secondNumb, String action) {
        switch (action){
            case "+":
                sum(firstNumb, secondNumb);
                break;
            case"-":
                minus(firstNumb, secondNumb);
                break;
            case "*":
                multiply(firstNumb, secondNumb);
                break;
            case "/":
                division(firstNumb, secondNumb);
                break;
            default:
                System.out.println("Komanda Nerasta!!");
                break;


        }
    }

    private static void sum(double firstNumb, double secondNumb) {
        System.out.println("suma yra >> " + (firstNumb + secondNumb));
    }

    private static void minus(double firstNumb, double secondNumb) {
        System.out.println("skirtumas yra >> " + (firstNumb - secondNumb));

    }

    private static void multiply(double firstNumb, double secondNumb) {
        System.out.println("daugyba yra >> " + (firstNumb * secondNumb));

    }

    private static void division(double firstNumb, double secondNumb) {
        if (secondNumb != 0) {
            System.out.println("dalyba yra >> " + (firstNumb / secondNumb));
        } else {
            System.out.println("dalyba iš nulio negalima!!!");
        }
    }
}
