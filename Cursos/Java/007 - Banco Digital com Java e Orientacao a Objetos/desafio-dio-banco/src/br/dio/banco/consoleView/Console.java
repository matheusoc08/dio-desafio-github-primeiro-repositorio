package br.dio.banco.consoleView;
import br.dio.banco.controller.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Console {

    List<Cliente> clientes = new ArrayList<>();
    List<Conta> contas = new ArrayList<>();

    public void novoCliente(String nome){
        clientes.add(new Cliente(nome));
    }
    public String exibirCliente(){
        String listaClientes = "";
        for(Cliente cliente : clientes){
            listaClientes += cliente;
        }
        if(listaClientes.equals(""))
            return "Ainda nao ha clientes cadastrados!\n";
        return listaClientes;
    }
    public Cliente exibirCliente(int id){
        try {
            return clientes.get(id - 1);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Cliente nao localizado pelo ID informado.\n");
        }
        return null;
    }

    public void novaConta(int idCliente, int tipoConta){
        if(clientes.isEmpty()) {
            exibirCliente(idCliente);
            return;
        }

        switch (tipoConta){
            case 1:
                contas.add(new ContaCorrente(exibirCliente(idCliente)));
                break;
            case 2:
                contas.add(new ContaPoupanca(exibirCliente(idCliente)));
                break;
            case 3:
                contas.add(new ContaSalario(exibirCliente(idCliente)));
                break;
            default:
                System.out.println("Opcao invalida.\n");
                break;
        }
    }

    public void exibirConta(){
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
        if(contas.isEmpty()){
            System.out.println("Ainda nao ha contas cadastradas!\n");
        }
    }

    public void exibirConta(int idConta){
        try {
            contas.get(idConta - 1).imprimirExtrato();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Conta nao localizada pelo numero informado.\n");
        }
    }

}
