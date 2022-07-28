package br.com.dio.collection.Map;

/*Faca um programa que simule um lancamento de dados.
* Lance o dado 100 vezes e armazene.
* Depois, mostre quantas vezes cada valor foi inserido.*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Ex002_DesafioDados {
    public static void main(String[] args){
        Random random = new Random();
        Map<String, Integer> dado = new LinkedHashMap<>(){{
            put("L1", 0);
            put("L2", 0);
            put("L3", 0);
            put("L4", 0);
            put("L5", 0);
            put("L6", 0);
        }};

        System.out.println(dado);

        for(int i = 0; i < 100; i++) {
            int lado = random.nextInt(1, 7);

            switch (lado) {
                case 1:
                    int l1 = dado.get("L1");
                    l1++;
                    dado.put("L1", l1);
                    break;
                case 2:
                    int l2 = dado.get("L2");
                    l2++;
                    dado.put("L2", l2);
                    break;
                case 3:
                    int l3 = dado.get("L3");
                    l3++;
                    dado.put("L3", l3);
                    break;
                case 4:
                    int l4 = dado.get("L4");
                    l4++;
                    dado.put("L4", l4);
                    break;
                case 5:
                    int l5 = dado.get("L5");
                    l5++;
                    dado.put("L5", l5);
                    break;
                case 6:
                    int l6 = dado.get("L6");
                    l6++;
                    dado.put("L6", l6);
                    break;
                default:
                    System.out.println("Deu ruim!");
                    break;
            }
        }

        System.out.println(dado);
    }
}
