package com.taller.punto2.app;

import com.taller.punto2.dominio.DispensadorDeSnack;
import com.taller.punto2.dominio.Snack;

public class dispensadorSnackApp {
    public static void main(String[] args) {

        DispensadorDeSnack autoSnack = new DispensadorDeSnack();

        autoSnack.agregar("Doritos", "1234", 2500);
        autoSnack.agregar("Mani salado", "5678", 800);
        autoSnack.agregar("Papa de limon", "9876", 2000);
        autoSnack.agregar("Galletas oreo", "5432", 500);

        autoSnack.quitarSnack("9876");
        autoSnack.retirarSnackPorNombre("Doritos");
        autoSnack.retirarSnackPorCodigo("5678");
        autoSnack.snackOrdenadoPrecio();
        autoSnack.retirarSnackPorNombre("Papas de limon");
        System.out.println("Lista Por Cantidad");
        autoSnack.snackOrdenadoCantidad();
        autoSnack.snackDisponibles();
        autoSnack.snackAgotados();
        System.out.println("Buscando snack");
        autoSnack.cantidadSnack("ms4l");
        System.out.println("Snack incrementado");
        autoSnack.aumentarSnack("1234", 1);
        autoSnack.aumentarSnack("5432", 15);
        autoSnack.cantidadSnack("9876");


    }
}