programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Netflix 2 - Abrir Amazon 3 - Abrir HBO GO 4 - Sair")
		inteiro valor = 0
		escreva("\nSua opção: ")
		leia(valor)

		escolha(valor){
			caso 1:
			escreva("\nOk! Abrir Netflix")
			pare

			caso 2:
			escreva("\nOk! Abrir Amazon")
			pare

			caso 3:
			escreva("\nOk! Abrir HBO GO")
			pare

			caso 4:
			escreva("\nOk! Saindo...")
			pare

			caso contrario:
			escreva("\nOpção inválida! Digite 1, 2 ou 3")
			
		}

		/*
		se(menu == 1){
			escreva("\nOk! Abrir Netflix")
		}
		se(menu == 2){
			escreva("\nOk! Abrir Amazon")
		}
		se(menu == 3){
			escreva("\nOk! Abrir HBO GO")
		}
		se(menu == 4){
			escreva("\nOk! Saindo...")
		}
		*/
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */