package br.com.jdev.ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int acc = a;
            for (int j = 0; j < n; j++) {
                acc = (int) (acc + Math.pow(2, j) * b);
                System.out.printf("%d ", acc);
            }
            System.out.println();
        }
        scan.close();
    }
}
