package br.dio.java.Desafio2;

import java.io.IOException;
import java.util.Scanner;

public class AMudanca {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String msg;

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        while (leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (graus == 360 || graus >= 0 && graus < 90) msg = "Bom Dia!!";
            else if (graus < 180) msg = "Boa Tarde!!";
            else if (graus < 270) msg = "Boa Noite!!";
            else msg = "De Madrugada!!";
            System.out.println(msg);
        }
    }
}
