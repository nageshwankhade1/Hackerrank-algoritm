package com.nmw;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equal {

    // Complete the equal function below.
    static int equal(int[] arr) {

        int min = Arrays.stream(arr).boxed().mapToInt(v->v).min().getAsInt();
        int bestResult = Integer.MAX_VALUE/2;
        for (int borderline = min; borderline >= 0; borderline--) {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                result += (arr[i] - borderline) / 5;
                result += (arr[i] - borderline) % 5 / 2;
                result += (arr[i] - borderline) % 5 % 2 / 1;
            }
            bestResult = Math.min(bestResult, result);
        }

        return bestResult;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);
            System.out.println(result);

          //  bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
