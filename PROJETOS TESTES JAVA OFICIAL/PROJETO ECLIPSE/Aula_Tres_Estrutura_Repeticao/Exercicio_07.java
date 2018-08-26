package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_07 {

	/**
	 * 7. Faça um programa que receba dois números inteiros e gere os números
	 * inteiros que estão no intervalo compreendido por eles.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, primeiro = 0, segundo = 0;

		do {
			System.out.println("Informe o primeiro numero:");
			n1 = entrada.nextInt();

			System.out.println("Informe o segundo numero:");
			n2 = entrada.nextInt();

			if (n1 == n2) {
				System.out.println("Informe números diferentes!");
			}

		} while (n1 == n2);

		if (n1 > n2) {
			primeiro = n2;
			segundo = n1;
		} else {
			primeiro = n1;
			segundo = n2;
		}

		for (int i = primeiro; i < segundo; i++) {
			primeiro = primeiro + 1;
			System.out.println(primeiro);
		}
		System.out.println("Fim do algoritmo!");

	}

}
