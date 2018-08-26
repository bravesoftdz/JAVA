package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_17 {

	/**
	 * 17. Faça um programa que peça um número inteiro e determine se ele é ou
	 * não um número primo. Um número primo é aquele que é divisível somente por
	 * ele mesmo e por 1.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		boolean primo = false;

		System.out.println("Informe o numero maior que 2:");
		n = entrada.nextInt();

		primo = true;

		for (int i = 2; i < n; i++) {

			if ((n % i) == 0) {
				primo = false;
			}
		}

		if (primo == true) {
			System.out.println("O numero " + n + " é primo!");
		} else {
			System.out.println("O numero " + n + " não é primo!");
		}

	}

}
