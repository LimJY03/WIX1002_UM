package L10Q3;

import L10Q2.MessageEncoder;

import java.io.*;

public class ShuffleCipher implements MessageEncoder {

    protected String inputPath, outputPath;
    protected int shuffleCount;

    // Constructor
    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputPath = "./L10Q3/io_files/" + inputFileName;
        this.outputPath = "./L10Q3/io_files/" + outputFileName;
        this.shuffleCount = N;
    }

    // Methods
    @Override
    public String encode(String plainText) {
        String left = plainText.substring(0, plainText.length() / 2), right = plainText.substring(plainText.length() / 2), shuffled = "";
        for (int i = 0; i < Math.max(left.length(), right.length()); i++) {
            if (i < left.length()) { shuffled += left.charAt(i); }
            shuffled += right.charAt(i);
        }
        return shuffled;
    }

    @Override
    public String decode(String cipherText) {
        String left = "", right = "";
        int alternateLength = cipherText.length() / 2 * 2;
        for (int i = 0; i < alternateLength; i += 2) {
            left += cipherText.charAt(i);
            right += cipherText.charAt(i + 1);
        }
        if (cipherText.length() % 2 != 0) { return left + right + cipherText.charAt(cipherText.length() - 1); }
        return left + right;
    }

    public void shuffleFrom(String type) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(this.inputPath));
            FileWriter output = new FileWriter(this.outputPath);
            String content = "", thisLine;

            while((thisLine = file.readLine()) != null) { content += thisLine + "\n"; }
            for (int i = 0; i < this.shuffleCount; i++) {
                if (type.toLowerCase().contains("normal")) { content = encode(content); }
                else if (type.toLowerCase().contains("shuffle")) { content = decode(content); }
            }

            output.write(content);
            file.close();
            output.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }
}