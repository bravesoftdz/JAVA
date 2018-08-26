package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_11 {

	/**
	 * 11. Faça um programa que peça 10 números inteiros, calcule e mostre a
	 * quantidade de números pares e a quantidade de números impares.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, contapar = 0, contaimpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " numero: ");
			n = entrada.nextInt();

			if ((n % 2) == 0) {
				contapar++;
			} else {
				contaimpar++;
			}
		}
		System.out.println("Quantidade de pares:" + contapar);
		System.out.println("Quantidade de pares:" + contaimpar);

	}

}
