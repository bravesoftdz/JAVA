package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_05 {
	/*
	 * 5.Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor.
	 * Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no vetor
	 * impar. Imprima os tr�s vetores.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[21];
		int vetorPAR[] = new int[21];
		int vetorIMPAR[] = new int[21];

		System.out.println("Lista dos numeros!");

		for (int i = 1; i <= 20; i++) {
			System.out.println("Informe o: " + i + " numero:");
			vetor[i] = entrada.nextInt();

			if ((vetor[i] % 2) == 0) {
				vetorPAR[i] = vetor[i];
			} else {
				vetorIMPAR[i] = vetor[i];
			}
		}

		System.out.println("Impressao do vetor completo.");
		for (int i = 1; i <= 20; i++) {
			System.out.println(" " + vetor[i]);
		}

		System.out.println("Impressao do vetor Par.");
		for (int i = 1; i <= 20; i++) {
			System.out.println(" " + vetorPAR[i]);
		}

		System.out.println("Impressao do vetor Impar.");
		for (int i = 1; i <= 20; i++) {
			System.out.println(" " + vetorIMPAR[i]);
		}

		entrada.close();
	}

}
