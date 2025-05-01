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
    public String getTitle() {
        return "Welcome to Password Generator";
    }

    @Override
    public String getOptionsQuestionText() {
        return "Create password with: ";
    }

    @Override
    public String getOptions() {
        return "Select options: [1] Letters, [2] Digits, [3] Symbols";
    }

    @Override
    public String getPasswordLengthQuestionText() {
        return "Enter the length of the password digits: ";
    }

    @Override
    public String getKeepRunningQuestionText() {
        return "Do you wish to continue the application [y]/n ?: ";
    }


}
