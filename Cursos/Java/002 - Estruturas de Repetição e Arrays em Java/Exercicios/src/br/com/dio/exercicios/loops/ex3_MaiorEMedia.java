package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int cont = 0;
        int maior = 0;
        int media = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;
            media += numero;
            cont++;
        }while (cont < 5);

        System.out.println("O maior numero foi " + maior);
        System.out.println("A meda foi " + (media /= 5));
    }


}
