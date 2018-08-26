package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_03 {

	/**
	 * 1. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double media = 0, soma = 0;
		double vetor[] = new double[5];

		for (int i = 1; i <= 4; i++) {
			System.out.println("Informe a" + i + " nota.");
			vetor[i] = entrada.nextInt();
			soma = soma + vetor[i];
		}
		media = soma / 4;
		System.out.println("Notas digitadas:");

		for (int i = 1; i <= 4; i++) {
			System.out.println("Nota " + i + " foi de ->" + vetor[i]);
		}

		System.out.println("Média das notas digitadas é de :" + media);
	}

}
