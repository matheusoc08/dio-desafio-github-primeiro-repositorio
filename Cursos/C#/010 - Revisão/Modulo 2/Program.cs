using Modulo_2.Models;
using System.Globalization;
using Newtonsoft.Json;

/////////// METODOS EXTENSAO  /////////////////////////////////////////

int numero = 20;
bool par = false;
// par = numero % 2 == 0;
par = numero.EhPar();

string mensagem = $"O numero {numero} é {(par ? "par" : "impar")} ";
Console.WriteLine(mensagem);

/////////// CLASSE GENERICA  /////////////////////////////////////////

// MeuArray<int> arrayInteiro = new MeuArray<int>();

// arrayInteiro.AdicionarElementoArray(30);

// Console.WriteLine(arrayInteiro[0]);

// MeuArray<string> arrayString = new MeuArray<string>();

// arrayString.AdicionarElementoArray("Teste");

// Console.WriteLine(arrayString[0]);

/////////// VARIAVEL DINAMICA /////////////////////////////////////////

// dynamic variavelDinamica = "4";

// Console.WriteLine($"Tipo da variavel: {variavelDinamica.GetType()}, Valor: {variavelDinamica}");

// variavelDinamica = 10.0;

// Console.WriteLine($"Tipo da variavel: {variavelDinamica.GetType()}, Valor: {variavelDinamica}");

// variavelDinamica = false;

// Console.WriteLine($"Tipo da variavel: {variavelDinamica.GetType()}, Valor: {variavelDinamica}");

/////////// TIPOS ANONIMOS EM COLECAO /////////////////////////////////////////

// string conteudoArquivo = File.ReadAllText("Arquivos/vendas.json");

// List<VendasRecebidas> listaVendas = JsonConvert.DeserializeObject<List<VendasRecebidas>>(conteudoArquivo);

// var listaAnonima = listaVendas.Select(x => new { x.Produto, x.Preco });

// foreach (var venda in listaAnonima)
// {
//     Console.WriteLine($"Produto: {venda.Produto}, Preco: {venda.Preco}");
// }

/////////// TIPO ANONIMO /////////////////////////////////////////

// var tipoAnonimo = new { Nome = "Matheus", Sobrenome = "Carvalho", Altura = 1.80M };

// Console.WriteLine("Nome: " + tipoAnonimo.Nome);
// Console.WriteLine("Sobrenome: " + tipoAnonimo.Sobrenome);
// Console.WriteLine("Altura: " + tipoAnonimo.Altura);

/////////// NULLABLE TYPES /////////////////////////////////////////

// bool? desejaReceberEmail = null;

// if (desejaReceberEmail.HasValue && desejaReceberEmail.Value)
// {
//     Console.WriteLine("O usuario optou por receber email");
// }
// else
// {
//     Console.WriteLine("O usuario nao respondeu ou optou por nao receber");
// }


/////////// DESERIALIZACAO /////////////////////////////////////////

// string conteudoArquivo = File.ReadAllText("Arquivos/vendas.json");

// List<VendasRecebidas> listaVenda = JsonConvert.DeserializeObject<List<VendasRecebidas>>(conteudoArquivo);

// foreach (VendasRecebidas venda in listaVenda)
// {
//     Console.WriteLine($"Id: {venda.Id}, Produto: {venda.Produto}" +
//                         $", Preco: {venda.Preco}, Data: {venda.DataVenda.ToString("dd/MM/yyyy HH:mm")}" +
//                         $"{(venda.Desconto.HasValue ? $", Desconto de: {venda.Desconto}" : "")}");
// }

/////////// SERIALIZACAO /////////////////////////////////////////


// List<Vendas> listaVendas = new List<Vendas>();
// DateTime dataAtual = DateTime.Now;

// Vendas v1 = new Vendas(1, "Material de escritório", 25.00M, dataAtual);
// Vendas v2 = new Vendas(2, "Licença de Software", 110.00M, dataAtual);
// Vendas v3 = new Vendas(3, "Mousepad", 30.00M, dataAtual);

// listaVendas.Add(v1);
// listaVendas.Add(v2);
// listaVendas.Add(v3);

