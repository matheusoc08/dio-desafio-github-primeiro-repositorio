package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class ex2_Consoantes {

    public static void main(String[] args) {
        String[] consoantes = new String[6];
        Scanner scan = new Scanner(System.in);
        int contConsoante = 0;

        for(int i = 0; i < consoantes.length; i++){
            System.out.print("Digite uma letra: ");
            String letra = scan.next();

            if(
                    !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))
            ){
                consoantes[i] = letra;
                contConsoante++;
            }
        }

        System.out.println("Foram digitadas " + contConsoante + " consoantes");
        for ( String consoante : consoantes ) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
    }
}
