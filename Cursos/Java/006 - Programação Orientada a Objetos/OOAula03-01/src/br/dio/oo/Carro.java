package br.dio.oo;

public class Carro {

    String cor;
    String modelo;
    Double capacidadeTanque;

    public Carro(){

    }

    public Carro(String cor, String modelo, Double capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor(){
        return this.cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public Double getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(Double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public double abastercerCarro(double valorLitro){
        return capacidadeTanque * valorLitro;
    }



}
