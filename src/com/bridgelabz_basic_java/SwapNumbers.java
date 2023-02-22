package com.bridgelabz_basic_java;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter b = ");
        int b = sc.nextInt();
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("a ="+a);
        System.out.println("b ="+b);
    }
}
