package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_18 {

	/**
	 * 17. Faça um programa que peça um número inteiro e determine se ele é ou
	 * não um número primo. Um número primo é aquele que é divisível somente por
	 * ele mesmo e por 1.
	 * 
	 * 18. Altere o programa de cálculo dos números primos, informando, caso o
	 * número não seja primo, por quais número ele é divisível.
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
			System.out.println("Lista dos divisores do numero.");

			for (int i = 2; i < n; i++) {
				if ((n % i) == 0) {
					System.out.println("O numero: " + n + " é divisivel por:"
							+ i + " que é igual a:" + (n / i));
				}
			}
		}

	}
}