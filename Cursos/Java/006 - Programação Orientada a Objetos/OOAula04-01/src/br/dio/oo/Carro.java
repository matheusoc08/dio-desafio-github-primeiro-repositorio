package br.dio.oo;

public class Carro extends Veiculo {

    int qtdPortas;
    double litrosPortaMalas;

    public Carro(String cor, double capacidadeTanque, int qtdRodas, int qtdPortas, double litrosPortaMalas) {
        super(cor, capacidadeTanque, qtdRodas);
        this.qtdPortas = qtdPortas;
        this.litrosPortaMalas = litrosPortaMalas;
    }
}
