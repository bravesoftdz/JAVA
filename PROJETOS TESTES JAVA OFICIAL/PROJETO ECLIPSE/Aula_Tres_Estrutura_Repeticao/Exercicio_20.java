package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_20 {

	/**
	 * 20. Faça um programa que calcule e mostre a média aritmética de N notas.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade_notas = 0, media = 0, soma = 0, nota = 0;

		System.out.println("Informe quantas notas a digitar:");
		quantidade_notas = entrada.nextInt();

		for (int i = 1; i <= quantidade_notas; i++) {
			System.out.println("Informe a :" + i + " nota.");
			nota = entrada.nextInt();

			soma = soma + nota;
			media = soma / i;
		}

		System.out.println("Media das notas:" + media);

	}

}
