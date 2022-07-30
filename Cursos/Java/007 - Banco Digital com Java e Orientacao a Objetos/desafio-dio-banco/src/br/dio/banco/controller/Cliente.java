package br.dio.banco.controller;

public class Cliente {

    private static int CLI_SEQUENCIAL = 1;
    private int id;
    private String nome;

    public Cliente(String nome){
        this.id = CLI_SEQUENCIAL++;
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() +
                "\nNome: " + this.getNome() + "\n";
    }
}
