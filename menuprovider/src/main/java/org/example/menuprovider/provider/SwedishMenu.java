package org.example.menuprovider.provider;
import org.example.menuservice.menu.Menu;
import org.example.menuservice.menu.MenuLanguage;

@MenuLanguage("Svenska")
public class SwedishMenu implements Menu {
    @Override
    public String getStartButtonText() {
        return "Starta";
    }

    @Override
    public String getOptionsButtonText() {
        return "Alternativ";
    }

    @Override
    public String getQuitButtonText() {
        return "Avsluta";
    }


    public String getTitle() {
        return "Välkommen till Lösenord Generatorn";
    }


}