// // string serializado = JsonConvert.SerializeObject(v1, Formatting.Indented);
// string serializado = JsonConvert.SerializeObject(listaVendas, Formatting.Indented);

// // Cria um arquivo, no caso .json
// File.WriteAllText("Arquivos/vendas.json", serializado);

// Console.WriteLine(serializado);


/////////// IF TERNARIO /////////////////////////////////////////

// int numero = 2012;
// bool ehPar = false;

// if (numero % 2 == 0)
// {
//     Console.WriteLine($"O numero {numero} é par");
// }
// else
// {
//     Console.WriteLine($"O numero {numero} é impar");
// }

// ehPar = numero % 2 == 0;
// Console.WriteLine($"O numero {numero} é " + (ehPar ? "par" : "impar"));

/////////// Metodo desconstrutor /////////////////////////////////////////

// Pessoa p1 = new Pessoa("Matheus", "Carvalho");

// (string nome, string sobrenome) = p1;

// Console.WriteLine($"{nome} {sobrenome}");


/////////// Metodo com retorno de tupla /////////////////////////////////////////

// LeituraArquivo arquivo = new LeituraArquivo();

// // var (sucesso, linhasArquivo, quantidadeLinhas) = arquivo.LerArquivo("Arquivos/arquivoLeitura.txt");

// //Colocando o _ vai descartar um dos retornos do metodo de tupla
// var (sucesso, linhasArquivo, _) = arquivo.LerArquivo("Arquivos/arquivoLeitura.txt");

// if (sucesso)
// {

//     // Console.WriteLine($"Quantidade linhas do arquivo: {quantidadeLinhas}");
//     foreach (string linha in linhasArquivo)
//     {
//         Console.WriteLine(linha);
//     }
// }
// else
// {
//     Console.WriteLine("Não foi possivel ler o arquivo.");
// }


/////////// TUPLA /////////////////////////////////////////

// (int, string, string, decimal) tupla = (1, "Matheus", "Carvalho", 10.5M);
// (int id, string nome, string sobrenome, decimal altura) novaTupla = (2, "Murilo", "Carvalho", 4.5M);
// ValueTuple<int, string, string, decimal> outraTupla = (3, "Lucas", "Carvalho", 15.5M);
// var maisUmaTupla = Tuple.Create(4, "Nicolas", "Carvalho", 2.5M);

// Console.WriteLine($"ID: {tupla.Item1}");
// Console.WriteLine($"Nome: {tupla.Item2}");
// Console.WriteLine($"Sobrenome: {tupla.Item3}");
// Console.WriteLine($"Altura: {tupla.Item4}");

// Console.WriteLine($"ID: {novaTupla.id}");
// Console.WriteLine($"Nome: {novaTupla.nome}");
// Console.WriteLine($"Sobrenome: {novaTupla.sobrenome}");
// Console.WriteLine($"Altura: {novaTupla.altura}");



/////////// DICTIONARY /////////////////////////////////////////

// Dictionary<string, string> estados = new Dictionary<string, string>();

// estados.Add("SP", "São Paulo");
// estados.Add("BA", "Bahia");
// estados.Add("MG", "Minas Gerais");
// estados.Add("RJ", "Rio de Janeiro");

// foreach (KeyValuePair<string, string> item in estados)
// {
//     Console.WriteLine($"Chave: {item.Key}, Valor: {item.Value}");
// }

// estados.Remove("BA");
// estados["SP"] = "São Paulo - Valor alterado";

// Console.WriteLine("------------------------");

// foreach (KeyValuePair<string, string> item in estados)
// {
//     Console.WriteLine($"Chave: {item.Key}, Valor: {item.Value}");
// }

// string chave = "BA";
// Console.WriteLine($"Verificando o elemento: {chave} ");

// if (estados.ContainsKey(chave))
// {
//     Console.WriteLine($"Valor existente: {chave}");
// }
// else
// {
//     Console.WriteLine($"Valor inexistente: {chave}. Habilitado para inserção.");
// }

// Console.WriteLine(estados["MG"]);

/////////// PILHA (LIFO) /////////////////////////////////////////

// Stack<int> pilha = new Stack<int>();

// pilha.Push(1);
// pilha.Push(6);
// pilha.Push(8);
// pilha.Push(2);
// pilha.Push(5);

