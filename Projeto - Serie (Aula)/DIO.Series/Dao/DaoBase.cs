using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DIO.Series
{
    class DaoBase
    {
        public static void Connection()
        {
            Console.WriteLine("Getting connection...");
            string connString = @"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30";
            SqlConnection conn = new SqlConnection(connString);
            try
            {
                Console.WriteLine("Openning Connection...");
                conn.Open();
                Console.WriteLine("Connection successfull!");
            }
            catch (Exception e)
            {
                Console.WriteLine("Error" + e.Message);
            }
            Console.Read();

        }

        public static void InserirDB(int id, int genero, string titulo, string descricao, int ano)
        {
            string connString = @"Data Source=localhost\SQLEXPRESS;Initial Catalog=PROJETO_SERIE_DIO;Integrated Security=True;Connect Timeout=30";
            SqlConnection conn = new SqlConnection(connString);
            conn.Open();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.Append($"INSERT INTO SERIES (ID, ID_GENERO, TITULO, DESCRICAO, ANO) VALUES({id}, {genero}, {titulo}, {descricao}, {ano})");
            string query = stringBuilder.ToString();
            SqlCommand command = new SqlCommand(query, conn);
            conn.Close();
        }
    }
}
