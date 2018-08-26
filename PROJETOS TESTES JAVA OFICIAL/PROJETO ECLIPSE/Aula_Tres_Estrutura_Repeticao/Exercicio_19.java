package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_19 {

	/**
	 * 19. Faça um programa que mostre todos os primos entre 1 e N sendo N um
	 * número inteiro fornecido pelo usuário. O programa deverá mostrar também o
	 * número de divisões que ele executou para encontrar os números primos.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int divisoes = 0, conta_primo = 0, primo_atual = 0, i = 0;
		;

		System.out.println("Informe a quantidade de primos a serem gerados:");
		conta_primo = entrada.nextInt();

		boolean primo = true;

		primo_atual = 3;

		while (i < conta_primo) {

			primo = true;
			divisoes = 0;

			for (int j = 2; j < primo_atual; j++) {

				if ((primo_atual % j) == 0) {
					primo = false;
				}
				divisoes++;
			}

			if (primo == true) {
				System.out.println("O Numero: " + primo_atual
						+ " é primo e foi usado: " + divisoes + " divisoes.");
				i++;
			}
			primo_atual++;
		}
	}

}
