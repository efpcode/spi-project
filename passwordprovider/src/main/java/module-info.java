import org.example.passwordprovier.provider.PassWordProviderDigits;
import org.example.passwordprovier.provider.PassWordProviderSymbols;
import org.example.passwordprovier.provider.PasswordProviderLetters;

module org.example.passwordprovider {
    requires org.example.passwordservice;
    provides org.example.passwordprovier.provider with PasswordProviderLetters, PassWordProviderDigits, PassWordProviderSymbols;
}
