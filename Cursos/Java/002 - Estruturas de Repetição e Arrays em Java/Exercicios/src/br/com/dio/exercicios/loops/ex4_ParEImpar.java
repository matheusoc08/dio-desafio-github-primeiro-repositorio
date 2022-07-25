package br.com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ex4_ParEImpar {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int qtdNumeros = 0, numero, qtdPar = 0, qtdImpar = 0, count = 0;

        System.out.print("Informe quantos numeros serao digitados: ");
        qtdNumeros = scan.nextInt();

        do{
            System.out.print("Valor: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPar++;
            else qtdImpar++;
            count++;
        }while(count < qtdNumeros);

        System.out.println("\nPares: " + qtdPar + "\nImpares: " + qtdImpar);
    }
}
