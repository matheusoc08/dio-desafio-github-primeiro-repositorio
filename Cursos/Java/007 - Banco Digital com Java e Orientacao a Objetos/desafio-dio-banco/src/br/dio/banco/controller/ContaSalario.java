package br.dio.banco.controller;

public class ContaSalario extends Conta {

    public ContaSalario(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salario ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void transferir(Conta contaDestino, double valor){
        if(contaDestino.cliente.getId() == this.cliente.getId()){
            if(this.sacar(valor))
                contaDestino.depositar(valor);
        }
        else {
            System.out.println("Operacao autorizada apenas para outra conta do mesmo titular.");
        }
    }
}
