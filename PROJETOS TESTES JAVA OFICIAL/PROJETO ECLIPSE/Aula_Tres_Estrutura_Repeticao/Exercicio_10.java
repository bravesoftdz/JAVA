package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_10 {

	/**
	 * 10. Faça um programa que peça dois números, base e expoente, calcule e
	 * mostre o primeiro número elevado ao segundo número. Não utilize a função
	 * de potência da linguagem.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, calculo = 0;

		System.out.println("Primeiro numero:");
		n1 = entrada.nextInt();

		System.out.println("Segundo Numero;");
		n2 = entrada.nextInt();

		calculo = n1;

		for (int i = 0; i < (n2 - 1); i++) {
			calculo = calculo * n1;
		}
		System.out.println("Calculo da potência de : " + n1 + " elevado a "
				+ n2 + " = " + calculo);

	}

}
