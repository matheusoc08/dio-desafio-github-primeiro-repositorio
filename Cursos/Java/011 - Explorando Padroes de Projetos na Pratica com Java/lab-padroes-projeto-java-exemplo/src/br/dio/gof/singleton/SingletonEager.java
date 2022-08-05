package br.dio.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author matheusoc08
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
