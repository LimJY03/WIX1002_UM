package L10Q2;

public interface MessageEncoder {
    public String encode(String plainText);
    public String decode(String cipherText);
}