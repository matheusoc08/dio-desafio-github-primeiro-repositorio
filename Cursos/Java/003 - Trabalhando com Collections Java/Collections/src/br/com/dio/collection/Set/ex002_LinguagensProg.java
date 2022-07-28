package br.com.dio.collection.Set;

/*Crie uma classse LinguagemFavorita que possua os atributos
* nome, anoDeCriacao, ide. Em seguida, crie um conjunto com 3 linguagens
* e faca um programa que ordene esse conjunto por:*/

import com.sun.source.tree.Tree;

import java.util.*;

public class ex002_LinguagensProg {
    public static void main(String[] args){

        Set<LinguagemFavorita> lp = new HashSet<>(){{
           add(new LinguagemFavorita("Java", 1995, "Eclipse"));
           add(new LinguagemFavorita("Python", 1991, "IDLE"));
           add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
           add(new LinguagemFavorita("TypeScript", 2012, "Visual Studio Code"));
        }};

        System.out.println("A. Ordem de insercao");
            Set<LinguagemFavorita> lp2 = new LinkedHashSet<>(){{
                add(new LinguagemFavorita("Java", 1995, "Eclipse"));
                add(new LinguagemFavorita("Python", 1991, "IDLE"));
                add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
                add(new LinguagemFavorita("TypeScript", 2012, "Visual Studio Code"));
                add(new LinguagemFavorita("Ruby", 1995, "RubyMine"));
            }};
            System.out.println(lp2);
        System.out.println("B. Ordem natural (nome)");
            Set<LinguagemFavorita> lp5 = new TreeSet<>(new ComparatorNome());
            lp5.addAll(lp2);
            System.out.println(lp5);

        System.out.println("C. Ordenar por IDE");
            Set<LinguagemFavorita> lp6 = new TreeSet<>(new ComparatorIde());
            lp6.addAll(lp2);
            System.out.println(lp6);
        System.out.println("D. Ordenar por Ano de criacao e nome");
            Set<LinguagemFavorita> lp3 = new TreeSet<>(lp2);
            System.out.println(lp3);
        System.out.println("E. Ordenar por Nome, ano de criacao e IDE");
            Set<LinguagemFavorita> lp4 = new TreeSet<>(new ComparatorNomeAnoIde());
            lp4.addAll(lp2);
            System.out.println(lp4);
        System.out.println("F. Ao final, exiba as linguagens no console, uma abaixo da outra");

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    String nome;
    Integer anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getAnoDeCriacao(){
        return this.anoDeCriacao;
    }

    public String getIde(){
        return this.ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(LinguagemFavorita lp) {
        int anoCriacao = Integer.compare(this.getAnoDeCriacao(), lp.getAnoDeCriacao());
        if (anoCriacao != 0)
            return anoCriacao;
        return this.getNome().compareTo(lp.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lp1, LinguagemFavorita lp2) {
        int nome = lp1.getNome().compareTo(lp2.getNome());
        if(nome != 0) return nome;

        int anoCriacao = lp1.getAnoDeCriacao().compareTo(lp2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        int ide = lp1.getIde().compareTo(lp2.getIde());
        return ide;

    }
}

class ComparatorNome implements  Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lp1, LinguagemFavorita lp2) {
        return lp1.getNome().compareTo(lp2.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lp1, LinguagemFavorita lp2) {
        return lp1.getIde().compareTo(lp2.getIde());
    }
}