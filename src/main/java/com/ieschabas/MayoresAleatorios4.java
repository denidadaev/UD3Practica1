package com.ieschabas;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Deni Dadaev
 * @version 1.0
 * Creada la clase que diseña un algoritmo que devuelva el mayor de cuatro números aleatorios (entre 0 y 1000), y lo repite 20 veces
 */
public class MayoresAleatorios4 {
    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    public static int[] generarMaximos4(int repeticiones, Random rng) {
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
            int d = rng.nextInt(1001);
            maximos[i] = max4(a, b, c, d);
        }
        return maximos;
    }
}
