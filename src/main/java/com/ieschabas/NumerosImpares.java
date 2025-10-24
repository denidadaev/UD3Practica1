package com.ieschabas;
/**
 * @author Deni Dadaev
 * @version 1.0
 * Creada la clase que muestre el producto de los 10 primeros números impares
 */
public class NumerosImpares {
    public static long productoImpares() {
        long producto = 1;
        for (int i = 1; i <= 19; i += 2) {
            producto *= i;
        }
        return producto; // 654729075
    }
}