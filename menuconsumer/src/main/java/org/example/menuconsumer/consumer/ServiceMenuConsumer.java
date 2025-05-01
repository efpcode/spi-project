package org.example.menuconsumer.consumer;
import org.example.menuservice.menu.Menu;
import org.example.menuservice.menu.MenuLanguage;


import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;

import static java.io.IO.*;

public class ServiceMenuConsumer {
    private static Menu selectedMenu;

    public static void initializeMenu() {

        ServiceLoader<Menu> loader = ServiceLoader.load(Menu.class);

        println("Select a language:");
        var allLanguages = loader.stream()
                .map(ServiceLoader.Provider::get)
                .map(menu -> menu.getClass().getAnnotation(MenuLanguage.class))
                .filter(Objects::nonNull)
                .map(MenuLanguage::value)
                .toList();


        String userInput = getSelectedMenu(allLanguages);

        for (Menu menu : loader) {
            MenuLanguage menuLanguage = menu.getClass().getAnnotation(MenuLanguage.class);
            if (menuLanguage != null && userInput.equals(menuLanguage.value())) {
                selectedMenu = menu;
                break;
            }

        }

        if (selectedMenu == null) {
            println("No matching menu found! Using default.");
            selectedMenu = loader.findFirst().orElseThrow(() -> new RuntimeException("No Menu implementations found."));
        }
    }


    public static void showMenu() {
        println(selectedMenu.getTitle());
        println("[1]: " + selectedMenu.getStartButtonText());
        println("[2]: " + selectedMenu.getOptionsButtonText());
        println("[3]: " + selectedMenu.getQuitButtonText());
    }

    public static void showOptionsMenu() {
        println(selectedMenu.getOptionsQuestionText());
        println(selectedMenu.getOptions());
    }

    public static void showPasswordLengthMenu() {
        println(selectedMenu.getPasswordLengthQuestionText());
    }

    public static void showExitMenu(){
        println(selectedMenu.getKeepRunningQuestionText());
    }


    private static String getSelectedMenu(List<String> options) {
        int index = 1;

        for (String option : options) {
            println(index +": "+ option);
            index++;
        }

        while (true) {
            try {
                int userInt = Integer.parseInt(readln("Please enter a digit: "));
                return options.get(userInt -1);
            } catch (NumberFormatException e) {
                println("Invalid Input!");
            }catch (ArrayIndexOutOfBoundsException e){
                println("Option is not present please pick valid option");
            }
        }

    }
}
