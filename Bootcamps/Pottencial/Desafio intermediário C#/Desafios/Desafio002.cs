using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Desafios
{
    public class Desafio002
    {
        public void salario()
        {
            double salario = 0.00;
            double reajuste = 0.00;
            double novoSalario = 0.00;
            double percentual = 0.00;

            Console.WriteLine("Informe o salario atual: ");
            salario = Convert.ToDouble(Console.ReadLine());

            //TODO: Complete os espaços em branco com uma possível solução para o problema:

            if (salario <= 400.00)
            {
                percentual = 0.15;
                reajuste = salario * percentual;
                novoSalario = salario + reajuste;


            }
            else if (salario <= 800.00)
            {
                percentual = 0.12;
                reajuste = salario * percentual;
                novoSalario = salario + reajuste;

            }
            else if (salario <= 1200)
            {
                percentual = 0.1;
                reajuste = salario * percentual;
                novoSalario = salario + reajuste;

            }
            else if (salario <= 2000.00)
            {
                percentual = 0.07;
                reajuste = salario * percentual;
                novoSalario = salario + reajuste;

            }
            else
            {
                percentual = 0.04;
                reajuste = salario * percentual;
                novoSalario = salario + reajuste;

            }

            Console.WriteLine("Novo salario: {0:0.00}", novoSalario);
            Console.WriteLine("Reajuste ganho: {0:0.00}", reajuste);
            Console.WriteLine("Em percentual: {0} %", percentual * 100);

        }
    }
}
