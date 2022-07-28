package br.com.dio.collection.Set;

import java.util.*;

public class Ex001_ArcoIris {
    public static void main(String[] args){
        System.out.println("Crie um conjunto contendo as cores do arco-iris e:");

        Set<String> cores = new HashSet<>();
        cores.add("Violeta");
        cores.add("Azul-escuro");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Laranja");
        cores.add("Vermelho");

        System.out.println("A. Exiba todas as cores uma abaixo da outra");
            for(String cor : cores){
                System.out.println(cor);
            }
        System.out.println("B. A quantidade de cores que o arco-iris tem");
            System.out.println(cores.size());
        System.out.println("C. Exiba as cores em ordem alfabetica");
            Set<String> cores2 = new TreeSet<>();
            cores2.addAll(cores);
            System.out.println(cores2);
        System.out.println("D. Exiba as cores na ordem inversa da que foi informada");
            Set<String> cores3 = new LinkedHashSet<>();
            cores3.add("Violeta");
            cores3.add("Azul-escuro");
            cores3.add("Azul");
            cores3.add("Verde");
            cores3.add("Amarelo");
            cores3.add("Laranja");
            cores3.add("Vermelho");
            for(int i = 6; i >= 0; i--) System.out.println(cores3.toArray()[i]);
        System.out.println("E. Exiba todas as cores que comecam com a letra 'v'");
            for(String cor : cores2){
                if(cor.contains("V"))
                    System.out.println(cor);
            }
        System.out.println("F. Remova todas as cores que nao comecam com a letra 'v'");
            Iterator<String> iterator = cores.iterator();
            while(iterator.hasNext()){
                String next = iterator.next();
                if(next.contains("V"))
                    iterator.remove();
            }
            System.out.println(cores);
        System.out.println("G. Limpe o conjunto");
            cores.clear();
        System.out.println("H. Confira se o conjunto esta vazio");
        System.out.println(cores.isEmpty());



    }
}
