package br.com.jdev.ex006;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int B;
    private static int H;

    static {
        B = sc.nextInt();
        H = sc.nextInt();
    }

    public static void main(String[] args) {
        boolean flag = B > 0 && H > 0;
        if (flag) {
            int area = B * H;
            System.out.print(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
