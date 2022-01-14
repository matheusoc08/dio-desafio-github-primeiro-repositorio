using System;
using Mentoria_POO.source.Entities;

namespace Mentoria_POO
{
    class Program
    {
        static void Main(string[] args)
        {
            Heroi arus = new Heroi("Arus", "Guerreiro");
            Mago wedge = new Mago("Wedge", "Mago negro");
            Inimigo mummy = new Inimigo("King Mummy", "Zumbi");


            //Console.WriteLine($"O nome do meu heroi é {arus.Nome}");
            //System.Console.WriteLine(Wedge.ToString());

            System.Console.WriteLine(arus.Atacar());
            System.Console.WriteLine(mummy.Atacar());

            if (arus.ValorUltimoAtaque == mummy.ValorUltimoAtaque)
            {
                System.Console.WriteLine($"Empate! Ambos causaram {arus.ValorUltimoAtaque}");
            }
            else if (arus.ValorUltimoAtaque > mummy.ValorUltimoAtaque)
            {
                mummy.ReceberDano(arus.ValorUltimoAtaque - mummy.ValorUltimoAtaque);
                System.Console.WriteLine($"{arus.Nome} venceu esse round");
            }
            else
            {
                arus.ReceberDano(mummy.ValorUltimoAtaque - arus.ValorUltimoAtaque);
                System.Console.WriteLine($"{mummy.Nome} venceu esse round");
            }

            System.Console.WriteLine(arus.ValorUltimoAtaque);
            System.Console.WriteLine(mummy.ValorUltimoAtaque);

        }
    }
}

