package br.com.dio.collection.List;
/*Faça um programa que receba a temperatura média
* dos primeiros 6 meses do ano e armazene-as em uma lista
*
* Após isso, calcule a media semestral das temperaturas e mostre
* todas as temperaturas acima da media, e em que mes elas ocorreram.
* Mostre o mes por extenso (1 - janeiro, 2 - Fevereiro, etc) */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ex001_TemperaturaAnual {
    public static void main(String[] args){

        List<TemperaturaMensal> temperaturaMes = new ArrayList<>();
        Random random = new Random();

        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "1"));
        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "2"));
        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "3"));
        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "4"));
        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "5"));
        temperaturaMes.add(new TemperaturaMensal(random.nextDouble(11d, 45d), "6"));

        double mediaTemp = mediaTotal(temperaturaMes);
        List<TemperaturaMensal> acimaMedia = new ArrayList<>();

        System.out.println("Media do semestre: " + mediaTemp);

        System.out.println("\nMeses acima da media:");
        for(TemperaturaMensal temp : temperaturaMes){
            if(temp.getTemperatura() > mediaTemp){
                acimaMedia.add(new TemperaturaMensal(temp.getTemperatura(), mesExtenso(temp.getMes())));
            }
        }

        System.out.println(acimaMedia);
    }

    public static double mediaTotal(List<TemperaturaMensal> temperaturaMes){
        double soma = 0;
        for(TemperaturaMensal temp : temperaturaMes) {
            soma += temp.getTemperatura();
        }
        return (soma/temperaturaMes.size());
    }

    public static String mesExtenso(String mesValor){
        String mes;
        switch (mesValor){
            case "1":
                mes = "Janeiro";
                break;
            case "2":
                mes = "Fevereiro";
                break;
            case "3":
                mes = "Marco";
                break;
            case "4":
                mes = "Abril";
                break;
            case "5":
                mes = "Maio";
                break;
            case "6":
                mes = "Junho";
                break;
            default:
                mes = "Mes invalido";
                break;
        }

        return mes;
    }

}


class TemperaturaMensal{
    private double temperatura;
    private String mes;

    public TemperaturaMensal(double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                ", mes=" + mes +
                '}' + "\n";
    }
}
