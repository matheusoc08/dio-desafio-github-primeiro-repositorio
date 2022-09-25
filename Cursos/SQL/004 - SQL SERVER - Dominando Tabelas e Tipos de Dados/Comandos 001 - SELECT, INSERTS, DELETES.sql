
---- SELECTS

--SELECT
--	*
--FROM DBO.Clientes
--ORDER BY
--	NOME,
--	Sobrenome

--SELECT
--	NOME,
--	SOBRENOME
--FROM Clientes

--SELECT
--	*
--FROM DBO.Clientes
--WHERE AceitaComunicados = 1
--ORDER BY NOME, Sobrenome

--SELECT
--	*
--FROM DBO.Clientes
--WHERE NOME = 'ADAM' AND Sobrenome = 'REYNOLDS'
--ORDER BY NOME, Sobrenome

--SELECT
--	*
--FROM DBO.Clientes
--WHERE NOME like 'G%'
--ORDER BY NOME, Sobrenome

--SELECT
--	*
--FROM DBO.Clientes
--WHERE NOME like '%G%'
--ORDER BY NOME, Sobrenome

---- INSERTS

--INSERT INTO Clientes (Nome, Sobrenome, Email, AceitaComunicados, DataCadastro)
--VALUES ('Matheus', 'Carvalho', 'email@email.com', 1, GETDATE())

--INSERT INTO Clientes VALUES ('Matheus', 'Carvalho', 'email@email.com', 0, GETDATE())

---- UPDATES

--SELECT * FROM Clientes WHERE ID = 4

--UPDATE Clientes
--SET Email = 'emailatualizado@email.com', AceitaComunicados = 1
--WHERE ID = 4

--BEGIN TRAN
----COMMIT
----ROLLBACK

--UPDATE Clientes
--SET Sobrenome = 'Santos'

---- DELETES
--DELETE Clientes 
--WHERE ID = 1001

---- CREATE TABLE

--CREATE TABLE Produtos (
--	Id INT IDENTITY(1, 1) NOT NULL,
--	Nome VARCHAR(255),
--	Cor VARCHAR(50),
--	Preco DECIMAL(13, 2),
--	Tamanho VARCHAR(5),
--	Genero CHAR(1)
--)


