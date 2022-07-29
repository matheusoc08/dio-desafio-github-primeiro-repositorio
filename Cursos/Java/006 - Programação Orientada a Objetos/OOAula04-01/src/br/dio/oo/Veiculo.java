package br.dio.oo;

public class Veiculo {
    String cor;
    double capacidadeTanque;
    int qtdRodas;

    public Veiculo(){}

    public Veiculo(String cor, double capacidadeTanque, int qtdRodas){
        this.capacidadeTanque = capacidadeTanque;
        this.cor = cor;
        this.qtdRodas = qtdRodas;
    }

    public String getCor(){
        return this.getCor();
    }

    public double getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public int getQtdRodas(){
        return this.qtdRodas;
    }

    public void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
}
