using System;

//Dado um inteiro n, retorne true se n tiver exatamente três divisores positivos.

namespace src.Desafio003
{
    public class Desafio003
    {
        public void divisores()
        {
            int n = 5;
            int count = 0;

            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    count++;
                }
            }
            Console.WriteLine(count == 3);
        }
    }
}
