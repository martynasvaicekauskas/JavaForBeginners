package paskaita3;

/**
 * Created by MartynasV on 2017-04-06.
 */
public class ConstructorExample {
    // tuscias konstruktorius, visos klases ji turi pagal nutylejima tuscia konstruktoriu.
    public ConstructorExample () {
        System.out.println("Tuscias konstruktorius");
    }
    // konstruktoriui perduodama reikme vienas skaicius
    public ConstructorExample (int id) {
        System.out.println("2 konstruktorius su reiksme >>" + id);
    }

}
class MyMainApp {
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);
    }
}