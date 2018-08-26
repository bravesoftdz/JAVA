package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_07 {
	/*
	 * 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a
	 * soma, a multiplicação e os números.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[6];
		int soma = 0, mult = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + " numero:");
			vetor[i] = entrada.nextInt();

			soma = soma + vetor[i];
			if (i == 1) {
				mult = vetor[i];
			} else {
				mult = mult * vetor[i];
			}

			System.out.println("Resultado :" + mult);

		}

		System.out.println("Lista dos numeros:");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " numero:" + vetor[i]);
		}

		System.out.println("Soma dos numeros:" + soma);
		System.out.println("Multiplicacao dos numeros:" + mult);

		entrada.close();
	}

}
