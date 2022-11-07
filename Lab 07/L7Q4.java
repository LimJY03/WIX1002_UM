import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L7Q4 {

    public static void main(String[] args) {

        int lineCount = 0, wordCount = 0, charCount = 0;
        String line = "";

        try {
            BufferedReader file = new BufferedReader(new FileReader("./io_files/initial.txt"));

            line = file.readLine();

            while (line != null) {

                lineCount += 1;
                wordCount += line.split(" ").length;
                charCount += line.length();

                line = file.readLine();
            }

            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }

        System.out.printf("There are %d lines, %d words and %d characters in this file.\n", lineCount, wordCount, charCount);
    }
}
