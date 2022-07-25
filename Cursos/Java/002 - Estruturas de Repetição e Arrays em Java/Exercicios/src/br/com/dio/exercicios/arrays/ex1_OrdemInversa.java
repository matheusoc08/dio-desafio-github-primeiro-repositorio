package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class ex1_OrdemInversa {

    public static void main(String[] args){

        int[] vetor = {0, -5, 15, 50, 8, 5};

        int count = vetor.length-1;

        while(count >= 0){
            System.out.print(vetor[count] + " ");
            count--;
        }

    }
}
