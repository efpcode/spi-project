package org.example.passwordprovider.provider;

import org.example.passwordservice.password.EntropyMode;
import org.example.passwordservice.password.PasswordCharacters;

@EntropyMode("symbols")
public class PassWordProviderSymbols implements PasswordCharacters {
    @Override
    public String allowedPasswordCharacters() {
        return EntropyConstants.SYMBOLS.characters();
    }
}
