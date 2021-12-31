namespace ExemploConstrutores.Models
{
    public class Calculadora
    {
        //DELEGATE
        public delegate void DelegateCalculadora();
        //EVENTO
        public static event DelegateCalculadora EventoCalculadora;

        public static void Somar(int x, int y)
        {
            if (EventoCalculadora != null)
            {
                System.Console.WriteLine($"Adição: {x + y}");
                EventoCalculadora();
            }
            else
            {
                System.Console.WriteLine("Nenhum inscrito!");
            }
        }

        public static void Subtrair(int x, int y)
        {
            System.Console.WriteLine($"Subtraçãpo: {x - y}");
        }
    }
}