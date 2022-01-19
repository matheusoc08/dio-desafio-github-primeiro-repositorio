--BEGIN TRAN
--COMMIT
--ROLLBACK

--ALTER TABLE STATUS_PEDIDO_ITEM ALTER COLUMN DESCRICAO VARCHAR(50)
--INSERT INTO STATUS_PEDIDO_ITEM VALUES (1, 'Separacao solicitada'), (2, 'Em separacao'), (3, 'Embalado')
SELECT * FROM STATUS_PEDIDO_ITEM

SELECT * FROM PEDIDO_ITEM
SELECT * FROM PEDIDO_ITEM_LOG

--INSERT INTO PEDIDO_ITEM_LOG
--	SELECT CODIGO_PEDIDO, CODIGO_PRODUTO, 1 ,GETDATE()
--	FROM PEDIDO_ITEM

SELECT *
FROM CLIENTES CLI
INNER JOIN PEDIDO PED ON CLI.CODIGO = PED.CODIGO_CLIENTE

SELECT *
FROM CLIENTES CLI
LEFT JOIN PEDIDO PED ON CLI.CODIGO = PED.CODIGO_CLIENTE

SELECT *
FROM PEDIDO PED
RIGHT JOIN CLIENTES CLI ON CLI.CODIGO = PED.CODIGO_CLIENTE

-----

SELECT *
FROM CLIENTES CLI
LEFT JOIN PEDIDO PED ON CLI.CODIGO = PED.CODIGO_CLIENTE and PED.TOTAL_PEDIDO > 10

SELECT
	CLI.NOME CLI_NOME,
	PED.TOTAL_PEDIDO,
	CASE
		WHEN CLI.TIPO_PESSOA = 'F' THEN 'FISICA'
		ELSE 'JURIDICA'
	END TIPO_PESSOA
FROM CLIENTES CLI
LEFT JOIN PEDIDO PED ON CLI.CODIGO = PED.CODIGO_CLIENTE

--BETWEEN
SELECT *
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM
WHERE PRECO BETWEEN 1 AND 2

--SOMA
SELECT SUM(PRECO * QUANTIDADE)
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM

--MEDIA
SELECT AVG(PRECO)
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM

--COUNT
SELECT COUNT(*)
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM

SELECT
	CLI.CODIGO,
	CLI.NOME,
	COUNT(PED.CODIGO)
FROM CLIENTES CLI
LEFT JOIN PEDIDO PED ON PED.CODIGO_CLIENTE = CLI.CODIGO
GROUP BY CLI.CODIGO, CLI.NOME

--AGREGACAO/GROUP BY
SELECT PROD.CODIGO,
	PROD.DESCRICAO,
	SUM(PED_IT.PRECO * PED_IT.QUANTIDADE)
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM
INNER JOIN PRODUTOS PROD ON PROD.CODIGO = PED_LOG.CODIGO_PRODUTO
GROUP BY PROD.CODIGO, PROD.DESCRICAO

--ORDER BY
SELECT PROD.CODIGO,
	PROD.DESCRICAO,
	SUM(PED_IT.PRECO * PED_IT.QUANTIDADE) SOMATORIA
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM
INNER JOIN PRODUTOS PROD ON PROD.CODIGO = PED_LOG.CODIGO_PRODUTO
GROUP BY PROD.CODIGO, PROD.DESCRICAO
--ORDER BY 1
ORDER BY SOMATORIA DESC

--HAVING
SELECT PROD.CODIGO,
	PROD.DESCRICAO,
	SUM(PED_IT.PRECO * PED_IT.QUANTIDADE) SOMATORIA
FROM PEDIDO_ITEM PED_IT
INNER JOIN PEDIDO_ITEM_LOG PED_LOG ON
	PED_IT.CODIGO_PEDIDO = PED_LOG.CODIGO_PEDIDO AND 
	PED_IT.CODIGO_PRODUTO = PED_LOG.CODIGO_PRODUTO
INNER JOIN STATUS_PEDIDO_ITEM SPI ON SPI.CODIGO = PED_LOG.CODIGO_STATUS_PEDIDO_ITEM
INNER JOIN PRODUTOS PROD ON PROD.CODIGO = PED_LOG.CODIGO_PRODUTO
GROUP BY PROD.CODIGO, PROD.DESCRICAO
HAVING SUM(PED_IT.PRECO * PED_IT.QUANTIDADE) > 10

--------
SELECT *
FROM CLIENTES CLI
WHERE CLI.CODIGO NOT IN (7)

SELECT *
FROM CLIENTES CLI
WHERE CLI.CODIGO NOT IN (SELECT CODIGO_CLIENTE FROM PEDIDO)

SELECT *
FROM CLIENTES CLI
LEFT JOIN PEDIDO PED ON PED.CODIGO_CLIENTE = CLI.CODIGO
WHERE PED.CODIGO_CLIENTE IS NULL

---OUTRA FORMA DE FAZER JOIN
SELECT *
FROM CLIENTES CLI, PEDIDO PED, PEDIDO_ITEM PED_IT
WHERE CLI.CODIGO = PED.CODIGO_CLIENTE AND
	PED.CODIGO = PED_IT.CODIGO_PEDIDO

