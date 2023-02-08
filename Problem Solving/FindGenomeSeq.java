import java.util.Scanner;
import java.util.ArrayList;

public class FindGenomeSeq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line, pattern;

        do {

            // Prompt input
            System.out.print("Enter genome string [quit to stop] : ");
            line = sc.next();

            // Stop when "quit is entered"
            if (line.equals("quit")) { break; }
            
            // Initialization for each case
            ArrayList<String> result = new ArrayList<>();
            boolean started = false;
            int i = 0, start = 0, end = 0;

            // Traversing characters
            while (i < line.length() - 2) {

                // Get starting index
                if (line.substring(i, i+3).equals("ATG")) {
                    start = i + 3;
                    i += 2;
                    started = true;
                }

                // Get ending index
                if (started && (line.substring(i, i+3).equals("TAA") || 
                                line.substring(i, i+3).equals("TAG") || 
                                line.substring(i, i+3).equals("TGA")
                )) {
                    end = i;
                    i += 2;
                    started = false;
                    pattern = line.substring(start, end);
                    if (pattern.length() > 0 && pattern.length() % 3 == 0) { result.add(pattern); }
                }

                i++;
            }

            // Return result
            if (result.size() > 0) { result.forEach(gene -> System.out.println(gene)); }
            else { System.out.println("No gene is found"); }

        }
        while (true);

        sc.close();
    }
}