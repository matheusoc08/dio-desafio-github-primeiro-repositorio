--CREATE DATABASE PROJETO_SERIE_DIO


--CREATE TABLE SERIES(
--	ID INT NOT NULL PRIMARY KEY,
--	ID_GENERO INT NOT NULL,
--	TITULO VARCHAR(100) NOT NULL,
--	DESCRICAO VARCHAR(300) NOT NULL,
--	ANO	INT NOT NULL,
--	EXCLUIDO BIT NOT NULL DEFAULT 0,
--)

--CREATE TABLE GENEROS(
--	ID INT NOT NULL PRIMARY KEY,
--	NOME VARCHAR(20) NOT NULL
--)

--ALTER TABLE SERIES ADD FOREIGN KEY (ID_GENERO) REFERENCES GENEROS (ID)


--INSERT INTO GENEROS VALUES
--(1, 'Acao'),
--(2, 'Aventura'),
--(3, 'Comedia'),
--(4, 'Documentario'),
--(5, 'Drama'),
--(6, 'Espionagem'),
--(7, 'Faraoeste'),
--(8, 'Fantasia'),
--(9, 'Ficcao Cientifica'),
--(10, 'Musical'),
--(11, 'Romance'),
--(12, 'Suspense'),
--(13, 'Terror')
