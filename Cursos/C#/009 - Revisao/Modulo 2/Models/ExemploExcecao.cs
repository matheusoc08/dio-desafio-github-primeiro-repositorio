using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Modulo_2.Models
{
    public class ExemploExcecao
    {

        public void Metodo1()
        {
            try
            {
                Metodo2();
            }
            catch (Exception e)
            {
                Console.WriteLine("Deu ruim. " + e.Message + e.StackTrace);
            }
        }

        public void Metodo2()
        {
            Metodo3();
        }
        public void Metodo3()
        {
            Metodo4();
        }
        public void Metodo4()
        {
            throw new Exception("Ocorreu uma exceção");
        }


    }

}