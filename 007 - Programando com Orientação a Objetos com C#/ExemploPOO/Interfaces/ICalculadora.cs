namespace ExemploPOO.Interfaces
{
    public interface ICalculadora
    {
        int Somar(int num1, int num2);
        int Subtrair(int num1, int num2);
        int Multiplicar(int num1, int num2);

        //Se o método receber uma implementação dentro da interface, não é mais obrigatório implementar o método na classe "filha"
        int Dividir(int num1, int num2)
        {
            return num1 / num2;
        }
    }
}