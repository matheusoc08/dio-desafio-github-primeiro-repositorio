package br.dio.java.Desafio3;

import java.io.IOException;
import java.util.Scanner;

public class DragãoBerradorWorld {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int N = leitor.nextInt();
            int min = leitor.nextInt();
            int max = leitor.nextInt();
            int cont = 0;


            for (int i = 0; i < N; i++) {
                int A = leitor.nextInt();
                if (A >= min && A <= max) cont++;
            }
            System.out.println(cont);
        }
    }
}
