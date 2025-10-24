package com.ieschabas;

import java.util.Scanner;

public class JuegoAdivinar {

    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        intentos[0]++;

        if (intento < secreto) {
            System.out.println("El número es mayor. Has realizado " + intentos[0] + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es menor. Has realizado " + intentos[0] + " intentos");
        } else if (secreto == intento) {
            System.out.println("Has acertado!");
        } else if (intento == 0) {
            System.out.println("Te rendiste");
        }
    }


    public int jugar(int secreto, int[] intentos) {
        Scanner scanner = new Scanner(System.in);
        int intento;
        while (true) {
            System.out.println("Introduce el intento");
            intento = scanner.nextInt();

            if (intento < secreto) {
                return -1;
            }

            evaluarIntento(secreto, intento, intentos);

            if (secreto == intento) {
                return intentos[0];
            }

        }
    }
}