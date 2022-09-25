USE ExemploDB

SELECT *
FROM Produtos

---- UNIQUE - Impede a duplicação de valor na coluna

ALTER TABLE Produtos
ADD UNIQUE(Nome)

---- CONSTRAINT CHECK - Impedir que a coluna tenha valores fora de um padrão

-- CONSTRAINT SEM NOME
ALTER TABLE Produtos
ADD CHECK (Genero = 'U' OR Genero = 'M' OR Genero = 'F')

-- CONSTRAINT COM NOME
ALTER TABLE Produtos
ADD CONSTRAINT CHK_ColunaGenero CHECK (Genero = 'U' OR Genero = 'M' OR Genero = 'F')

INSERT INTO Produtos (Nome, Cor, Preco, Tamanho, Genero, DataCadastro) 
VALUES ('Produto teste', 'Preto', 'M', 'Z', GETDATE())

---- CONSTRAINT DEFAULT - Insere um valor padrão na coluna, caso o insert entre vazio

ALTER TABLE PRODUTOS
ADD DEFAULT GETDATE() FOR DataCadastro

INSERT INTO Produtos (Nome, Cor, Preco, Tamanho, Genero, DataCadastro) 
VALUES ('Produto teste', 'Preto', 'F', 'Z')

---- APAGAR CONSTRAINT

ALTER TABLE Produtos
DROP CONSTRAINT UQ__Produtos__7D8FE3B2C3E74738