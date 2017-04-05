package paskaita2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by MartynasV on 2017-04-05.
 */
public class ThirdExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your kg");
        double kg = sc.nextDouble();
        System.out.println ("Please insert you height cm");
        double m = sc.nextDouble();
        double kmi = kg/(m*m);
        System.out.println("KMI yra >> " + kmi);
        double result = kmi(kg,m);
        System.out.println("KMI 2 yra >>" + result);
        System.out.println("Sanaudos yra >>" + read(sc));

    }
    public static double kmi (double kg, double m) {
        return kg /(m*m);
    }
    public static double average (double km, double san) {
        return (san*100)/km;
    }
    public static double read (Scanner sc) {
        System.out.println("Please insert km");
        double km =sc.nextDouble();
        System.out.println("Please insert san");
        double san= sc.nextDouble();
        return average(km,san);
    }
}

