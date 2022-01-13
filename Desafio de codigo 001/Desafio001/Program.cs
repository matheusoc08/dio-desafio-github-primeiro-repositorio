using System;
using System.Collections.Generic;
using System.Text;

namespace Dio
{
    class Xenlongao
    {
        static void Main(string[] args)
        {

            /*
            int quantidadeEsferas = Convert.ToInt32(Console.ReadLine());
            int divisorPar = 0;

            while (quantidadeEsferas > 0)
            {
                int quantidadeDivisor = 0;

                for (int i = quantidadeEsferas; i > 0; i--)
                {
                    if (quantidadeEsferas % i == 0)
                    {
                        quantidadeDivisor++;
                    }
                }

                if (quantidadeDivisor % 2 == 0)
                {
                    divisorPar++;
                }

                quantidadeEsferas--;
            }
            System.Console.WriteLine(divisorPar);
            */


            // Resposta DIO
            int C = Convert.ToInt32(Console.ReadLine());
            while (C-- > 0)
            {
                int val = Convert.ToInt32(Console.ReadLine());
                int newval = (int)Math.Sqrt(val);        //complete com a sua lógica
                int resposta = val - newval;
                Console.WriteLine(resposta);
            }
        }
    }
}