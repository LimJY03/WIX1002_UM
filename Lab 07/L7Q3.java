import java.io.*;

public class L7Q3 {

    public static void main(String[] args) {

        String line = "";

        try {

            BufferedReader fileInitial = new BufferedReader(new FileReader("./io_files/initial.txt"));
            PrintWriter fileFinal = new PrintWriter(new FileOutputStream("./io_files/reverse.txt"));

            line = fileInitial.readLine();

            while (line != null) {

                for (int i = line.length() - 1; i >= 0; i--) {
                    fileFinal.print(line.charAt(i));
                }

                fileFinal.println();

                line = fileInitial.readLine();
            }

            fileInitial.close();
            fileFinal.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }
}