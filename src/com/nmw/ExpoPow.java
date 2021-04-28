package com.nmw;

public class ExpoPow {
    public static void main(String[] args) {
        System.out.println(powMod(3,3,2500));
    }

    public static int powMod(int x, int y, int m) {
        if (x < 0)
            throw new IllegalArgumentException("Negative base not supported");
        if (y < 0)
            throw new IllegalArgumentException("Modular reciprocal not supported");
        if (m <= 0)
            throw new IllegalArgumentException("Modulus must be positive");
        if (m == 1)
            return 0;

        // Exponentiation by squaring
        int z = 1;
        for (; y != 0; y >>>= 1) {
            if ((y & 1) != 0)
                z = (int)((long)z * x % m);
            x = (int)((long)x * x % m);
        }
        return z;
    }
}
