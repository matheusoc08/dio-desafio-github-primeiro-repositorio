package br.dio.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author matheusoc08
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
