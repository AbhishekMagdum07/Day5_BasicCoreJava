package com.bridgelabz_basic_java;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Flips = (input should be in positive)");
        double flips = sc.nextInt();
        int heads = 0, tails = 0;
        double headPercentage, tailPercentage;

        for(int i=1 ; i<=flips ; i++) {
            double num = Math.random();

            if (num >= 0.50) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads count = "+heads +"  ||  "+"Tails count = "+tails);

        headPercentage = heads/flips*100;
        tailPercentage = tails/flips*100;

        System.out.println("Head Percentage = "+headPercentage);
        System.out.println("Tail Percentage = "+tailPercentage);
    }
}
