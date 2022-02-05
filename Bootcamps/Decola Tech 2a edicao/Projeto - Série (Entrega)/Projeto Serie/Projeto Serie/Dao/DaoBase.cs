using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Projeto_Serie.Dao
{
    public abstract class DaoBase : IDisposable
    {
        public DaoBase()
        {
            SqlConnection conn = new SqlConnection(@"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30");
        }
        
        //public static void Connection()
        //{
        //    SqlConnection conn = new SqlConnection(@"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30");
        //    conn.Open();
        //}

        public static void QueryExecuter(string query)
        {
            SqlConnection conn = new SqlConnection(@"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30");
            conn.Open();
            //StringBuilder stringBuilder = new StringBuilder();
            //stringBuilder.Append("INSERT INTO SERIES (ID, ID_GENERO, TITULO, DESCRICAO, ANO) VALUES");
            //stringBuilder.Append("(1, 2, 'Teste 3', 'asasaas', 2002)");
            //string sqlQuery = stringBuilder.ToString();
            using (SqlCommand command = new SqlCommand(query, conn))
            {
                command.ExecuteNonQuery();
            }
            conn.Close();
        }

        public static DataSet SelectExecuter(string query)
        {
            SqlConnection conn = new SqlConnection(@"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30");
            conn.Open();
            var dataAdapter = new SqlDataAdapter(query, conn);

            var commandBuilder = new SqlCommandBuilder(dataAdapter);
            //return commandBuilder;
            
            var ds = new DataSet();
            dataAdapter.Fill(ds);

            conn.Close();

            return ds;
            //dataGridView1.ReadOnly = true;
            //dataGridView1.DataSource = ds.Tables[0];
        }

        public void Dispose()
        {
            throw new NotImplementedException();
        }
    }
}
