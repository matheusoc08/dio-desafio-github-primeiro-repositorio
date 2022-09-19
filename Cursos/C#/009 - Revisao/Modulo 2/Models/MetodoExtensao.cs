using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Modulo_2.Models
{
    public static class MetodoExtensao
    {
        public static bool EhPar(this int numero)
        {
            return numero % 2 == 0;
        }
    }
}