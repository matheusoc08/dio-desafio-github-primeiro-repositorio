package br.dio.java.desafio1;

import java.io.IOException;
import java.util.Scanner;

public class Conduite {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int R1 = scan.nextInt();
            int R2 = scan.nextInt();
            System.out.println( (R1 + R2) );
        }
    }
}