package br.com.dio.collection.Map;

/*Dada a populacao estimada de alguns estados no NE brasileiro, faca:
* Estado = PE - Populacao = 9.616.621
* Estado = AL - Populacao = 3.351.543
* Estado = CE - Populacao = 9.187.103
* Estado = RN - Populacao = 3.534.265
* */

import java.util.*;

public class Ex001_PopulacaoEstados {
    public static void main(String[] args){

        System.out.println("\nCrie um dicionario e relacione os estados e suas populacoes");
        Map<String, Integer> estados = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};

        System.out.println("\nSubstitua a populacao do estado do RN por 3.534.165");
        estados.put("PE", 3534165);
        System.out.println(estados);

        System.out.println("\nConfira se o estado do PB esta no dicionario, caso nao adicione: PB - 4.039.277");
        if(!estados.containsKey("PB"))
            estados.put("PB", 4039277);

        System.out.println("\nExiba a populacao do PE");
        System.out.println(estados.get("PE"));

        System.out.println("\nExiba todos os estados e suas populacoes na ordem em que foi informado");
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2);

        System.out.println("\nExiba os estados e suas populacoes em ordem alfabetica");
        Map<String, Integer> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);

        System.out.println("\nExiba o estado com a menor populacao e sua quantidade");
        Integer menorPopulacao = Collections.min(estados.values());
        String estadoMenosPopuloso = "";
        Set<Map.Entry<String, Integer>> estados4 = estados.entrySet();
        for(Map.Entry<String, Integer> estado : estados4){
            if(estado.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = estado.getKey();
                System.out.println(estadoMenosPopuloso + " - " + menorPopulacao);
            }
        }

        System.out.println("\nExiba o estado com a maior populacao e sua quantidade");
        Integer maiorPopulacao = Collections.max(estados.values());
        String estadoMaisPopuloso = "";
        for(Map.Entry<String, Integer> estado : estados4){
            if(estado.getValue().equals(maiorPopulacao)){
                estadoMaisPopuloso = estado.getKey();
                System.out.println(estadoMaisPopuloso + " - " + maiorPopulacao);
            }
        }

        System.out.println("\nExiba a soma da populacao desses estados");
        Iterator<Integer> interator = estados.values().iterator();
        Integer soma = 0;
        while(interator.hasNext()){
            soma += interator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a media da populacao deste dicionario de estados");
        System.out.println(soma / estados.size());

        System.out.println("\nRemova os estados com a populacao menor que 4.000.000");
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next() < 4000000){
                iterator.remove();
            }
        }
        System.out.println(estados);

        System.out.println("\nApague o dicionario de estados");
        estados.clear();

        System.out.println("\nConfira se o dicionario esta vazio");
        System.out.println(estados.isEmpty());
    }
}
