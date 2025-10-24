package com.ieschabas;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("=== PRUEBA DE 10 EJERCICIOS ===");

        // EJERCICIO 1: MenuVehiculos (INTERACTIVO)
        System.out.println("1. EJERCICIO MENU VEHICULOS");
        MenuVehiculos.mostrarMenuInteractivo();
        System.out.println();

        // EJERCICIO 2: NumerosImpares
        System.out.println("2. EJERCICIO NUMEROS IMPARES");
        System.out.println("Producto 10 primeros impares: " + NumerosImpares.productoImpares());
        System.out.println();

        // EJERCICIO 3: JuegoAdivinar (SIN ERROR - 1-100 GARANTIZADO)
        System.out.println("3. EJERCICIO JUEGO ADIVINAR");
        System.out.println("=== JUEGO ADIVINAR EL NÚMERO ===");
        Random random = new Random();
        int secreto = random.nextInt(10);
        int[] intentos = {0};
        JuegoAdivinar juego = new JuegoAdivinar();
        int resultado1 = juego.jugar(secreto, intentos);

        if (resultado1 == 0) {
            System.out.println("Te rendiste. El número secreto era: " + secreto);
        } else if (resultado1 == secreto) {
            System.out.println("Ganaste, yuju. El número era: " + secreto);
        }
            // Ejercicio 4: AleatoriosPar
            System.out.println("4. EJERCICIO ALEATORIOS PAR");
            int par = AleatoriosPar.parAleatorioMenorQue(20, rng);
            System.out.println("Par aleatorio < 20: " + par);
            System.out.println();

            // Ejercicio 5: SumasAleatorias
            System.out.println("5. EJERCICIO SUMAS ALEATORIAS");
            int[] sumas = SumasAleatorias.generarSumas(20, rng);
            System.out.println("Las 20 sumas: " + Arrays.toString(sumas));
            System.out.println();

            // Ejercicio 6: Circunferencia
            System.out.println("6. EJERCICIO CIRCUNFERENCIA");
            double radio = 5.0;
            System.out.println("Radio: " + radio);
            System.out.printf("Área: " + Circunferencia.area(radio));
            System.out.printf("Longitud: " + Circunferencia.longitud(radio));
            System.out.println();

            // Ejercicio 7: Mayores
            System.out.println("7. EJERCICIO MAYORES 2");
            System.out.println("max(15, 23): " + Mayores.max2(15, 23));
            System.out.println("max(100, 50): " + Mayores.max2(100, 50));
            System.out.println();

            // Ejercicio 8: MayoresAleatorios3
            System.out.println("8. EJERCICIO MAYORES 3 ALEATORIOS");
            int[] maximos3 = MayoresAleatorios3.generarMaximos3(20, rng);
            System.out.println("Primeros 3 máximos de 3 nums: " + Arrays.toString(maximos3));
            System.out.println();

            // Ejercicio 9: MayoresAleatorios4
            System.out.println("9. EJERCICIO MAYORES 4 ALEATORIOS");
            int[] maximos4 = MayoresAleatorios4.generarMaximos4(20, rng);
            System.out.println("Primeros 3 máximos de 4 nums: " + Arrays.toString(maximos4));
            System.out.println();


            scanner.close();
        }
}
