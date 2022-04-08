package com.EPS.app;

import javax.swing.*;
import java.util.Arrays;

public class EpsApp {
    public static ImageIcon icono = new ImageIcon(EpsApp.class.getResource("/imagenes/uco.png"));

    public static void main(String[] args) {
        while (true) {
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre", "Johanna");
//            JOptionPane.showInput
            String pais = (String) JOptionPane.showInputDialog(null, "Quien gana la batalla de los pixeles?",
                    "POO", JOptionPane.QUESTION_MESSAGE, null,
                    Arrays.asList("Francia", "España", "Colombia").toArray(), "Francia");

            if ("colombia".equalsIgnoreCase(pais)) {
                if ("Alejandro".equalsIgnoreCase(nombre)) {
                    break;
                }

                mostrarMensaje("Muy bien " + nombre.toUpperCase() + ", VA A GANAR COLOMBIA!");
            } else {
                mostrarMensaje("Sigue intentando ;)");
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.QUESTION_MESSAGE, icono);
    }
}