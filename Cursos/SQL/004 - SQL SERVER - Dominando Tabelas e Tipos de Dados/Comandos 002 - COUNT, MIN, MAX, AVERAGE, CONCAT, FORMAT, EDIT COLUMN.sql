
---- COUNT

SELECT COUNT(*) QuantidadeProdutos
FROM PRODUTOS

SELECT COUNT(*) QuantidadeProdutos
FROM PRODUTOS
WHERE Tamanho = 'M'

---- SUM

SELECT SUM(PRECO) PrecoTotal FROM Produtos

SELECT SUM(PRECO) PrecoTotalProdutosTamanhoM FROM Produtos WHERE Tamanho = 'M'

---- MIN, MAX, AVERAGE

SELECT MAX(PRECO) ProdutoMaisCaro from Produtos

SELECT MAX(PRECO) ProdutoMaisCaroTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT MIN(PRECO) ProdutoMaisBarato from Produtos

SELECT MIN(PRECO) ProdutoMaisBaratoTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT AVG(PRECO) MediaPrecos FROM Produtos

---- CONCATENANDO COLUNAS

SELECT
	Nome + ', Cor: ' + Cor NomeProduto
FROM Produtos

---- UPPER / LOWER

SELECT
	Nome + ', Cor: ' + Cor NomeProdutoCompleto,
	UPPER(Nome) Nome,
	LOWER(Cor) Cor
FROM Produtos

---- ADD / DELETE COLUMN

ALTER TABLE Produtos
ADD DataCadastro DATETIME2

ALTER TABLE Produtos
DROP COLUMN DataCadastro 

UPDATE Produtos
SET DataCadastro = GETDATE()

SELECT * FROM Produtos

---- FORMAT DATETIME

SELECT
	Nome + ', Cor: ' + Cor NomeProdutoCompleto,
	UPPER(Nome) Nome,
	LOWER(Cor) Cor,
	FORMAT(DataCadastro, 'dd/MM/yyy HH:mm')
FROM Produtos

---- GROUP BY

SELECT
	Tamanho,
	COUNT(*) Quantidade
FROM Produtos
WHERE TAMANHO <> ''
GROUP BY Tamanho
ORDER BY Quantidade DESC

