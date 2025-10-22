package com.ieschabas;

import java.util.Random;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class ImprimirCaracteres {
    public static String repetirCaracter(char c, int veces) {
        Scanner scanner = new Scanner(System.in);

        while (veces < 0) {
            System.out.println("Las veces no pueden ser un número negativo");
            System.out.print("Introduce nuevas veces: ");
            veces = scanner.nextInt();
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(c);
        }
        return resultado.toString();
    }

    public static LinkedHashMap<Character, Integer> generarRepeticionesAbecedario(Random rng) {
        LinkedHashMap<Character, Integer> repeticiones = new LinkedHashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            repeticiones.put(c, rng.nextInt(30) + 1);
        }
        return repeticiones;
    }

    public static String construirSalidaAbecedario(Map<Character, Integer> repeticiones) {
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : repeticiones.entrySet()) {
            char letra = entry.getKey();
            int veces = entry.getValue();
            resultado.append(repetirCaracter(letra, veces));
        }
        return resultado.toString();
    }
}
