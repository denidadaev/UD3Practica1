package com.ieschabas;

public class NumerosImpares {
    public static long productoImpares() {
        long producto = 1;
        for (int i = 1; i <= 19; i += 2) {
            producto *= i;
        }
        return producto; // 654729075
    }
}