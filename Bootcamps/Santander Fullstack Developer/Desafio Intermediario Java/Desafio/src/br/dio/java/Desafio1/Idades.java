package br.dio.java.Desafio1;

import java.io.IOException;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n = leitor.nextInt();


        while (n >= 1){
                soma+= n;
                cont++;
            n = leitor.nextInt();
        }
        double media = ((double)soma/cont);
        System.out.println(String.format("%.2f", media));
    }
}
