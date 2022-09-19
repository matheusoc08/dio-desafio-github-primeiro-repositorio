using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Modulo_3.Models
{
    public sealed class Professor : Pessoa
    {
        public decimal Salario { get; set; }

        public override void Apresentar()
        {
            Console.WriteLine($"Ola, meu nome é {Nome}, tenho {Idade} anos e ganho {Salario}!");
        }

    }
}