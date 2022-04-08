package com.calculadora.App;

import com.calculadora.Dominio.Calculadora;

import javax.swing.*;

public class AppCalculadora {

    static int option;
    static String menu;

    public static void main(String[] args) {
        Calculadora object = new Calculadora();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. Suma\n" + "2. Resta\n" + "3. Multiplicacion\n" + "4. Division\n" + "5. Salir");
            option = Integer.parseInt(menu);

            switch (option){
                case 1:
                    object.suma();
                    break;
                case 2:
                    object.resta();
                    break;
                case 3:
                    object.multiplicacion();
                    break;
                case 4:
                    object.division();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion " + option + " es incorrecta");
            }
        }while(option != 5);
    }
}
