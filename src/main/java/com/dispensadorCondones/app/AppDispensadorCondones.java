package com.dispensadorCondones.app;

import com.dispensadorCondones.dominio.Condones;
import com.dispensadorCondones.dominio.DispensadorDeCondones;

public class AppDispensadorCondones{
    public static void main(String[] args0) {
        Condones condones = new Condones("Today", 5);

        DispensadorDeCondones dispensador = new DispensadorDeCondones("Prudence", 20);
        dispensador.condones = condones;

        dispensador.llenar();
        dispensador.dispensar(10);
        dispensador.dispensar(8);
        dispensador.dispensar(2);

        Condones condones2 = new Condones("Profamilia", 3);

        dispensador.cambiarCondones(condones2);
        dispensador.dispensar(2);
    }
}