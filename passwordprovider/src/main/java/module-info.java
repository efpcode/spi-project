import org.example.passwordprovider.provider.PassWordProviderDigits;
import org.example.passwordprovider.provider.PassWordProviderSymbols;
import org.example.passwordprovider.provider.PasswordProviderLetters;

module org.example.passwordprovider {
    requires org.example.passwordservice;
    provides org.example.passwordservice.password.PasswordCharacters with PasswordProviderLetters, PassWordProviderDigits, PassWordProviderSymbols;
}
