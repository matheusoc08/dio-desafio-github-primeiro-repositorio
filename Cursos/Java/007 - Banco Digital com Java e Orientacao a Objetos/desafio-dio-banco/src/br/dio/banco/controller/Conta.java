package br.dio.banco.controller;

public abstract class Conta implements IConta {

    private static int CONTA_SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = CONTA_SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor){
        if(this.saldo < 0 || valor > this.saldo) {
            System.out.println("Saldo insuficiente para retirada.");
            return false;
        }
        else{
            this.saldo -= valor;
            return true;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("Deposito de R$%.2f realizado para a conta %d", valor, this.numero));
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor))
            contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("ID Titular: %d", this.cliente.getId()));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
}
