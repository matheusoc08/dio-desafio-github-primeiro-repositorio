package br.com.dio.exercicios.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class ex6_Fatorial {

    public static void main(String[] args){

        int numero;
        int fat = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        numero = scan.nextInt();

        for(int i = 1; i <= numero; i++){
            fat *= i;
        }

        System.out.println(numero +"!: " + fat);

    }
}
