package org.example.menuprovider.provider;

import org.example.menuservice.menu.Menu;
import org.example.menuservice.menu.MenuLanguage;

@MenuLanguage("Spanish")
public class SpanishMenu implements Menu {
    @Override
    public String getStartButtonText() {
        return "Iniciar";
    }

    @Override
    public String getOptionsButtonText() {
        return "Opciones";
    }

    @Override
    public String getQuitButtonText() {
        return "Salir";
    }

    @Override
    public String getTitle() {
        return "Bienvenido al Generador de Contraseñas";
    }

    @Override
    public String getOptionsQuestionText() {
        return "Crear contraseña con: ";
    }

    @Override
    public String getOptions() {
        return "Seleccione opciones: [1] Letras, [2] Números, [3] Símbolos";
    }

    @Override
    public String getPasswordLengthQuestionText() {
        return "Ingrese el tamaño de la contraseña en números.";
    }

    @Override
    public String getKeepRunningQuestionText() {
        return "¿Desea continuar con la aplicación [s]/n ?: ";
    }
}
