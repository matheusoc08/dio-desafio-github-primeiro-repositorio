package br.com.dio.collection.Map;

/*Dado os modelos dos carros e seus respectivos consumos na estrada, faca:
* modelo = gol - consumo = 14,4km/l
* modelo = uno - consumo = 15,6km/l
* modelo = mobi - consumo = 16,1km/l
* modelo = hb20 - consumo = 14,5km/l
* modelo = kwid - consumo = 15,6km/l
*
* */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args){

        System.out.println("\nCrie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
            System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2km/l");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("\nExiba o terceiro modelo adicionado: ");

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais economico e seu consumo: ");
            Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
            Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
            String modeloMaisEficiente = "";
            for(Map.Entry<String, Double> entry : entries){
                if(entry.getValue().equals(consumoMaisEficiente)) {
                    modeloMaisEficiente = entry.getKey();
                    System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
                }
            }

        System.out.println("\nExiba o modelo menos economico e seu consumo");
            Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
            String modelosMenosEficiente = "";
            for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
                if(entry.getValue().equals(consumoMenosEficiente)){
                    modelosMenosEficiente = entry.getKey();
                    System.out.println("Modelo menos eficiente: " + modelosMenosEficiente + " - " + consumoMenosEficiente);
                }
            }

        System.out.println("\nExiba a soma dos consumos: ");
            Iterator<Double> iterator = carrosPopulares.values().iterator();
            Double soma = 0d;
            while (iterator.hasNext()){
                soma += iterator.next();
            }
            System.out.println(soma);
        System.out.println("\nExiba a media dos consumos deste dicionario de carros: " + soma/carrosPopulares.size());

        System.out.println("\nRemova os modelos com o consumoigual a 15,6km/l");
            Iterator<Double> iterator1 = carrosPopulares.values().iterator();
            while (iterator1.hasNext()){
                if(iterator1.next().equals(15.6))
                    iterator1.remove();
            }
            System.out.println(carrosPopulares);
        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
            Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }};
            System.out.println(carrosPopulares2);

        System.out.println("\nExiba o dicionario ordenado pelo modelo: ");
            Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
            System.out.println(carrosPopulares3);

        System.out.println("\nApague o conj8unto de carros: ");
        carrosPopulares3.clear();

        System.out.println("\nConfira se a lista esta vazia: ");
        System.out.println(carrosPopulares3.isEmpty());

    }
}
