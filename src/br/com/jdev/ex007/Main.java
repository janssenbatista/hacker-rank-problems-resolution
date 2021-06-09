package br.com.jdev.ex007;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = String.valueOf(sc.nextInt());
            System.out.println("Good job");
        } catch (InputMismatchException i) {
            System.out.println("Wrong answer");
        } finally {
            sc.close();
        }
    }
}
