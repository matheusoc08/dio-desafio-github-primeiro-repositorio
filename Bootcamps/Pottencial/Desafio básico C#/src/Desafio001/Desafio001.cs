using System;

//Dado um número inteiro ( n ) , retorne a diferença entre o produto de seus dígitos e a soma de seus dígitos.

namespace src.Desafio001
{

    public class Desafio001
    {
        public void Calculo()
        {

            int n = 234;
            int produto = 1, soma = 0; //, cont = 0;

            while (n > 0)
            {
                // cont++;

                int l = n % 10;

                produto *= l;
                soma += l;
                n /= 10;

                // Console.WriteLine($"{cont} - L: {l}. Produto: {produto}. Soma: {soma}. N: {n}");
            }

            Console.WriteLine(produto - soma);
        }
    }
}
