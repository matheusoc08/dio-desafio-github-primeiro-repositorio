package br.dio.oo;

public class Calcular implements OperacaoMatematica{
    @Override
    public int soma(int num1, int num2) {
        return (num1+num2);
    }

    @Override
    public int subtracao(int num1, int num2) {
        return (num1-num2);
    }

    @Override
    public int multiplicacao(int num1, int num2) {
        return (num1*num2);
    }

    @Override
    public double divisao(int num1, int num2) {
        if(num2 == 0)
            return -1;
        return ((double) num1/(double) num2);
    }
}
