package br.dio.oo;

public class RodarApp {

    public static void main(String[] args){
        Calcular calc = new Calcular();

        int a = 2;
        int b = 4;

        System.out.println(calc.soma(a, b));
        System.out.println(calc.subtracao(a, b));
        System.out.println(calc.multiplicacao(a, b));
        System.out.println(calc.divisao(a, b));
    }
}
