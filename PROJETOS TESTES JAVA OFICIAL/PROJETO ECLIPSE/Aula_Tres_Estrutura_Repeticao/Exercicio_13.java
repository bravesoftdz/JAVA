package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_13 {

	/**
	 * 13. Faça um programa que calcule o fatorial de um número inteiro
	 * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, fatorial = 0;

		System.out.println("Informe o numero a ser calculado o fatorial:");
		n = entrada.nextInt();

		fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("Fatorial do numero: " + n + " é igual a :"
				+ fatorial);
	}

}
