using System;

namespace ExemploPOO.Models
{
    public class Professor : Pessoa
    {
        public double Salario { get; set; }


        public override void Apresentar()
        {
            Console.WriteLine($"Olá! Meu nome é {Nome} e meu salário é de R$ {Salario}.");
        }
    }
}