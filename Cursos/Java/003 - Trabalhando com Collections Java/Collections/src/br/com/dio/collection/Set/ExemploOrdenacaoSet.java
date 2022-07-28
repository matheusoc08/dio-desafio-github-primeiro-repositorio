package br.com.dio.collection.Set;

/*Dadas as seguintes informacoes sobre minhas series favoritas,
* crie um conjunto e ordene este conjunto exibindo:
* (nome - genero - tempo de episodio;
*
* Serie 1 = nome: GOT, genero: Fantasia, tempoEpisodio: 60
* Serie 2 = nome: Dark, genero: Drama, tempoEpisodio: 60
* Serie 3 = nome: That '70s show, genero: Comedia, tempoEpisodio: 25
* */

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args){
        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comedia", 25));
        }};
        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem de insercao");
            Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("Dark", "Drama", 60));
                add(new Serie("That '70s show", "Comedia", 25));
            }};
            for(Serie serie : minhasSeries2){
                System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }

        System.out.println("\nOrdem natural (tempoEpisodio)");
            Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
            for(Serie serie : minhasSeries3){
                System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }

        System.out.println("\n--\tOrdem Nome/Genero/TempoEpisodio\t--");
            Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
            minhasSeries4.addAll(minhasSeries);
            for(Serie serie : minhasSeries4){
                System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }

        //Desafio
//        System.out.println("\n--\tOrdem Genero\t--");
//        System.out.println("\n--\tOrdem TempoEpisodio\t--");

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.tempoEpisodio);
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo((s2.getNome()));
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}