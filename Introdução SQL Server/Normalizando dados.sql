SELECT *
FROM CLIENTES

--ALTER TABLE CLIENTES ADD CONSTRAINT PK_CLIENTE PRIMARY KEY (CODIGO)

--INSERT INTO CLIENTES VALUES (1, 'JULIO', 'J', GETDATE())

SELECT * FROM PEDIDO_ITEM
SELECT * FROM PEDIDO
SELECT * FROM PRODUTOS

--ALTER TABLE PEDIDO_ITEM ADD CONSTRAINT FK_PEDIDO FOREIGN KEY (CODIGO_PEDIDO) REFERENCES PEDIDO (CODIGO)
--ALTER TABLE PEDIDO_ITEM ADD CONSTRAINT FK_PRODUTO FOREIGN KEY (CODIGO_PRODUTO) REFERENCES PRODUTOS (CODIGO)

--ALTER TABLE PEDIDO ADD CODIGO_STATUS INT
--UPDATE PEDIDO SET CODIGO_STATUS  = 1

SELECT * FROM CLIENTES



