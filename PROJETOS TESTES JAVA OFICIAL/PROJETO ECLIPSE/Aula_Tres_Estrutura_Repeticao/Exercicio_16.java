package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_16 {

	/**
	 * 16. Faça um programa que, dado um conjunto de N números, determine o
	 * menor valor, o maior valor e a soma dos valores.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int termos = 0, n = 0, maior = 0, menor = 0, soma = 0;

		System.out.println("Informe a quantidade de nuemros a ser digitados:");
		termos = entrada.nextInt();

		for (int i = 0; i < termos; i++) {
			System.out.println("Informe o :" + i + "numero.");
			n = entrada.nextInt();

			if (i == 0) {
				menor = n;
				maior = n;
			}
			if (n < menor) {
				menor = n;
			}
			if (n > maior) {
				maior = n;
			}

			soma = soma + n;
		}

		System.out.println("Menor Numero:" + menor);

		System.out.println("Maior Numero:" + maior);

		System.out.println("Soma dos numeros: " + soma);
	}

}
