package br.dio.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148/">Reference</a>
 *
 * @author matheusoc08
 */
public class SingletonLazyHolder {

    private static class instanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return instanceHolder.instancia;
    }
}
