package br.dio.banco.controller;

import java.sql.SQLOutput;

public class ContaCorrente extends Conta{

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public double getLimiteChequeEspecial(){
        return this.limiteChequeEspecial;
    }

    public boolean usoLimiteChequeEspecial(double diferenca){
        if(diferenca > this.limiteChequeEspecial){
            System.out.println("Limite insuficiente para completar a transacao");
            return false;
        }
        else {
            System.out.println(String.format("Voce utilizou R$%.2f do seu cheque especial.", diferenca));
            this.limiteChequeEspecial -= diferenca;
            return true;
        }
    }

    @Override
    public boolean sacar(double valor){
        if(this.saldo < valor){
            if(usoLimiteChequeEspecial((this.saldo - valor)*-1)){
                this.saldo -= valor;
                return true;
            }
        }
        else{
            this.saldo -= valor;
            System.out.println("Transacao efetuada.");
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
        this.limiteChequeEspecial += super.saldo * 0.1;
        System.out.println(String.format("Deposito de R$%.2f realizado para a conta %d", valor, this.numero));
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Limite disponivel: %.2f", this.limiteChequeEspecial));
        System.out.println("==============================");
    }
}
