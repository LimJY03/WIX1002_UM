import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class L7Q5 {

    public static void main(String[] args) {

        int recordCount = 0;

        try {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("./io_files/person.dat"));
            LinkedHashMap<String, Integer> data_1 = new LinkedHashMap<>();
            LinkedHashMap<String, Character> data_2 = new LinkedHashMap<>();

            recordCount = file.readInt();

            String[] names = new String[recordCount];

            for (int i = 0; i < recordCount; i++) {

                names[i] = file.readUTF();

                data_1.put(names[i], file.readInt());
                data_2.put(names[i], file.readChar());
            }

            Arrays.sort(names);

            for (String name: names) {
                System.out.printf("Name: %-12s, Age: %-2d, Gender: %1s\n", name, data_1.get(name), data_2.get(name));
            }

            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }
}