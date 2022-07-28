package br.com.dio.collection.List;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args){
        System.out.println("Crie uma lista e adicione as setes notas:");

        List<Double> notas = new ArrayList<Double>();
        notas.add(6.4);
        notas.add(7.5);
        notas.add(9.4);
        notas.add(4.0);
        notas.add(3.5);
        notas.add(8.0);
        notas.add(7.0);
        System.out.println(notas);
//        System.out.println(notas.toString());

        System.out.println("Exiba a posicao da nota 4.0: " + notas.indexOf(4d));
        System.out.println("Adicione na lista a nota 6.0 na posicao 4: ");
            notas.add(4, 6d);
            System.out.println(notas);
        System.out.println("Substitua a nota 7.0 pela nota 8.0: ");
            notas.set(notas.indexOf(7d), 1d);
            System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem em que fora informadas: ");
            for(double item : notas){System.out.println(item);}
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
            Double soma = 0.0;
            while(iterator.hasNext()){
                Double next = iterator.next();
                soma += next;
            }
            System.out.println(soma);
        System.out.println("Exiba a media das notas: " + (soma/notas.size()) );
        System.out.println("Remova a nota 8.0: ");
            notas.remove(8d);
            System.out.println(notas);
        System.out.println("Remova a nota na posicao 0: ");
            notas.remove(0);
            System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()){
                Double next = iterator1.next();
                if(next < 7) iterator1.remove();
            }
            System.out.println(notas);
        System.out.println("Apague toda a lista");
            notas.clear();
            System.out.println(notas);
        System.out.println("Confira se a lista esta vaiza: " + notas.isEmpty());


    }
}
