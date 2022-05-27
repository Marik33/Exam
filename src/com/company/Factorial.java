package com.company;

import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial (int n){
        int result = 1;
        for (int i = 1; i <= n; i ++ ){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Впишіть число: ");
        int count = scanner.nextInt();
        System.out.println(Factorial.calculateFactorial(count));

    }
}
