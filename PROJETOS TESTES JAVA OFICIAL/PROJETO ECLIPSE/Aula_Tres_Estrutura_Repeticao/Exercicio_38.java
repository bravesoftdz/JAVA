package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_38 {

	/**
	 * Fa�a um programa que pe�a um numero inteiro positivo e em seguida mostre
	 * este numero invertido. Exemplo: 12376489 => 98467321
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, tam = 0;
		String aux_numero = "";

		System.out.println("Informe o numero:");
		n = entrada.nextInt();

		// Convers�o da Variavel para String
		aux_numero = "" + n;
		System.out.println("Vari�vel convertida em String=>" + aux_numero);

		// Invers�o da vari�vel
		tam = aux_numero.length();
		System.out.println("Tamanho da variavel->" + tam);

		System.out.println("Vari�vel invertida:");

		for (int i = aux_numero.length() - 1; i >= 0; i--) {
			System.out.print(" " + aux_numero.charAt(i));
		}

	}

}
