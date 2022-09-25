
--CREATE TABLE Enderecos (
--	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
--	IdCliente int NULL,
--	Rua VARCHAR(255) NULL,
--	Bairro VARCHAR(255) NULL,
--	Cidade VARCHAR(255) NULL,
--	Estado CHAR(2) NULL,

--	CONSTRAINT FK_Endereco_Clientes FOREIGN KEY(IdCliente) REFERENCES Clientes(Id)
--)

INSERT INTO Enderecos VALUES (4, 'Rua Teste', 'Bairro Teste', 'Cidade Teste', 'SP')

SELECT * FROM Enderecos

--DROP TABLE Enderecos

---- UNIR TABELAS

SELECT
	*
FROM Clientes
INNER JOIN Enderecos ON Enderecos.IdCliente = Clientes.Id
WHERE Clientes.ID = 4

SELECT
	C.*
FROM Clientes C
INNER JOIN Enderecos E ON E.IdCliente = C.Id
WHERE C.ID = 4


SELECT
	C.Nome,
	C.Sobrenome,
	C.Email,
	C.AceitaComunicados,
	E.Id,
	E.Rua,
	E.Bairro,
	E.Cidade,
	E.Estado
FROM Clientes C
INNER JOIN Enderecos E ON E.IdCliente = C.Id
WHERE C.ID = 4
