import java.io.*;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class L7Q1 {

    public static void main(String[] args) {

        LinkedHashMap<String, String> data = new LinkedHashMap<>(4);
        Scanner sc = new Scanner(System.in);

        // Structure table data into hashmap
        data.put("WXES1116", "Programming I");
        data.put("WXES1115", "Data Structure");
        data.put("WXES1110", "Operating System");
        data.put("WXES1112", "Computing Mathematics I");

        // Write into courses.dat
        try {

            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("./io_files/courses.dat"));

            for (String code: data.keySet()) {
                file.writeUTF(code);
                file.writeChar(':');
                file.writeUTF(data.get(code));
                file.writeChar(',');
            }

            file.close();
        }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }

        // Read from courses.dat
        try {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("./io_files/courses.dat"));
            String code = "", temp = "";

            System.out.print("Enter the course code: ");
            code = sc.next();

            while (!code.equalsIgnoreCase(temp)) {
                temp = file.readUTF();
                file.readChar();
            }

            System.out.printf("Course Name for %s is %s.", code, file.readUTF());

            file.close();
        }
        catch (EOFException e) {}
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e.getMessage()); }
    }
}