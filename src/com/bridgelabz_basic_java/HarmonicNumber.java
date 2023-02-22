package com.bridgelabz_basic_java;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print nth harmonic number = ");
        int input = sc.nextInt();
        double HarmonicNum =0;

        for(double i=1 ; i<=input ; i++){
            HarmonicNum = HarmonicNum + 1/i;
        }
        System.out.println("Harmonic Number till "+input+" Number is ="+HarmonicNum);
    }

}


