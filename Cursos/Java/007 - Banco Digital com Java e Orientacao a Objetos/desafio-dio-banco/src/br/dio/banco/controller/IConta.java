package br.dio.banco.controller;

public interface IConta {

    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);

    void imprimirExtrato();
}
