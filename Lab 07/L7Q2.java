import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

import java.util.Scanner;

public class L7Q2 {

    public static void main(String[] args) {

        try {

            // Get website contents
            URL url = new URL("https://fsktm.um.edu.my");
            URLConnection connection = url.openConnection();
            InputStream stream = connection.getInputStream();
            Scanner content = new Scanner(stream);

            // Write into index.htm
            FileWriter file = new FileWriter("./io_files/index.htm");
            String finalFile = "";

            while (content.hasNext()) {
                finalFile += content.nextLine() + "\n";
            }

            file.write(finalFile);

            content.close();
            file.close();
        }
        catch (IOException e) { System.out.printf("IO Error: %s", e.getMessage()); }
    }
}