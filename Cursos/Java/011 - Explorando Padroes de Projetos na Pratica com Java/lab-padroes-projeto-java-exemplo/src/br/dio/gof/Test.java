package br.dio.gof;

import br.dio.gof.facade.Facade;
import br.dio.gof.singleton.SingletonEager;
import br.dio.gof.singleton.SingletonLazy;
import br.dio.gof.singleton.SingletonLazyHolder;
import br.dio.gof.strategy.*;

public class Test {

    public static void main(String[] args){

        //Testes relacionados ai Design Pattern Singleton
//        SingletonLazy lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstancia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println(lazyHolder);

        //Strategy
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento agressivo = new ComportamentoAgressivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(agressivo);
//        robo.mover();
//        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14901788");


    }
}
