package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_01 {

	/**
	 * 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vetor[] = new int[6];

		// insercao dos dados
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + " elemento.");

			vetor[i] = entrada.nextInt();
		}

		// Mostra dos dados
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " elemento digitado foi-> " + vetor[i]);
		}

	}

}
