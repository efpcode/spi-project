module org.example.passwordconsumer {
    requires org.example.passwordservice;
    exports org.example.passwordconsumer.password;
    uses org.example.passwordservice.password.PasswordCharacters;
}
