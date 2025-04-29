package org.example.passwordprovier.provider;

import org.example.passwordservice.password.EntropyMode;
import org.example.passwordservice.password.PasswordCharacters;

@EntropyMode("digits")
public class PassWordProviderDigits implements PasswordCharacters {
    @Override
    public String allowedPasswordCharacters() {
        return EntropyConstants.DIGITS.characters();

    }
}
