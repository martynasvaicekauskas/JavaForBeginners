package paskaita6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MartynasV on 2017-04-11.
 */
// Sukurti objekto klasę, kuri saugotų informaciją apie Vartotoją (vardas, pavardė, amžius, miestas).
// Parašyti metodą, kuris iš duotų parametrų (vardas, pavardė, amžius, miestas) sukurtų objektą ir įdėtų jį kolekciją.
// Kolekcijos rezultatus atspausdinti ekrane.
    // 1.4 Naudojant sukurtą kolekciją, surikiuoti duomenis, naudojant Collections.sort ar sort metodą.
// Atspausdinti rezultatą ekrane.
public class uzdavinys3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        uzdavinys3 uzdav13 = new uzdavinys3();
        uzdav13.createPerson(persons, "Petras", "Petraitis", "Kaunas", 36);
        uzdav13.createPerson(persons, "Jonas", "Jonaitis", "Vilnius", 33);
        uzdav13.createPerson(persons, "Antanas", "Antanaitis", "Klaipėda", 31);
        uzdav13.createPerson(persons, "Petras", "Jonaitis", "Jonava", 30);
        uzdav13.spausdinti(persons);



    }
    private void spausdinti(List<Person> list){
        for (Person p: list) {
           // System.out.println(p.getVardas()+ "" + p.getPavarde()+ "" + p.getMiestas()+ "" + p.getAmzius());
            System.out.println(p); // Spausdina pagal toString metoda.
        }





    }
        private void createPerson (List<Person> person, String vardas, String pavarde, String miestas, int amzius) {
        Person p = new Person(vardas, pavarde, amzius, miestas);
       /* p.setVardas(vardas);
        p.setPavarde(pavarde);
        p.setMiestas(miestas);
        p.setAmzius(amzius); */
        person.add(p);


    }
    class Person {
        private String vardas;
        private String pavarde;
        private int amzius;
        private String miestas;

        // konstruktorius
        public Person (String vardas, String pav, int age, String town){
             this.vardas = vardas; // naudosim klases lygio kintamaji
            this.pavarde = pav;
            this.amzius = age;
            this.miestas = town;
        }

        @Override  // alt + insert / to String / padeda, kad nereikėtų rašyti užkomentuoto kodo viršuje.
        public String toString() {
            return "Person{" +
                    "vardas='" + vardas + '\'' +
                    ", pavarde='" + pavarde + '\'' +
                    ", amzius=" + amzius +
                    ", miestas='" + miestas + '\'' +
                    '}';
        }

        public String getVardas() { // alt + insert atsiranda lentele "Generate" tada Getters and Setters tada ctrl + a
            // pazymi viska ir OK.
            return vardas;
        }

        public void setVardas(String vardas) {
            this.vardas = vardas;
        }

        public String getPavarde() {
            return pavarde;
        }

        public void setPavarde(String pavarde) {
            this.pavarde = pavarde;
        }

        public int getAmzius() {
            return amzius;
        }

        public void setAmzius(int amzius) {
            this.amzius = amzius;
        }

        public String getMiestas() {
            return miestas;
        }

        public void setMiestas(String miestas) {
            this.miestas = miestas;
        }
    }
}
