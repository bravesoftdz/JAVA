package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_38 {

	/**
	 * Faça um programa que peça um numero inteiro positivo e em seguida mostre
	 * este numero invertido. Exemplo: 12376489 => 98467321
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, tam = 0;
		String aux_numero = "";

		System.out.println("Informe o numero:");
		n = entrada.nextInt();

		// Conversão da Variavel para String
		aux_numero = "" + n;
		System.out.println("Variável convertida em String=>" + aux_numero);

		// Inversão da variável
		tam = aux_numero.length();
		System.out.println("Tamanho da variavel->" + tam);

		System.out.println("Variável invertida:");

		for (int i = aux_numero.length() - 1; i >= 0; i--) {
			System.out.print(" " + aux_numero.charAt(i));
		}

	}

}
