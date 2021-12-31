using System;
using ExemploConstrutores.Models;

namespace ExemploConstrutores
{
    class Program
    {

        //--DELEGATE--
        public delegate void Operacao(int x, int y);
        static void Main(string[] args)
        {

            // Aluno p1 = new Aluno("Matheus", "Carvalho", "Programacao");
            // p1.Apresentar();

            // Log log = Log.GetInstance();
            // log.PropriedadeLog = "Teste instancia";

            // Log log2 = Log.GetInstance();
            // System.Console.WriteLine(log2.PropriedadeLog);

            // Data data = new Data();
            // //data.SetMes(22);
            // data.Mes = 63;
            // data.ApresentarMes();

            //--CONSTANTES--
            // const double pi = 3.14;
            // System.Console.WriteLine(pi);

            //--DELEGATE--
            //Operacao op = Calculadora.Somar);
            // Operacao op = new Operacao(Calculadora.Somar);
            // //op(10, 10)
            // op.Invoke(10, 10);

            // //DELEGATE MULTICAST
            // op += Calculadora.Subtrair; //Neste caso, ele está adicionando a referencia de mais uma método, sem perder o método anterior
            // op.Invoke(10, 10);

            //--EVENTO--
            Matematica m = new Matematica(10, 20);
            m.Somar();



        }
    }
}
