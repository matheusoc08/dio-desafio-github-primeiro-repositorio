package br.dio.oo;

public class Gerente extends Funcionario {

    public Gerente(){}
    public Gerente(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    @Override
    public void realizarTarefa(){
        System.out.println("Gerenciando...");
    }
}
