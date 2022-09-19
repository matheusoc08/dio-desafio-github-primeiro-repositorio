using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Modulo_2.Models
{
    public class Curso
    {


        public string Nome { get; set; }
        public List<Pessoa> Alunos { get; set; }

        public void AdicionarAluno(Pessoa aluno)
        {
            Alunos.Add(aluno);
        }

        public int ObterQuantidadeAlunosMatriculados()
        {
            int quantidade = Alunos.Count;

            return quantidade;
        }

        public bool RemoverAluno(Pessoa pessoa)
        {
            return Alunos.Remove(pessoa);
        }

        public void ListarAlunos()
        {
            for (int count = 0; count < Alunos.Count; count++)
            {
                // string texto = "Nº " + count + " - " + Alunos[count].NomeCompleto;
                string texto = $"Nº {count + 1} - {Alunos[count].NomeCompleto}";
                Console.WriteLine(texto);
            }
        }
    }
}