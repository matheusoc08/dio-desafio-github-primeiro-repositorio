package br.dio.oo;

public class RodarAplicacao {
    public static void main(String[] args){
        Carro c1 = new Carro("Vermelho", "Renault", 100d);

        System.out.println("Modelo: " + c1.getModelo() + "\nCor: " + c1.getCor());
        System.out.println("O valor para encher o tanque e: R$" + c1.abastercerCarro(3d));

        System.out.println();

        Carro c2 = new Carro();

        c2.setCor("Azul");
        c2.setModelo("Ferrari");
        c2.setCapacidadeTanque(200d);

        System.out.println("Modelo: " + c2.getModelo() + "\nCor: " + c2.getCor());
        System.out.println("O valor para encher o tanque e: R$" + c2.abastercerCarro(3d));

    }
}
