package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_14 {

	/**
	 * 14. Faça um programa que mostre os n termos da Série a seguir: S = 1/1 +
	 * 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double termos = 0, contador = 0;

		System.out
				.println("Informe quantos termos para a Serie S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m");
		termos = entrada.nextInt();

		double i = 1, soma = 0;
		contador = 1;

		System.out.println("S = " + i + "/" + i);
		// S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9
		for (i = 2; i <= termos; i++) {

			contador = contador + 2;
			System.out.println("S = " + i + "/" + contador);

			soma = soma + (i / (i + 2));
		}

		System.out.println("Total da Serie= " + soma);

	}

}
