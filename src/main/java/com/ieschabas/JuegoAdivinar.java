package com.ieschabas;

public class JuegoAdivinar {

    // MÉTODO 1: ESPECIFICACIÓN EXACTA (NO STATIC + int[] intentos)
    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        int n = intentos.length; // n = número de intentos TOTALES en el array

        if (intento < secreto) {
            System.out.println("El número es menor. Has realizado " + n + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es mayor. Has realizado " + n + " intentos");
        } else {
            System.out.println("Has acertado!");
        }
    }

    // MÉTODO 2: ESPECIFICACIÓN EXACTA (STATIC)
    public static int jugar(int secreto, int[] intentos) {
        JuegoAdivinar juego = new JuegoAdivinar();
        int contador = 0;

        for (int intento : intentos) {
            juego.evaluarIntento(secreto, intento, intentos);
            contador++;
            if (intento == secreto) {
                return contador;
            }
        }
        return -1; // No se acertó
    }
}