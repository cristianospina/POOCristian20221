package com.dispensadorCondones.app;

import com.dispensadorCondones.dominio.Condon;
import com.dispensadorCondones.dominio.DispensadorDeCondones;

public class AppDispensadorCondones{
    public static void main(String[] args0) {
        Condon condon = new Condon("Today", 5);

        DispensadorDeCondones dispensador = new DispensadorDeCondones("Prudence", 20);
        dispensador.condon = condon;

        dispensador.llenar();
        dispensador.dispensar(10);
        dispensador.dispensar(8);
        dispensador.dispensar(2);

        Condon condon2 = new Condon("Profamilia", 3);

        dispensador.cambiarCondones(condon2);
        dispensador.dispensar(2);
    }
}