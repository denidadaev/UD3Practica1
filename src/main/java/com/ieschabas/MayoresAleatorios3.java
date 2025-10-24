package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Deni Dadaev
 * @version 1.0
 * Creada la clase que escribe un algoritmo que devuelva el mayor de tres números aleatorios (entre 0 y 1000), y lo repite 20 veces
 */
public class MayoresAleatorios3 {
    public static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static int[] generarMaximos3(int repeticiones, Random rng) {
        Scanner scanner = new Scanner(System.in);

        while (repeticiones <= 0) {
            System.out.println("Las repeticiones no pueden ser un número negativo");
            System.out.print("Introduce nuevas repeticiones: ");
            repeticiones = scanner.nextInt();
        }

        int[] maximos = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001);
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            maximos[i] = max3(a, b, c);
        }
        return maximos;
    }
}
