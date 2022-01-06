using System;
using System.Collections.Generic;
using Colecoes.Helper;

namespace Colecoes
{

    class Program
    {
        static void Main(string[] args)
        {

            //--ARRAY SIMPLES--
            // int[] arrayInteiros = new int[3];
            // arrayInteiros[0] = 10;
            // arrayInteiros[1] = 20;
            // arrayInteiros[2] = 30;

            // System.Console.WriteLine("Percorrendo array pelo For");
            // for (int i = 0; i < arrayInteiros.Length; i++)
            // {
            //     System.Console.WriteLine(arrayInteiros[i]);
            // }

            // System.Console.WriteLine("Percorrendo array pelo Foreach");
            // foreach (var item in arrayInteiros)
            // {
            //     System.Console.WriteLine(item);
            // }

            //--ARRAY MULTIDIMENSIONAL - MATRIZ--
            //int[,] matriz = new int[4, 2];
            //matriz[0, 0] = 5;

            // int[,] matriz = new int[4, 2] {
            //     {8, 8},
            //     {10, 20},
            //     {50, 100},
            //     {9, 200}
            // };

            // for (int i = 0; i < matriz.GetLength(0); i++)
            // {
            //     for (int j = 0; j < matriz.GetLength(1); j++)
            //     {
            //         System.Console.WriteLine(matriz[i, j]);
            //     }
            // }


            //--Bubblesort--
            // OperacoesArray op = new OperacoesArray();
            // int[] array = new int[5] { 6, 3, 8, 1, 9 };

            // System.Console.WriteLine("Array original:");
            // op.ImprimirArray(array);
            // op.OrdenarBubbleSort(ref array);
            // System.Console.WriteLine("Array ordenado:");
            // op.ImprimirArray(array);


            //--Classe Array--
            // int[] array = new int[5] { 6, 3, 8, 1, 9 };

            // OperacoesArray op = new OperacoesArray();

            // System.Console.WriteLine("Array original:");
            // op.ImprimirArray(array);

            //op.Ordenar(ref array);

            // System.Console.WriteLine("Array ordenado:");
            // op.ImprimirArray(array);

            //--Copiando array--
            // int[] arrayCopia = new int[10];
            // System.Console.WriteLine("Array antes da cópia");
            // op.ImprimirArray(arrayCopia);

            // op.Copiar(ref array, ref arrayCopia);
            // System.Console.WriteLine("Array após a cópia");
            // op.ImprimirArray(arrayCopia);

            //--Verificar se existe
            // int valorProcurado = 15;
            // bool existe = op.Existe(array, valorProcurado);

            // if (existe)
            // {
            //     System.Console.WriteLine("Encontrei o valor: {0}", valorProcurado);
            // }
            // else
            // {
            //     System.Console.WriteLine("Não encontrei o valor: {0}", valorProcurado);
            // }

            //--TrueForAll
            // int valorProcurado = 5;
            // bool todosMaiorQue = op.TodosMaiorQue(array, valorProcurado);

            // if (todosMaiorQue)
            // {
            //     System.Console.WriteLine("Todos os valores são maior que {0}", valorProcurado);
            // }
            // else
            // {
            //     System.Console.WriteLine("Existem valores que não são maiores do que {0}", valorProcurado);
            // }

            // //--Encontrar o valor
            // int valorProcurado = 1;
            // int valorAchado = op.ObterValor(array, valorProcurado);

            // if (valorAchado > 0)
            // {
            //     System.Console.WriteLine("Encontrei o valor");
            // }
            // else
            // {
            //     System.Console.WriteLine("Não encontrei o valor");
            // }

            // //--Encontrar index--
            // int valorProcurado = 8;
            // int indice = op.ObterIndice(array, valorProcurado);
            // if (indice > -1)
            // {
            //     //System.Console.WriteLine("O indice do elemento {0} é {1}", valorProcurado, indice);
            //     System.Console.WriteLine($"O indice do elemento {valorProcurado} é {indice}", valorProcurado, indice);
            // }
            // else
            // {
            //     System.Console.WriteLine("Valor não existente no array");
            // }

            //--Alterar tamano do array--
            // System.Console.WriteLine($"Capacidade atual do array {array.Length}");

            // op.RedimensionarArray(ref array, array.Length * 2);
            // System.Console.WriteLine($"Capacidade atual do array após redimensionar: {array.Length}");

            // //--Converter tipo do array--
            // string[] arrayString = op.ConverterParaArrayString(array);

            //--Lista--
            // List<string> estados = new List<string>();

            //Add elementos
            // estados.Add("SP");
            // estados.Add("MG");
            // estados.Add("BA");

            // System.Console.WriteLine($"Quantidade de elementos na lista: {estados.Count}");

            // foreach (var item in estados)
            // {
            //     System.Console.WriteLine(item);
            // }

            // for (int i = 0; i < estados.Count; i++)
            // {
            //     System.Console.WriteLine($"Indice {i}, Valor: {estados[i]}");
            // }

            // OperacoesLista opLista = new OperacoesLista();
            // opLista.ImprimirListString(estados);

            //Deletando elementos
            // System.Console.WriteLine("Removendo o elemento...");
            // estados.Remove("MG");
            // opLista.ImprimirListString(estados);

            //Adicionando elementos a partir de um array/coleção existente
            // string[] estadosArray = new string[2] { "SC", "MT" };
            // //List<string> estados = new List<string> { "SP", "MG", "BA"}; //Forma para criar uma lista já declarada
            // estados.AddRange(estadosArray);
            // opLista.ImprimirListString(estados);

            //Add elemento em um indice específico
            // estados.Insert(1, "RJ");
            // opLista.ImprimirListString(estados);

            //--FILA--
            // Queue<string> fila = new Queue<string>();

            //Add elementos
            // fila.Enqueue("Leonardo");
            // fila.Enqueue("Eduardo");
            // fila.Enqueue("Andre");

            // //Remover elemento
            // System.Console.WriteLine($"Pessoas na fila: {fila.Count()}");
            // while (fila.Count > 0)
            // {
            //     System.Console.WriteLine($"Vez de: {fila.Peek()}"); //Mostra quem está no inicio da fila
            //     System.Console.WriteLine($"{fila.Dequeue()} atendido\n"); //Remove o elemento no inicio da fila
            // }
            // System.Console.WriteLine($"Pessoas na fila: {fila.Count()}");

            //--PILHA--
            // Stack<string> pilhaLivros = new Stack<string>();

            //Add elemento
            // pilhaLivros.Push(".NET");
            // pilhaLivros.Push("DDD");
            // pilhaLivros.Push("Código limpo");

            // System.Console.WriteLine($"Livros para a leitura: {pilhaLivros.Count()}");
            // while (pilhaLivros.Count > 0)
            // {
            //     System.Console.WriteLine($"Próximo livro para a leitura: {pilhaLivros.Peek()}"); //Mostra quem está no topo da pilha
            //     System.Console.WriteLine($"{pilhaLivros.Pop()} lido com sucesso!\n"); //Remove o elemento no topo da pilha
            // }
            // System.Console.WriteLine($"Livros para a leitura: {pilhaLivros.Count()}");

            //--DICIONARIO--
            // Dictionary<string, string> estados = new Dictionary<string, string>();

            // estados.Add("SP", "São Paulo");
            // estados.Add("MG", "Minas Gerais");
            // estados.Add("BA", "Bahia");

            // foreach (KeyValuePair<string, string> item in estados)
            // {
            //     System.Console.WriteLine($"Chave: {item.Key}, Valor: {item.Value}");
            // }

            // //Buscar um valor pela chave
            // string valorProcurado = "BAc";
            // System.Console.WriteLine("Valor original:");
            // System.Console.WriteLine(estados[valorProcurado]);

            // //Atualizar valor
            // estados[valorProcurado] = "BA - Teste atualização";
            // System.Console.WriteLine("Valor atualizado:");
            // System.Console.WriteLine(estados[valorProcurado]);

            //Remover valor
            // System.Console.WriteLine($"\nRemovendo valor: {valorProcurado}");

            // estados.Remove(valorProcurado);

            // foreach (var item in estados)
            // {
            //     System.Console.WriteLine($"Chave: {item.Key}, Valor: {item.Value}");
            // }

            //Acessando de maneira seguro para que o programa nao pare caso uma chave nao seja encontrada
            // if (estados.TryGetValue(valorProcurado, out string estadoEncontrado))
            // {
            //     System.Console.WriteLine(estadoEncontrado);
            // }
            // else
            // {
            //     System.Console.WriteLine($"Chave {valorProcurado} não existe no dicionário");
            // }

            //--OPERACOES LINQ--

            //Obter e order valores
            // int[] arrayNumeros = new int[5] { 1, 4, 8, 15, 19 };

            // var numerosParesQuery =
            //     from num in arrayNumeros
            //     where num % 2 == 0
            //     orderby num
            //     select num;

            // var numerosParesMetodos = arrayNumeros.Where(x => x % 2 == 0).OrderBy(x => x).ToList();

            // System.Console.WriteLine("Numeros pares query: " + string.Join(", ", numerosParesQuery));
            // System.Console.WriteLine("Numeros pares metodo: " + string.Join(", ", numerosParesMetodos));

            //Obter valor min, medio e maximo
            int[] arrayNumeros = new int[10] { 100, 1, 4, 0, 8, 15, 19, 19, 4, 100 };

            var minimo = arrayNumeros.Min();
            var maximo = arrayNumeros.Max();
            var medio = arrayNumeros.Average();

            System.Console.WriteLine($"Minimo: {minimo}");
            System.Console.WriteLine($"Maximo: {maximo}");
            System.Console.WriteLine($"Media: {medio}");

            //Soma de elementos e função Distinct
            var soma = arrayNumeros.Sum();
            var arrayUnico = arrayNumeros.Distinct().ToArray();

            System.Console.WriteLine($"Soma: {soma}");
            System.Console.WriteLine($"Array Original: {string.Join(", ", arrayNumeros)}");
            System.Console.WriteLine($"Array Distinto: {string.Join(", ", arrayUnico)}");

        }
    }
}

