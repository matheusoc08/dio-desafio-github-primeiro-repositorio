package br.com.dio.collection.Map;

/*Dadas as seguintes informacoes sobre meus livros favoritos e seus autores,
* crie um dicionario e ordene este dicionario:
* Exibindo (Nome Autor - Nome Livro);
*
* Autor = Hawking, Stephen - Livro = nome: Uma breve Historia do Tempo, paginas: 256
* Autor = Duhigg, Charles - Livro = nome: O Poder do Habito, paginas: 408
* Autor = Harari, Yuval Noah - Livro = nome: 21 Licoes Para o Seculo 21, paginas: 432*
* */

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args){

        System.out.println("\n--\tOrdem Aleatoria\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
           put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
           put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Insercao\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Alfabetica autores\t--");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for(Map.Entry<String, Livro> livro : meusLivros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Alfabetica nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros3.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Numero de pagina\t--");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPagina());
        meusLivros5.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros5){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getPaginas(){
        return this.paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString(){
        return "livro{" +
                "nome=" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getPaginas(), livro2.getValue().getPaginas());
    }
}