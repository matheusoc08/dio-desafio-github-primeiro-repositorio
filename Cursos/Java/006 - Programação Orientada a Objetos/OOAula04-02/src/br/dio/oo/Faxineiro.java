package br.dio.oo;

public class Faxineiro extends Funcionario {

    public Faxineiro(){}

    public Faxineiro(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    @Override
    public void realizarTarefa(){
        System.out.println("Limpando...");
    }
}
