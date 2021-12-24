using System;
using CSharp;
using Interface;
using Enum;

namespace CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Pessoa person = new Pessoa();

            person.Nome = "Matheus";
            person.Idade = 24;
            person.Estado = "SP";

            var person2 = new Pessoa();

            person2.Nome = "Leonardo";
            person2.Idade = 23;
            person2.Estado = "MG";

            Animal animal = new Animal();

            animal.Nome = "Rex";
            animal.NomeDono = "Pedro";
            animal.Especie = "Cachorro";

            var pessoa1 = (Pessoas)0;

            Pessoas pessoa2 = Pessoas.João;
            Pessoas pessoa3 = (Pessoas)3;

            Console.WriteLine(pessoa3);
                            

        }
    }
}
