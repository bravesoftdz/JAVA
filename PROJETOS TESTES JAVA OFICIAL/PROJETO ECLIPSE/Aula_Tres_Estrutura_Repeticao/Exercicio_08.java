package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_08 {

	/**
	 * . Faça um programa que receba dois números inteiros e gere os números
	 * inteiros que estão no intervalo compreendido por eles.
	 * 
	 * 8. Altere o programa anterior para mostrar no final a soma dos números.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, primeiro = 0, segundo = 0, soma = 0;

		do {
			System.out.println("Informe o primeiro numero:");
			n1 = entrada.nextInt();

			System.out.println("Informe o segundo numero:");
			n2 = entrada.nextInt();

			if (n1 == n2) {
				System.out.println("Informe números diferentes!");
			}

		} while (n1 == n2);

		if (n1 > n2) {
			primeiro = n2;
			segundo = n1;
		} else {
			primeiro = n1;
			segundo = n2;
		}

		for (int i = primeiro; i < segundo; i++) {
			primeiro = primeiro + 1;
			System.out.println(primeiro);
			soma = soma + primeiro;
		}
		System.out.println("Soma dos numeros:" + soma);
		System.out.println("Fim do algoritmo!");

	}

}
