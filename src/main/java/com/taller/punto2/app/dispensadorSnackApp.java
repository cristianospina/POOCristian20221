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
        autoSnack.agregar("Boliquesos", "7913", 2000);
        autoSnack.agregar("Turron de coco", "1379", 300);
        autoSnack.agregar("Chocorramo", "8246", 3000);
        autoSnack.agregar("Trident", "6428", 200);
        autoSnack.agregar("Mani dulce", "8213", 1000);
        autoSnack.agregar("Papa de pollo", "1328", 2000);
        autoSnack.agregar("Chocolatina", "6398", 500);
        autoSnack.agregar("Lecherita", "7412", 600);

        autoSnack.quitarSnack("6428");
        autoSnack.retirarSnackPorNombre("Trident");
        autoSnack.retirarSnackPorCodigo("5678");
        autoSnack.snackOrdenadoPrecio();
        autoSnack.retirarSnackPorNombre("Papa de limon");
        System.out.println("Lista Por Cantidad");
        autoSnack.snackOrdenadoCantidad();
        autoSnack.cantidadSnack("8246");
        autoSnack.snackDisponibles();
        autoSnack.snackAgotados();
        System.out.println("Buscando snack");
        autoSnack.cantidadSnack("9876");
        System.out.println("Snack incrementado");
        autoSnack.aumentarSnack("6398", 1);
        autoSnack.aumentarSnack("1328", 15);



    }
}