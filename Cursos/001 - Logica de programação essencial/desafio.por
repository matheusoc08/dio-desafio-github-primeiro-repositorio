programa
{
	
	funcao inicio()
	{
		inteiro linha = 0 , coluna = 0
		cadeia dados[3][3]

		faca{
			coluna = 0	
				
			escreva("\nCliente " + (linha + 1))
			escreva("\nDigite o nome: ")
			leia(dados[linha][coluna])
			coluna++
	
			escreva("Digite o estado: ")
			leia(dados[linha][coluna])
			coluna++
	
			escreva("Digite o telefone: ")
			leia(dados[linha][coluna])
			coluna++				

			linha++
		}enquanto(linha <= 2)

		linha = 0		
		escreva("\n")
		faca{
			coluna = 0
			
			escreva(dados[linha][coluna] + " ")
			coluna++

			escreva(dados[linha][coluna] + " ")
			coluna++

			escreva(dados[linha][coluna] + " ")
			coluna++

			escreva("\n")
			linha++
		}enquanto(linha <= 2)


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 657; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */