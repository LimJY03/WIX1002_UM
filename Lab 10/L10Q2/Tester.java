package L10Q2;

public class Tester {

    public static void main(String[] args) {

        SubstitutionCipher plainInput = new SubstitutionCipher("inputPlain.txt", "outputCipher.txt", 5);
        SubstitutionCipher cipherInput = new SubstitutionCipher("inputCipher.txt", "outputPlain.txt", 5);

        plainInput.convertFrom("Plain");
        cipherInput.convertFrom("Cipher");
    }
}