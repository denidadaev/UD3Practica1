package com.ieschabas;

import java.util.Scanner;
/**
 * @author Deni Dadaev
 * @version 1.0
 * Creada la clase que calcula el área y la longitud de una circunferencia en función del radi
 */
public class Circunferencia {
    public static double area(double radio) {
        Scanner scanner = new Scanner(System.in);

        while (radio < 0) {
            System.out.println("El radio no puede ser un número negativo");
            System.out.print("Introduce un nuevo radio: ");
            radio = scanner.nextDouble();
        }

        return Math.PI * radio * radio;
    }

    public static double longitud(double radio) {
        Scanner scanner = new Scanner(System.in);

        while (radio < 0) {
            System.out.println("El radio no puede ser un número negativo");
            System.out.print("Introduce un nuevo radio: ");
            radio = scanner.nextDouble();
        }

        return 2 * Math.PI * radio;
    }
}
