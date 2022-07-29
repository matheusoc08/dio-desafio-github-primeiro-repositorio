package br.dio.oo;

public class RodarApp {
    public static void main(String[] args){

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //Polimorfismo
        for (ClasseMae classe : classes){
            classe.metodo1();
        }

        System.out.println("");

        //Polimorfismo e polimorfismo com sobre escrita
        for (ClasseMae classe : classes){
            classe.metodo2();
        }

        System.out.println("");

        //Sobre escrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
}
