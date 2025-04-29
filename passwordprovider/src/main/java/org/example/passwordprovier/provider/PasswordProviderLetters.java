package org.example.passwordprovier.provider;

import org.example.passwordservice.password.EntropyMode;
import org.example.passwordservice.password.PasswordCharacters;

@EntropyMode("letters")
public class PasswordProviderLetters implements PasswordCharacters {
    @Override
    public String allowedPasswordCharacters() {
        return EntropyConstants.LETTERS_LOWERCASE.characters() + EntropyConstants.LETTERS_UPPERCASE.characters();
    }
}
