CREATE TABLE NAVES(
	ID_NAVE INT NOT NULL,
	NOME VARCHAR(100) NOT NULL,
	MODELO VARCHAR(150) NOT NULL,
	PASSAGEIROS INT NOT NULL,
	CARGA FLOAT NOT NULL,
	CLASSE VARCHAR(100) NOT NULL,
)
GO
ALTER TABLE NAVES ADD CONSTRAINT PK_NAVES PRIMARY KEY (ID_NAVE);

CREATE TABLE PILOTOS(
	ID_PILOTO INT NOT NULL,
	NOME VARCHAR(300) NOT NULL,
	ANO_NASCIMENTO VARCHAR(10) NOT NULL,
	ID_PLANETA INT NOT NULL,
)
GO
ALTER TABLE PILOTOS ADD CONSTRAINT PK_PILOTOS PRIMARY KEY (ID_PILOTO);
GO
ALTER TABLE PILOTOS ADD CONSTRAINT FK_PILOTOS_PLANETAS FOREIGN KEY (ID_PLANETA) REFERENCES PLANETAS (ID_PLANETA);

