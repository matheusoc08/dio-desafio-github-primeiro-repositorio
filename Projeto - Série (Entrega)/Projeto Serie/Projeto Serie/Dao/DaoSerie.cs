using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Serie.Dao
{
    class DaoSerie : DaoBase
    {
        public void InserirSerie(int id_genero, string titulo, string descricao, int ano)
        {
            var query = $"INSERT INTO SERIES (ID, ID_GENERO, TITULO, DESCRICAO, ANO) VALUES ((SELECT COUNT(*)+1 FROM SERIES), {id_genero}, '{titulo}', '{descricao}', {ano})";
            QueryExecuter(query);
        }

        public DataSet SelecionarSerie()
        {
            var query = $"SELECT ID, ID_GENERO, TITULO, DESCRICAO, ANO FROM SERIES WHERE EXCLUIDO = 0";
            var d = SelectExecuter(query);

            var ds = new DataSet();
            ds = d;
            return ds;
        }

        public DataSet SelecionarSerie(int codigo, string titulo)
        {
            var query = $"SELECT ID, ID_GENERO, TITULO, DESCRICAO, ANO,CASE WHEN EXCLUIDO = 0 THEN 'Habilitada' ELSE 'Removida' END TIPO_PESSOA FROM SERIES WHERE ID = {codigo} OR TITULO LIKE '%{titulo}%'";
            //var query = $"SELECT * FROM SERIES WHERE titulo like '%{titulo}%'";
            var d = SelectExecuter(query);

            var ds = new DataSet();
            ds = d;
            return ds;
        }

        public void AtualizarSerie(int id, int id_genero, string titulo, string descricao, int ano)
        {
            var query = $"UPDATE SERIES SET ID_GENERO = {id_genero}, TITULO = '{titulo}', DESCRICAO = '{descricao}', ANO = {ano} WHERE ID = {id}";
            QueryExecuter(query);
        }

        public void DeletarSerie(int id)
        {
            var query = $"UPDATE SERIES SET EXCLUIDO = 1 WHERE ID = {id}";
            QueryExecuter(query);
        }



    }
}
