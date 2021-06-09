package br.com.jdev.ex005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        do {
            String line = sc.nextLine();
            System.out.printf("%d %s%n", counter, line);
            counter++;
        } while (sc.hasNext());
        sc.close();
    }
}
