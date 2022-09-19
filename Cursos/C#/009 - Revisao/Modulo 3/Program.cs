using Modulo_3.Interfaces;
using Modulo_3.Models;

/////// INTERFACE CLASS ///////

ICalculadora calc = new Calculadora();
Console.WriteLine(calc.Somar(2, 34));
Console.WriteLine(calc.Dividir(34, 2));


/////// OBJECT CLASS ///////

// Computador c = new Computador();
// Console.WriteLine(c.ToString());

/////// ABSTRACT CLASS ///////

// Corrente c = new Corrente();
// c.Creditar(500);
// c.ExibirSaldo();

// Aluno a1 = new Aluno();
// a1.Nome = "Matheus Carvalho";
// a1.Idade = 25;
// a1.Nota = 10;
// a1.Apresentar();

// Professor p1 = new Professor();
// p1.Nome = "Leonardo Buta";
// p1.Idade = 20;
// p1.Salario = 1000;
// p1.Apresentar();


// Pessoa p1 = new Pessoa();
// p1.Nome = "Matheus";
// p1.Idade = 25;
// p1.Apresentar();


// ContaCorrente c1 = new ContaCorrente(1111, 1000);
// c1.ExibirSaldo();
// c1.Sacar(500);
// c1.Sacar(1000);
// c1.ExibirSaldo();


