package br.dio.oo;

public class Vendedor extends Funcionario {

    public Vendedor(){}

    public Vendedor(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    @Override
    public double mostrarSalario() {
        double comissao = 1.15;
        return (super.mostrarSalario() * comissao);
    }

    @Override
    public void realizarTarefa(){
        System.out.println("Vendendo...");
    }
}
