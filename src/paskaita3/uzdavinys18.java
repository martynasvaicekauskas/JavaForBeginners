package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/**
 * Created by MartynasV on 2017-04-10.
 */
// Faile surašyti žmonių vardai. Parašyti programą kuri juos nuskaitytų ir atvaizduotų ekrane.
// Sukurtas failas Persons.txt
public class uzdavinys18 {
    public static void main(String[] args) {
        try {
            // galima rasyti viska vienoje eiluteje
            // BufferedReader bf = BufferedReader (new Filereader(new File("Persons.txt")));
            // importas daromas ctrl + space and File ir importina.
            File file = new File("Persons.txt");
            // sukuriamas faile reader objektas
            FileReader fileReader = new FileReader(file);
            // sukurti buffered reader
            BufferedReader bf = new BufferedReader(fileReader);
            String line = null;
            while ((line=bf.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nepavyko rasti failo");
        } catch (IOException e) {
            System.out.println("Nepavyko nuskaityti failo");
            // arba gali buti ->  e.printStackTrace();
        }
    }
}