package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_02 {

	/**
	 * 1. Faça um Programa que leia um vetor de 10 números reais e mostre-os na
	 * ordem inversa a ordem lida.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[11];

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o " + i + " numero.");
			vetor[i] = entrada.nextInt();
		}
		// Saida do Vetor Inverso
		System.out.println("Vetor Inverso");
		for (int i = 10; i > 0; i--) {
			System.out.print(" " + vetor[i]);
		}
	}

}
