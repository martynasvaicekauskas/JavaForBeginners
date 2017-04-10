package paskaita3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by MartynasV on 2017-04-10.
 */
public class WriteToFile {
    public static void main(String[] args) {
        try {
            // true FileWriteri nurodo, kad failas bus papildomas
            // BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt"), true));

            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt")));
            bw.newLine(); // prideda nuo naujos eilutes
            bw.write("Benas");
            bw.close(); // butinas uzdarymas.
            // failo rasymas viska istrynus ir irasant is naujo (skaitosi, kad False).
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
