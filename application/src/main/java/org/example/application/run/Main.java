package org.example.application.run;

import org.example.menuconsumer.consumer.ServiceMenuConsumer;
import org.example.passwordconsumer.password.PassWordConsumer;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.io.IO.println;
import static java.io.IO.readln;

public class Main {
    public static void main(String[] args) {
        boolean isLoop = true;
        while (isLoop) {
            ServiceMenuConsumer.initializeMenu();
            ServiceMenuConsumer.showMenu();

            var option = getOption();

            switch (option) {
                case 2 -> showOptionsMenu();
                case 3 -> System.exit(0);
                default -> PassWordConsumer.passwordGenerator(Set.of("letters"));
            }

            ServiceMenuConsumer.showPasswordLengthMenu();
            var lengthOfPassword = getOption();
            System.out.println(PassWordConsumer.passwordGenerator(lengthOfPassword));

            ServiceMenuConsumer.showExitMenu();
            var userInput = readln(">>> ").toLowerCase();

            isLoop = !userInput.contains("n");


        }
    }

    private static int getOption() {
        while(true){
            var userInput = readln(">>> ");
            try {
                return Integer.parseInt(userInput);

            }catch (NumberFormatException e){
                println("Invalid entry, please use only digits");
            }
        }
    }


    private static void showOptionsMenu() {
        ServiceMenuConsumer.showOptionsMenu();
        var option = readln(">>> ");
        PassWordConsumer.passwordGenerator(entropyOptions(option));

    }


    private static Set<String> entropyOptions(String userInput) {
        if(userInput.isBlank()){
            userInput = "1";
        };
        Map<String, String> selectedOptions = Map.of(
                "1", "letters",
                "2", "digits",
                "3", "symbols"
        );

        var sanitizedSelectedOptions = santizeSelectedOptions(userInput);

        return sanitizedSelectedOptions.stream().map(selectedOptions::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());


    }

    private static List<String> santizeSelectedOptions(String userInput) {

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(userInput);

        List<String> selectedOptions = new ArrayList<>();

        while (matcher.find()) {
            selectedOptions.add(matcher.group());
        }
        return selectedOptions;
    }

}
