package Aula_Um;

import java.util.Scanner;

public class Exercicio_Dez {

	/**
	 * Enunciado: 1. Faça um Programa que peça 2 números inteiros e um número
	 * real. Calcule e mostre: a. o produto do dobro do primeiro com metade do
	 * segundo . b. a soma do triplo do primeiro com o terceiro. c. o terceiro
	 * elevado ao cubo.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		double n3 = 0;

		double dobro = 0;
		double triplo = 0;
		double cubo = 0;
		int aux = 0;

		System.out.println("Informe o primeiro numero inteiro:");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo numero inteiro:");
		n2 = entrada.nextInt();
		System.out.println("Informe terceiro numero real:");
		n3 = entrada.nextDouble();

		dobro = (n1 * 2) * (n2 / 2);
		triplo = (n1 * 3) + aux;
		cubo = n3 * n3 * n3;

		System.out
				.println("O produto do dobro do primeiro com metade do segundo é: "
						+ dobro);
		System.out.println("A soma do triplo do primeiro com o terceiro é: "
				+ triplo);
		System.out.println("O terceiro numero elevado ao cubo é: " + cubo);

	}

}
