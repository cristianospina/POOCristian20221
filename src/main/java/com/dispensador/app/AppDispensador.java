package com.dispensador.app;

import com.dispensador.dominio.Cerveza;
import com.dispensador.dominio.DispensadorDeCerveza;

public class AppDispensador {
    public static void main(String[] args0) {
        Cerveza cerveza = new Cerveza("Aguila", 5);

        DispensadorDeCerveza dispensador = new DispensadorDeCerveza("XXSS", 3);
        dispensador.cerveza = cerveza;

        dispensador.llenar();
        dispensador.servir(1.2);
        dispensador.servir(0.9);
        dispensador.servir(1.1);

        Cerveza cerveza2 = new Cerveza("Corona", 6.1);

        dispensador.cambiarCerveza(cerveza2);
        dispensador.servir(0.3);
    }
}
