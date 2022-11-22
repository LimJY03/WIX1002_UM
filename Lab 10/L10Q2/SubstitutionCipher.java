package L10Q2;

import java.io.*;

public class SubstitutionCipher implements MessageEncoder {

    protected String inputPath, outputPath;
    protected int shiftAmount;

    // Constructor
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputPath = "./L10Q2/io_files/" + inputFileName;
        this.outputPath = "./L10Q2/io_files/" + outputFileName;
        this.shiftAmount = shift;
    }

    // Methods
    @Override
    public String encode(String plainText) {
        String encodedMessage = "";
        for (int i = 0; i < plainText.length(); i++) { encodedMessage += (char) (plainText.charAt(i) + this.shiftAmount); }
        return encodedMessage;
    }

    @Override
    public String decode(String cipherText) {
        String encodedMessage = "";
        for (int i = 0; i < cipherText.length(); i++) { encodedMessage += (char) (cipherText.charAt(i) - this.shiftAmount); }
        return encodedMessage;
    }

    public void convertFrom(String type) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(this.inputPath));
            FileWriter output = new FileWriter(this.outputPath);
            String content = "", converted = "", thisLine;

            while((thisLine = file.readLine()) != null) { content += thisLine + "\n"; }
            if (type.toLowerCase().contains("plain")) { converted = this.encode(content); }
            else if (type.toLowerCase().contains("cipher")) { converted = this.decode(content); }

            output.write(converted);
            file.close();
            output.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }
}
