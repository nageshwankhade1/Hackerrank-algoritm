package com.nmw;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class ProjectEuler_250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        int n = Integer.valueOf(str[0]);
        int divisiable = Integer.valueOf(str[1]);

        System.out.println(noOfSubSets(n, divisiable));
    }


    private static final long MODULUS = 10000000000000000L;


    public static String noOfSubSets(int n, int divisiable) {

        long[] numSubsets = new long[250];
        numSubsets[0] = 1;

        for (int i = 1; i <= n; i++) {
            int temp = powMod(i, i, 250);
            long[] newArray = new long[numSubsets.length];
            for (int j = 0; j < 250; j++)
                newArray[(j + temp) % 250] = (numSubsets[j] + numSubsets[(j + temp) % 250]) % MODULUS;
            numSubsets = newArray;
        }

        return Long.toString((numSubsets[0] - 1 + MODULUS) % MODULUS);
    }
    public static int powMod(int x, int y, int m) {

        int z = 1;
        for (; y != 0; y >>>= 1) {
            if ((y & 1) != 0)
                z = (int)((long)z * x % m);
            x = (int)((long)x * x % m);
        }
        return z;
    }
}
