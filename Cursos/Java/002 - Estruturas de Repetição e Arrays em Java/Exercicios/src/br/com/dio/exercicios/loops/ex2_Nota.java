package br.com.dio.exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class ex2_Nota {

    public static void main(String []args){

        int nota;
        Scanner scan = new Scanner(System.in);

        /*while(true) {
            System.out.print("Digite um valor: ");
            nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) break;
            System.out.println("Valor invalido");
        }*/

        System.out.print("Digite um valor: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.print("Valor invalido!\nDigite um valor valido: ");
            nota = scan.nextInt();
        }
    }
}
