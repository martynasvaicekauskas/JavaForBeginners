package paskaita3;

import java.io.*;

/**
 * Created by MartynasV on 2017-04-10.
 */
public class ChangeFileExample {
    public static void main(String[] args) {
        String[] names = readFile("Persons.txt");
        for (int i = 0; i < names.length; i++){
            names[i]= names[i].replaceAll("a", "w");
        }
        writeToFile("Persons1.txt", names);

    }
    private static void writeToFile(String fileName, String[] names) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));
            // for (String name:names){
            // bw.write(name);
            // }
            for (int i=0; i< names.length; i++){
                bw.write(names[i]);
                bw.newLine();
            }
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String[] readFile(String fileName){
        String[] names=new String[getLineCount(fileName)];
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
            // names = new String[(int)bf.lines().count()];
            String line = null;
            int j=0;
            while ((line = bf.readLine())!=null) { // !=null jeigu nelygu 0 tai vykdo cikla.
                names [j++] = line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    return names;

}
private static int getLineCount(String fileName){
        int count = 0;
    try {
        BufferedReader bf = new BufferedReader(new FileReader(new File(fileName)));
        count=(int)bf.lines().count();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return count;

}
}

