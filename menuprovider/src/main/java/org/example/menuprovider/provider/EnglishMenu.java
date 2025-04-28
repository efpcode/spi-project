package org.example.menuprovider.provider;

import org.example.menuservice.menu.Menu;
import org.example.menuservice.menu.MenuLanguage;


@MenuLanguage("English")
public class EnglishMenu implements Menu {
    @Override
    public String getStartButtonText() {
        return "Start";
    }

    @Override
    public String getOptionsButtonText() {
        return "Options";
    }

    @Override
    public String getQuitButtonText() {
        return "Quit";
    }

    @Override
    public String getBackButtonText() {
        return "Back";
    }

    @Override
    public String getTitle() {
        return "Welcome to Guess a Number Game";
    }

    @Override
    public String getGameButton() {
        return "Guess";
    }

    @Override
    public String getGameDescription() {
        return "Guess A Number ";
    }
}
