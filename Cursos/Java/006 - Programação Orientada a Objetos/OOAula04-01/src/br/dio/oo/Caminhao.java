package br.dio.oo;

public class Caminhao extends Veiculo {
    int qtdPortas;
    boolean possuiCacamba;

    public Caminhao(String cor, double capacidadeTanque, int qtdRodas, int qtdPortas, boolean possuiCacamba){
        super(cor, capacidadeTanque, qtdRodas);
        this.qtdPortas = qtdPortas;
        this.possuiCacamba = possuiCacamba;
    }

}
