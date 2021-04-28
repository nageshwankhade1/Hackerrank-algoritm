package com.nmw;

import java.util.Scanner;

public class ProjectEuler1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long n1=0,n2=0,n3=0;
            n1=(n-1)/3;
            n1=3*n1*(n1+1)/2;
            n2=(n-1)/5;
            n2=5*n2*(n2+1)/2;
            n3=(n-1)/15;
            n3=15*n3*(n3+1)/2;
            System.out.println(n1+n2-n3);
        }
    }
}
