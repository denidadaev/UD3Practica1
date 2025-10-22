package com.ieschabas;
import java.util.Scanner;

/**
 * author Deni Dadaev
 */
public class MenuVehiculos {
    public static String seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "Mantenimiento de clientes";
            case 2:
                return "Introducción de facturas";
            case 3:
                return "Listado de facturas";
            case 4:
                return "Finalizar";
            default:
                return "La opción no existe. Vuelve a intentarlo";
        }
    }
    public static void mostrarMenuInteractivo() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== MENÚ DE MANTENIMIENTO DE VEHÍCULOS ===");
        System.out.println("1 = Mantenimiento de clientes");
        System.out.println("2 = Introducción de facturas");
        System.out.println("3 = Listado de facturas");
        System.out.println("4 = Finalizar");
        System.out.println("Selecciona una opción (1-4): ");

        opcion = scanner.nextInt();
        String resultado = seleccionarOpcion(opcion);
        System.out.println("resultado: " + resultado);
    }

}
