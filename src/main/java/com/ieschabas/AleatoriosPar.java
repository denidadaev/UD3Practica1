package com.ieschabas;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Deni Dadaev
 * @version 1.0
 * Creada la clase que obtiene un número par aleatorio menor que el que el usuario introduzca
 */
public class AleatoriosPar {
    public static int parAleatorioMenorQue(int limite, Random rng) {
        Scanner scanner = new Scanner(System.in);
        /**Método que introduce si el número introducido es mneor que el 0
         *
         */
        while (limite <= 0) {
            System.out.println("El límite no puede ser un número negativo");
            System.out.print("Introduce un nuevo límite: ");
            limite = scanner.nextInt();
        }

        int maxPar = (limite / 2) * 2; // El mayor par menor que limite
        return rng.nextInt((maxPar / 2) + 1) * 2;
    }
}