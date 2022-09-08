using System;

/*
Paulinho tem em suas mãos um novo problema. Agora a sua professora lhe pediu que construísse
um programa para verificar, à partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.
*/
namespace src.Desafio002
{

    public class Desafio002
    {

        public void EncaixaNumero()
        {

            int qtd = 1;

            for (int i = 0; i < qtd; i++)
            {

                // string? a = Console.ReadLine();
                // string? b = Console.ReadLine();

                string a = "54";
                string b = "64545454545454545454545454545454554";

                var teste = a?.EndsWith(b);

                Console.WriteLine(teste);

                if (a.Length < b.Length)
                {
                    Console.WriteLine("Nao encaixa");
                }
                else if (a.EndsWith(b))
                {
                    Console.WriteLine("Encaixa");
                }
                else
                {
                    Console.WriteLine("Nao encaixab");
                }
            }
        }
    }
}

