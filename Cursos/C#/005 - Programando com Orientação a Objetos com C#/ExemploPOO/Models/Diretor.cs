using System;

namespace ExemploPOO.Models
{
    public class Diretor : Professor
    {
        public override void Apresentar()
        {
            Console.WriteLine($"Olá! Sou o diretor.");
        }

    }
}