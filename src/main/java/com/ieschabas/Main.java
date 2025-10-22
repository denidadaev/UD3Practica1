package com.ieschabas;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("=== PRUEBA DE 10 EJERCICIOS ===\n");

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

        // NÚMERO SECRETO (1-100)
        int secreto = (int) (Math.random() * 100) + 1;
        System.out.println("🔒 Adivina el número secreto (1-100)\n");

        // TÚ INTRODUCES INTENTOS EN TIEMPO REAL
        java.util.ArrayList<Integer> listaIntentos = new java.util.ArrayList<>();

        System.out.println("Introduce tus intentos (0 para terminar):");

        while (true) {
            System.out.print("Intento " + (listaIntentos.size() + 1) + ": ");
            int intento = scanner.nextInt();

            if (intento == 0) {
                System.out.println("¡Juego terminado!\n");
                break;
            }

            // **AQUÍ**: MUESTRA "MAYOR O MENOR" EN CADA INTENTO
            if (intento < secreto) {
                System.out.println("  → El número es mayor");
            } else if (intento > secreto) {
                System.out.println("  → El número es menor");
            } else if (intento == secreto) {
                System.out.println("  → ¡ACERTASTE!");
            } else if (intento == 0){
                System.out.println("Te rendiste. El número secreto era: " + secreto);
                break;
            }


            // CONVERTIR A ARRAY PARA MÉTODO
            int[] intentos = new int[listaIntentos.size()];
            for (int i = 0; i < listaIntentos.size(); i++) {
                intentos[i] = listaIntentos.get(i);
            }

            System.out.println("Intentos realizados: " + Arrays.toString(intentos));

            // EJECUTAR MÉTODO
            int resultado = JuegoAdivinar.jugar(secreto, intentos);
            System.out.println("Resultado oficial: " + (resultado > 0 ?
                    "¡ACERTASTE en el intento " + resultado + "!" : "No acertaste"));
            System.out.println();

            // Ejercicio 4: AleatoriosPar
            System.out.println("4. EJERCICIO ALEATORIOS PAR");
            int par = AleatoriosPar.parAleatorioMenorQue(20, rng);
            System.out.println("Par aleatorio < 20: " + par);
            System.out.println();

            // Ejercicio 5: SumasAleatorias
            System.out.println("5. EJERCICIO SUMAS ALEATORIAS");
            int[] sumas = SumasAleatorias.generarSumas(3, rng);
            System.out.println("Primeras 3 sumas: " + Arrays.toString(sumas));
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
            int[] maximos3 = MayoresAleatorios3.generarMaximos3(3, rng);
            System.out.println("Primeros 3 máximos de 3 nums: " + Arrays.toString(maximos3));
            System.out.println();

            // Ejercicio 9: MayoresAleatorios4
            System.out.println("9. EJERCICIO MAYORES 4 ALEATORIOS");
            int[] maximos4 = MayoresAleatorios4.generarMaximos4(3, rng);
            System.out.println("Primeros 3 máximos de 4 nums: " + Arrays.toString(maximos4));
            System.out.println();

            // Ejercicio 10: ImprimirCaracteres
            System.out.println("10. EJERCICIO IMPRIMIR CARACTERES");
            System.out.println("Repetir 'x' 5 veces: " +
                    ImprimirCaracteres.repetirCaracter('x', 5));

            String salidaAbc = ImprimirCaracteres.construirSalidaAbecedario(
                    ImprimirCaracteres.generarRepeticionesAbecedario(rng));
            System.out.println("Abecedario aleatorio (primeros 20 chars): " +
                    salidaAbc.substring(0, Math.min(20, salidaAbc.length())));

            scanner.close();
        }
    }
}