package br.dio.banco;

import br.dio.banco.controller.*;
import br.dio.banco.consoleView.Console;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("---------------------------------------");

        Console con = new Console();
        Scanner scan = new Scanner(System.in);
        boolean menu = true;

        System.out.println("Bem vindo!");

        while(menu) {
        System.out.println("Escolha uma opcao");
        System.out.println("""
                1 - Cadastrar cliente\t4 - Criar conta para cliente
                2 - Ver clientes\t\t5 - Ver contas
                3 - Buscar cliente\t\t6 - Buscar conta
                x - Para sair"""
        );

            System.out.print("R: ");
            String op = scan.next();

            switch (op.toLowerCase()) {
                case "1":
                    System.out.print("Informe o nome do cliente: ");
                    con.novoCliente(scan.next());
                    break;
                case "2":
                    System.out.println("\n"+con.exibirCliente());
                    break;
                case "3":
                    System.out.print("Informe o id do cliente: ");
                    System.out.println(con.exibirCliente(scan.nextInt()));
                    break;
                case "4":
                    System.out.println("Informe o id do cliente e o tipo de conta:");
                    System.out.println("1 - Conta Corrente\t2 - Conta Poupanca\t3 - Conta Salario");
                    con.novaConta(scan.nextInt(), scan.nextInt());
                    break;
                case "5":
                    con.exibirConta();
                    break;
                case "6":
                    System.out.print("Informe o numero da conta desejada: ");
                    con.exibirConta(scan.nextInt());
                    break;
                case "x":
                    menu = false;
                    break;
                default:
                    System.out.println("Opcao invalida!\n");
                    break;
            }
        }

        System.out.println("---------------------------------------");
    }
}
