package org.example.passwordprovier.provider;

public class EntropyConstants {

    public static final EntropyType LETTERS_LOWERCASE = new EntropyType("LETTERS_LOWERCASE", "abcdefghjiklmnopqrstuvwxyz");
    public static final EntropyType LETTERS_UPPERCASE = new EntropyType("LETTERS_UPPERCASE", "ABCDEFGHJIKLMNOPQRSTUVWXYZ");
    public static final EntropyType DIGITS = new EntropyType("DIGITS", "0123456789");
    public static final EntropyType SYMBOLS = new EntropyType("SYMBOLS", "!@$%^&*()_+");

}
