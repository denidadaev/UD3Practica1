package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class SumasAleatorias {
    public static int sumaDosAleatorios(Random rng) {
        int num1 = rng.nextInt(1001);
        int num2 = rng.nextInt(1001);
        return num1 + num2;
    }

    public static int[] generarSumas(int repeticiones, Random rng) {
        Scanner scanner = new Scanner(System.in);

        while (repeticiones <= 0) {
            System.out.println("Las repeticiones no puede ser un número negativo");
            System.out.print("Introduce nuevas repeticiones: ");
            repeticiones = scanner.nextInt();
        }

        int[] sumas = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            sumas[i] = sumaDosAleatorios(rng);
        }
        return sumas;
    }
}
