package com.nmw;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();

    }
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        for (int i: arr ) {
            System.out.print(i +" ");
        }

        System.out.println();
        BigInteger min = new BigInteger("0");
        BigInteger max = new BigInteger("0");
        for (int i = 0 ; i < arr.length ; i++){
            // 1 2 3 4 5
            if (i != 0) {
                max = max.add(BigInteger.valueOf(arr[i]));
            }
            if (i != arr.length-1) {
                min = min.add(BigInteger.valueOf(arr[i]));
            }
        }//EOD for looop

        System.out.println(min +" "+ max);
    }
}
