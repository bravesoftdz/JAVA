package Aula_Um;

import java.util.Scanner;

public class Exercicio_Doze {

	/**
	 * Enunciado: Tendo como dado de entrada a altura, construa um algoritmo que
	 * calcule seu peso ideal, utilizando as seguintes fórmulas: Para homens:
	 * (72.7*h) - 58 Para mulheres: (62.1*h) - 44.7 (h = altura)
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura = 0;
		double peso_ideal_m = 0;
		double peso_ideal_h = 0;

		System.out.println("Informe a altura da pessoa:");
		altura = entrada.nextDouble();

		peso_ideal_h = (72.7 * altura) - 58;
		peso_ideal_m = (62.1 * altura) - 44.7;

		System.out.println("Peso ideal para a mulher: " + peso_ideal_m);
		System.out.println("Peso ideal para o homem: " + peso_ideal_h);

	}

}
