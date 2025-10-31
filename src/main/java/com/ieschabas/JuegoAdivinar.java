package com.ieschabas;

import java.util.Scanner;
/**
 * @author Deni Dadaev
 * @version 1.0
 * Crada la clase pde un juego para adivinar un número
 */
public class JuegoAdivinar {
    //Método que da pistas si el número secreto es mayor o menos eque el introducido, y si lo has adivinado  o te has rendido
    public void evaluarIntento(int secreto, int intento, int[] intentos) {
        intentos[0]++;

        if (intento < secreto) {
            System.out.println("El número es mayor. Has realizado " + intentos[0] + " intentos");
        } else if (intento > secreto) {
            System.out.println("El número es menor. Has realizado " + intentos[0] + " intentos");
        } else if (secreto == intento) {
            System.out.println("Has acertado, yujuuuuu!");
        } else if (intento == 0) {
            System.out.println("Te rendiste");
        }
    }


    public int jugar(int secreto, int[] intentos) {
        Scanner scanner = new Scanner(System.in);
        int intento;

        /**Método que comprueba si el número introducido es igual al secreto
         *
         */
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