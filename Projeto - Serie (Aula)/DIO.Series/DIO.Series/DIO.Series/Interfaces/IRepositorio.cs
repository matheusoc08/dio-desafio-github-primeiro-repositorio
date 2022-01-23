using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DIO.Series.Interfaces
{
    public interface IRepositorio<T>
    {
        List<T> Lista();

        T RetornaPorId(int id);
        void Insere(T entidade);
        void Exclui(int id);
        int ProximoId();
        void Atualiza(int id, T entidade);
    }
}
