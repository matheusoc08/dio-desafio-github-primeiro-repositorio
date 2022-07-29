package br.dio.oo;

public class Funcionario{
    String nome;
    String cpf;
    int idade;
    char sexo;

    public Funcionario(){}
    public Funcionario(String nome, String cpf, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public double mostrarSalario(){
        return 1000d;
    }

    public void realizarTarefa(){}
}
