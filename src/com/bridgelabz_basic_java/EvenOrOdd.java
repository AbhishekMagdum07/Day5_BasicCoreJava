package com.bridgelabz_basic_java;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input to check Even or Odd =");
        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println(input+" is a Even Number");
        }else {
            System.out.println(input+" is a Odd Number");
        }
    }
}