// foreach (int item in pilha)
// {
//     Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento: {pilha.Pop()}");

// foreach (int item in pilha)
// {
//     Console.WriteLine(item);
// }

/////////// FILA (FIFO) /////////////////////////////////////////

// Queue<int> fila = new Queue<int>();

// fila.Enqueue(2);
// fila.Enqueue(4);
// fila.Enqueue(6);
// fila.Enqueue(7);
// fila.Enqueue(4);

// foreach (int item in fila)
// {
//     Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento: {fila.Dequeue()}");

// foreach (int item in fila)
// {
//     Console.WriteLine(item);
// }

/////////// EXCEPTION /////////////////////////////////////////

// new ExemploExcecao().Metodo1();

/////////// TRY CATCH FINALLY /////////////////////////////////////////

// try
// {
//     string[] linhas = File.ReadAllLines("Arquivoss/arquivoLeitura.txt");

//     foreach (string linha in linhas)
//     {
//         Console.WriteLine(linha);
//     }
// }
// catch (FileNotFoundException e)
// {
//     Console.WriteLine($"Ocorreu uma exceção na leitura do arquivo. Arquivo não encontrado. {e.Message}");
// }
// catch (DirectoryNotFoundException e)
// {
//     Console.WriteLine($"Ocorreu uma exceção na leitura do arquivo. Caminho da posta não encontrado. {e.Message}");
// }
// catch (Exception e)
// {
//     Console.WriteLine($"Ocorreu uma exceção generica. {e.Message}");
// }
// finally
// {
//     Console.WriteLine("Yaaay!");
// }


/////////// DATE FORMAT /////////////////////////////////////////

// DateTime data = DateTime.Now;
// Console.WriteLine(data);
// Console.WriteLine(data.ToString("dd/MM/yyyy"));
// Console.WriteLine(data.ToString("dd/MM/yyyy HH:mm"));
// Console.WriteLine(data.ToString("dd-MM-yyyy hh:mm"));

// Console.WriteLine(data.ToShortTimeString());
// Console.WriteLine(data.ToShortDateString());

// DateTime dataManual = DateTime.Parse("17/02/2000 18:00");
// Console.WriteLine(dataManual);

// string dataString = "2022-04-17 14:32";
// DateTime.TryParseExact(dataString, "yyyy-MM-dd HH:mm", CultureInfo.InvariantCulture, DateTimeStyles.None, out DateTime dataA);

// string dataParse = "17/02/2000 18:00";
// bool sucesso = DateTime.TryParseExact(dataParse, "yyyy-MM-dd HH:mm", CultureInfo.InvariantCulture, DateTimeStyles.None, out DateTime dataB);
// if (sucesso)
// {
//     Console.WriteLine($"Conversão com sucesso! Data: {dataB}");
// }
// else
// {
//     Console.WriteLine($"{dataParse} - não é uma data valida!");
// }

//////////////// NUMBER FORMAT ///////////////////////////////////////

// double porcentagem = .3221;
// Console.WriteLine(porcentagem.ToString("p"));

// int numero = 123456;
// Console.WriteLine(numero.ToString("##-##-##"));

// CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("en-US");

// decimal valorUnitario = 1082.40M;
// Console.WriteLine($"{valorUnitario:C}");
// Console.WriteLine(valorUnitario.ToString("C", CultureInfo.CreateSpecificCulture("jp-jp")));
// Console.WriteLine(valorUnitario.ToString("C8"));


////////////////////////////////////////////////////////////////////////////////

// Pessoa p1 = new Pessoa("Matheus", "Carvalho");

// Pessoa p2 = new Pessoa(nome: "Laryssa", sobrenome: "Pires");

// Curso cursoIngles = new Curso();
// cursoIngles.Nome = "Ingles";
// cursoIngles.Alunos = new List<Pessoa>();

// cursoIngles.AdicionarAluno(p1);
// cursoIngles.AdicionarAluno(p2);
// cursoIngles.ListarAlunos();

// Pessoa p1 = new Pessoa();
// p1.Nome = "Matheus";
// p1.Sobrenome = "Carvalho";
// p1.Idade = 25;
// p1.Apresentar();