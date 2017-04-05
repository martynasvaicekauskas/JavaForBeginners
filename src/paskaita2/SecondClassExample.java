package paskaita2;

/**
 * Created by MartynasV on 2017-04-05.
 */
public class SecondClassExample {


    public static void main(String[] args) {
        // kaip priskirti reiksme
        // int - nurodome tipa pvz (int,double, String, boolean ir t.t)
        // x - jusu lokalaus kintamojo vardas, nors ir Petras! Visada prasideda mazaja raide
        // 20 - sveikas skaicius prasomas pagal nurodyta tipa!
        int x = 20;
        boolean isYouCanDrink = false;
        String name = "Petras or Sigis"; // visada reikmsme rasoma kabutese
        char a = 'a'; // viengubos kabutes ant charo
        // naudojamas tik tada kai norime atspausdinti reiksme i konsole! LN nukelia i nauja eilute
        System.out.println("Petras");
        SecondClassExample className = new SecondClassExample();
        className.example3();
        SecondClassExample.example2();


    }

        // metodas, nieko negrazina
        public static void example2 () {
        // cia metodo turinys, kuris atliekamas kai yra iskvieciamas metodas!

        }
        public void example3 () {
            example2();
        }

    }