package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_01 {

	/**
	 * 1. Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
	 * mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio
	 * informe um valor v�lido.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota = 0;// Variaveis sempre devem ser inicializadas

		do {
			System.out.println("Informe a nota:");
			nota = entrada.nextDouble();
			if ((nota < 0) || (nota > 10)) {
				System.out
						.println("Nota inv�lida!Informe uma nota maior ou igual a zero e menor ou igual a 10");
			}
		} while ((nota < 0) || (nota > 10));

		System.out.println("Fim da digita��o!");

	}

}
