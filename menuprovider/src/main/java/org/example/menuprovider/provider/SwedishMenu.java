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

    @Override
    public String getOptionsQuestionText() {
        return "Skapa lösenord som innehåller följande tecken:";
    }

    @Override
    public String getOptions() {
        return "Välj: [1] Bokstäver, [2] Siffror, [3] Symboler";
    }

    @Override
    public String getPasswordLengthQuestionText() {
        return "Sätt längden på lösenordet: ";
    }

    @Override
    public String getKeepRunningQuestionText() {
        return "Vill du fortsätta hålla i gång applikation [j]/n ?: ";
    }


}
