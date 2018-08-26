package Aula_Dois_Lista_Um;

import java.util.Scanner;

public class Exercicio_Quatro {

	/**
	 * Faça um Programa que peça para entrar com um ano com 4 dígitos e
	 * determine se o mesmo é ou não bissexto.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total_dias = 0;
		// System.out.println("Informe o ano:");
		// ano=entrada.nextInt();
		System.out.println("Informe o total de dias:");
		total_dias = entrada.nextInt();

		if ((total_dias / 4) == 91) {
			System.out.println("Ano bisexto!");
		} else {
			System.out.println("Não é ano bisexto!");
		}

	}

}
