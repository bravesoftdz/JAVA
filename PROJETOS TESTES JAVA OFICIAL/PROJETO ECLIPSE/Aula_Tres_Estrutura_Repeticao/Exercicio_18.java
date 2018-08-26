package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_18 {

	/**
	 * 17. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou
	 * n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel somente por
	 * ele mesmo e por 1.
	 * 
	 * 18. Altere o programa de c�lculo dos n�meros primos, informando, caso o
	 * n�mero n�o seja primo, por quais n�mero ele � divis�vel.
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
			System.out.println("O numero " + n + " � primo!");
		} else {
			System.out.println("O numero " + n + " n�o � primo!");
			System.out.println("Lista dos divisores do numero.");

			for (int i = 2; i < n; i++) {
				if ((n % i) == 0) {
					System.out.println("O numero: " + n + " � divisivel por:"
							+ i + " que � igual a:" + (n / i));
				}
			}
		}

	}
}