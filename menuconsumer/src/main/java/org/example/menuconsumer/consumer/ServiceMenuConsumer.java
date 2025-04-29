package org.example.menuconsumer.consumer;
import org.example.menuservice.menu.Menu;
import org.example.menuservice.menu.MenuLanguage;


import java.util.ServiceLoader;

import static java.io.IO.*;

public class ServiceMenuConsumer {
    private static Menu selectedMenu;

    public static void initializeMenu() {

        ServiceLoader<Menu> loader = ServiceLoader.load(Menu.class);
        println("Select a language : [1] English, [2] Svenska");
        String userInput = getSelectedMenu();

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


    private static String getSelectedMenu() {
        String userInput;
        int userInt;

        while (true) {
            try {
                userInput = readln("Please enter a digit: ");
                userInt = Integer.parseInt(userInput);
                break;
            } catch (NumberFormatException e) {
                println("Invalid Input!");
            }
        }


        return switch (userInt) {
            case 1 -> "English";
            case 2 -> "Svenska";
            default -> "English";
        };

    }
}
