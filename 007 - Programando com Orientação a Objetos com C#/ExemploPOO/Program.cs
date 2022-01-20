using System;
using System.Collections.Generic;
using System.IO;
using ExemploPOO.Helper;
using ExemploPOO.Interfaces;
using ExemploPOO.Models;

namespace ExemploPOO
{
    class Program
    {
        static void Main(string[] args)
        {

            //--ABSTRACAO--
            // Pessoa p1 = new Pessoa();

            // p1.Nome = "Apolo";
            // p1.Idade = 20;

            // p1.Apresentar();

            //--ENCAPSULAMENTO--
            //Valores válidos
            // Retangulo r = new Retangulo();
            // r.DefinirMedidas(30, 30);
            // System.Console.WriteLine($"Área: {r.ObterArea()}");

            // //Válores inválidos
            // Retangulo r2 = new Retangulo();
            // r2.DefinirMedidas(0, 0);
            // System.Console.WriteLine($"Área: {r2.ObterArea()}");

            //--HERANCA--
            // Aluno a1 = new Aluno();
            // a1.Nome = "John";
            // a1.Idade = 16;
            // a1.Documento = "11111111111";
            // a1.Nota = 6;
            // a1.Apresentar();

            // Professor p1 = new Professor();
            // p1.Nome = "Carlota";
            // p1.Idade = 28;
            // p1.Salario = 1800;
            // p1.Documento = "00000000000";
            // p1.Apresentar();

            //--POLIMORFISMO - OVERRIDE (Em tempo de execução)--
            // Aluno a1 = new Aluno();
            // a1.Nome = "John";
            // a1.Idade = 16;
            // a1.Documento = "11111111111";
            // a1.Nota = 6;
            // a1.Apresentar();

            // Professor p1 = new Professor();
            // p1.Nome = "Carlota";
            // p1.Idade = 28;
            // p1.Salario = 1800;
            // p1.Documento = "00000000000";
            // p1.Apresentar();

            //--POLIMORFISMO - OVERLOAD (Em tempo de compilação)--
            // Calculadora calc = new Calculadora();
            // System.Console.WriteLine("Resultado da primeira soma: " + calc.Somar(4, 9, 10));
            // System.Console.WriteLine("Resultado da segunda soma: " + calc.Somar(4, 9));

            // //--CLASSES ABSTRATAS--
            // Corrente cc1 = new Corrente();
            // cc1.Creditar(100);
            // cc1.ExibirSaldo();

            //--EXEMPLO CLASSE OBJECT--
            // Computador comp = new Computador();
            // System.Console.WriteLine(comp.ToString());

            //--INTERFACES--
            // ICalculadora calc = new Calculadora();
            // System.Console.WriteLine(calc.Somar(10, 20));

            //--ARQUIVOS--
            //--DIRETORIOS--
            var caminho = "C:\\workspace\\dio-desafio-github-primeiro-repositorio\\Programando com Orientação a Objetos com C#\\Arquivos";
            //var caminhoPathCombine = Path.Combine(caminho, "Pasta Teste 3", "Subpasta Teste 3");
            var caminhoPathCombine = Path.Combine(caminho, "Pasta Teste 1");

            FileHelper helper = new FileHelper();

            //helper.ListarDiretorios(caminho);

            //helper.ListarArquivosDiretorios(caminho);

            // System.Console.WriteLine("Criando diretório: " + caminhoPathCombine);
            // helper.CriarDiretorio(caminhoPathCombine);

            // System.Console.WriteLine("Apagando pastas e arquivos em: " + caminhoPathCombine);
            // helper.ApagarDiretorio(caminhoPathCombine, true);

            //--MANIPULAÇÃO DE ARQUIVOS--
            //Criar arquivo .txt
            // var caminhoArquivo = Path.Combine(caminho, "arquivo-teste.txt");
            // helper.CriarArquivoTexto(caminhoArquivo, "Ola! Teste de escrita de arquivo!");

            //Criando arquivo .txt com inserção de linhas
            // var listaString = new List<string> { "Linha 1", "Linha 2", "Linha 3" };
            var caminhoArquivo = Path.Combine(caminho, "arquivo-teste-stream.txt");

            // helper.CriarArquivoTextoStream(caminhoArquivo, listaString);

            // //Adicionar novas linhas no arquivo
            // var listaStringContinuacao = new List<string> { "Linha 4", "Linha 5", "Linha 6" };
            // helper.AdicionarTextoStream(caminhoArquivo, listaStringContinuacao);

            //Leitura de arquivo            
            //helper.LerArquivoStream(caminhoArquivo);

            //Mover arquivo
            var novoCaminhoArquivo = Path.Combine(caminho, "Pasta Teste 2", "arquivo-teste-stream.txt");
            // helper.MoverArquivo(caminhoArquivo, novoCaminhoArquivo);

            //Copiar arquivo
            var caminhoArquivoTeste = Path.Combine(caminho, "arquivo-teste.txt");
            var caminhoArquivoTesteCopia = Path.Combine(caminho, "arquivo-teste-bkp.txt");
            //helper.CopiarArquivo(caminhoArquivoTeste, caminhoArquivoTesteCopia, false);

            //Deletar arquivo
            helper.DeletarArquivo(caminhoArquivoTesteCopia);

        }
    }
}
