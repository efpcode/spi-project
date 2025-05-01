package org.example.passwordconsumer.password;

import org.example.passwordservice.password.EntropyMode;
import org.example.passwordservice.password.PasswordCharacters;

import java.util.ServiceLoader;
import java.util.Set;

import static java.io.IO.println;

public class PassWordConsumer {
    private static StringBuilder characters= new StringBuilder();
    public static void passwordGenerator(Set<String> allowedCharacters) {

        ServiceLoader<PasswordCharacters> loader = ServiceLoader.load(PasswordCharacters.class);

        for(PasswordCharacters p : loader){
            EntropyMode entropyMode = p.getClass().getAnnotation(EntropyMode.class);
            if(entropyMode != null && allowedCharacters.contains(entropyMode.value())){
                characters.append(p.allowedPasswordCharacters());
            }

        }

        if(characters.toString().trim().isEmpty() ){
            println("No matching entropy option found");
            throw new RuntimeException("No PasswordCharacters implementation found");
        }

    }

    public static String passwordGenerator(int length) {
        return PassWordGenerator.passwordSeeder(length, characters.toString());
    }
}
