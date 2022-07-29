package br.dio.oo;

public class RodarApp {
    public static void main(String[] args){

        //Normal
        Funcionario f0 = new Funcionario();

        //Upcast
        Funcionario f1 = new Vendedor();

        //Downcast
        Faxineiro g1 = (Faxineiro) new Funcionario();

        f1.realizarTarefa();
    }
}
