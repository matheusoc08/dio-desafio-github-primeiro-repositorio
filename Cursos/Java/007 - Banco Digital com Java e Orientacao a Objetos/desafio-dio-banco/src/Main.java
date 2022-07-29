public class Main {
    public static void main(String[] args){

        Cliente matheus = new Cliente();
        Cliente vilma = new Cliente();

        matheus.setNome("Matheus Carvalho");
        vilma.setNome("Vilma Rodrigues");


        Conta cc = new ContaCorrente(matheus);
        Conta cp = new ContaPoupanca(vilma);

        cc.depositar(100);
        cc.transferir(cp, 20);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
