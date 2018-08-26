package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_34 {
	/*
	 * Faça um programa que leia uma quantidade indeterminada de números
	 * positivos e conte quantos deles estão nos seguintes intervalos: [0-25],
	 * [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando
	 * for lido um número negativo.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, inter_1 = 0, inter_2 = 0, inter_3 = 0, inter_4 = 0;

		do {
			System.out.println("Informe um número:");
			n = entrada.nextInt();

			if (n < 0) {
				System.out.println("Sequencia terminada!");
			} else {
				if (n < 25) {
					inter_1++;
				}

				if ((n > 25) && (n < 50)) {
					inter_2++;
				}

				if ((n > 51) && (n < 75)) {
					inter_3++;
				}

				if ((n > 75) && (n < 100)) {
					inter_4++;
				}
			}

		} while (n > 0);

		System.out.println("Intervalo [0-25] :" + inter_1);
		System.out.println("Intervalo [26-50]:" + inter_2);
		System.out.println("Intervalo [51-75]:" + inter_3);
		System.out.println("Intervalo [76-100]:" + inter_4);

		entrada.close();
	}

}
