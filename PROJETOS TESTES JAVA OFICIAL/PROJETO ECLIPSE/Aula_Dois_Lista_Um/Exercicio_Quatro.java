package Aula_Dois_Lista_Um;

import java.util.Scanner;

public class Exercicio_Quatro {

	/**
	 * Fa�a um Programa que pe�a para entrar com um ano com 4 d�gitos e
	 * determine se o mesmo � ou n�o bissexto.
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
			System.out.println("N�o � ano bisexto!");
		}

	}

}
