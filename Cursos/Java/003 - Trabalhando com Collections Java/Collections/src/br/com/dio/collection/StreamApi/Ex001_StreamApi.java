package br.com.dio.collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Ex001_StreamApi {
    public static void main(String[] args){
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String: ");
            //Maneira padrao
            /*numerosAleatorios.stream().forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });*/

            //Maneira Lambda
            //numerosAleatorios.stream().forEach(s -> System.out.println(s));

            //Maneira sem stream
            //numerosAleatorios.forEach(s -> System.out.println(s));

            //Maneira Method reference
            numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 ultimos primeiros e coloque dentro de um Set");
        /*numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        //Ou inserindo numa variavel de Set<String>
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("\nTransforme esta lista de String em uma lista de numeros inteiros");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("\nPegue os numeros pares e mairoes que 2 e coloque em uma lista");
        //Maneira padrao
        /*List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());*/

        //Maneira simplificada
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("\nMostre a media dos numeros");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);

        System.out.println("\nRemova os valores impares");
        List<Integer> numerosAleatoriosInteger2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger2.removeIf(integer -> (integer % 2 != 0) );

        System.out.println(numerosAleatoriosInteger2);

    }
}
