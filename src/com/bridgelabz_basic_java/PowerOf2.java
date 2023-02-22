package com.bridgelabz_basic_java;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power Value N =");
        int N = sc.nextInt();
        System.out.println("Table for power of 2 :");
        if(N > 0 && N < 31) {
            for (int i = 1; i <= N; i++) {
                int power = (int) Math.pow(2, i);
                System.out.printf("%d ^ %d = %d", 2, i, power).println();
            }
        }else {
            System.out.println("Enter Input between 0 and 31");
        }
    }
}
