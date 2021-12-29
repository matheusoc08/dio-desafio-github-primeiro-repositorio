using System.Collections.Generic;
using System.IO;

namespace ExemploPOO.Helper
{

    //--DIRETORIOS--
    public class FileHelper
    {
        public void ListarDiretorios(string caminho)
        {
            var retornoCaminho = Directory.GetDirectories(caminho, "*", SearchOption.AllDirectories);

            foreach (var retorno in retornoCaminho)
            {
                System.Console.WriteLine(retorno);
            }
        }

        public void ListarArquivosDiretorios(string caminho)
        {
            var retornoArquivos = Directory.GetFiles(caminho, "*2*", SearchOption.AllDirectories);

            foreach (var retorno in retornoArquivos)
            {
                System.Console.WriteLine(retorno);
            }

        }

        public void CriarDiretorio(string caminho)
        {
            var retorno = Directory.CreateDirectory(caminho);

            System.Console.WriteLine(retorno.FullName);
        }

        public void ApagarDiretorio(string caminho, bool apagarArquivos)
        {
            Directory.Delete(caminho, apagarArquivos);
        }

        //--MANIPULAÇÃO DE ARQUIVOS--
        //Criar arquivo .txt
        public void CriarArquivoTexto(string caminho, string conteudo)
        {
            if (!File.Exists(caminho))
            {
                File.WriteAllText(caminho, conteudo);
            }
        }

        //Criando arquivo .txt com inserção de várias linhas
        public void CriarArquivoTextoStream(string caminho, List<string> conteudo)
        {
            using (var stream = File.CreateText(caminho))
            {
                foreach (var linha in conteudo)
                {
                    stream.WriteLine(linha);
                }
            }
        }

        //Adicionar novas linhas no arquivo
        public void AdicionarTexto(string caminho, string conteudo)
        {
            File.AppendAllText(caminho, conteudo);
        }

        public void AdicionarTextoStream(string caminho, List<string> conteudo)
        {
            using (var stream = File.AppendText(caminho))
            {
                foreach (var linha in conteudo)
                {
                    stream.WriteLine(linha);
                }
            }
        }

        //Leitura de arquivo
        public void LerArquivo(string caminho)
        {
            var conteudo = File.ReadAllLines(caminho);

            foreach (var linha in conteudo)
            {
                System.Console.WriteLine(linha);
            }
        }

        public void LerArquivoStream(string caminho)
        {
            string linha = string.Empty;

            using (var stream = File.OpenText(caminho))
            {
                while ((linha = stream.ReadLine()) != null)
                {
                    System.Console.WriteLine(linha);
                }
            }
        }

        //Mover arquivo
        public void MoverArquivo(string caminhoOrigem, string caminhoDestino)
        {
            File.Move(caminhoOrigem, caminhoDestino);
        }

        //Copiar arquivo
        public void CopiarArquivo(string caminhoOrigem, string caminhoDestino, bool sobreescrever)
        {
            File.Copy(caminhoOrigem, caminhoDestino, sobreescrever);
        }

        //Deletar arquivo
        public void DeletarArquivo(string caminho)
        {
            File.Delete(caminho);
        }
    }
}