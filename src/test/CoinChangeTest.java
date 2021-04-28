package test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    public static long getWays(int n, List<Integer> c) {

        Integer[] intArray = new Integer[c.size()];
        intArray = c.toArray(intArray);

        long dp[] = new long[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

       long ans = minCoins(n,intArray,dp);

       return ans;
    }

    public static long minCoins(int n, Integer arr[], long []dp){
        long ans = 0;
        if(n==0) return 0;

        for(int i = 0; i<arr.length; i++) {
            if(n-arr[i] >= 0) {
                long subAns = 0;
                if(dp[n-arr[i]] != -1) {
                    subAns = dp[n-arr[i]];
                } else {
                    subAns = minCoins(n-arr[i], arr, dp);
                }
                if(subAns + 1 > ans) {
                    ans = subAns + 1;
                }
            }
        }
        return dp[n] = ans;
    }

}

public class CoinChangeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = Result.getWays(n, c);
        System.out.println(ways);
        //bufferedWriter.write(String.valueOf(ways));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
