package br.com.dio.collection.List;
/*Utilizando listas, crie um programa que faca 5 perguntas
* para uma pessoa sobre um crima. As perguntas sao:
* 1. Telefonou para a vitima?
* 2. Esteve no local do crime?
* 3. Mora perto da vitima?
* 4. Devia para a vitima?
* 5. Ja trabalhou com a vitima?
*
* Se a pessoa responder positivamente a 2 questoes, ela deve ser
* classificada como "Suspeita", entre 3 e 4 como "Cumplice' e 5 como
* "Assassina". Caso contrario, ela sera classificada como "Inocente"*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex002_Interrogatorio {
    public static void main(String[] args){
        List<Questionario> questionario = new ArrayList<>();

        questionario.add(new Questionario("1. Telefonou para a vitima?", resposta()));
        questionario.add(new Questionario("2. Esteve no local do crime?", resposta()));
        questionario.add(new Questionario("3. Mora perto da vitima?", resposta()));
        questionario.add(new Questionario("4. Devia para a vitima?", resposta()));
        questionario.add(new Questionario("5. Ja trabalhou com a vitima?", resposta()));

        System.out.println(questionario);
        System.out.println("\nO juri determinou que a pessoa e " + analise(questionario));

    }

    public static String resposta(){
        Random random = new Random();
        boolean resposta = random.nextBoolean();
        return (resposta ? "Sim" : "Nao");
    }

    public static String analise(List<Questionario> questionario){
        int qtdeSim = 0;
        String resultado;

        for (Questionario resposta : questionario) {
            if(resposta.getResposta() == "Sim")
                qtdeSim++;
        }

        switch (qtdeSim){
            case 2:
                resultado = "Suspeita";
                break;
            case 3:
            case 4:
                resultado = "Cumplice";
                break;
            case 5:
                resultado = "Assassina";
                break;
            default:
                resultado = "Inocente";
                break;
        }
        return resultado;
    }
}

class Questionario{
    String pergunta;
    String resposta;

    public Questionario(String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return "\nPergunta='" + pergunta + '\'' +
                ", Resposta='" + resposta + '\'';
    }
}


