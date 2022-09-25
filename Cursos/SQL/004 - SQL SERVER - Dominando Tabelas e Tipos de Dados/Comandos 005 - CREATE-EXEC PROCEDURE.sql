USE ExemploDB

SELECT * FROM Produtos ORDER BY Id DESC

INSERT INTO Produtos (Nome, Cor, Preco, Tamanho, Genero)
VALUES ('NOVO PRODUTO', 'Colorido', 10, 'G', 'U')

--CREATE PROCEDURE InserirNovoProduto
--@Nome	varchar(255),
--@Cor	varchar(50),
--@Preco	decimal,
--@Tamanho	varchar(5),
--@Genero	char(1)
--AS
--INSERT INTO Produtos (Nome, Cor, Preco, Tamanho, Genero)
--VALUES (@Nome, @Cor, @Preco, @Tamanho, @Genero)

EXECUTE InserirNovoProduto
'NOVO PRODUTO PROCEDURE',
'COLORIDO',
10,
'G',
'U'

--CREATE PROCEDURE ObterProdutosPorTamanho
--@TamanhoProduto VARCHAR(5)
--AS
--SELECT * FROM Produtos WHERE Tamanho = @TamanhoProduto

EXEC ObterProdutosPorTamanho 'M'

--CREATE PROCEDURE ObterTodosProdutos
--AS
--SELECT * FROM Produtos

EXEC ObterTodosProdutos
