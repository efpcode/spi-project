package org.example.passwordconsumer.password;

import java.security.SecureRandom;

public class PassWordGenerator {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    private PassWordGenerator() {}

    public static String passwordSeeder(int length, String allowedChars) {
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = SECURE_RANDOM.nextInt(allowedChars.length());
            result.append(allowedChars.charAt(index));
        }
        return result.toString();

    }
}
