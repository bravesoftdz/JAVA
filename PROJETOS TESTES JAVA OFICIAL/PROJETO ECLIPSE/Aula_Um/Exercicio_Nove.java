package Aula_Um;

import java.util.Scanner;

public class Exercicio_Nove {
	/**
	 * Enunciado: 1. Faça um Programa que peça a temperatura em graus Farenheit,
	 * transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double celsius = 0;
		double Farenheit = 0;

		System.out.println("Informe a temperatura em graus Farenheit:");

		Farenheit = entrada.nextDouble();

		celsius = (5 * (Farenheit - 32) / 9);

		System.out.println("A temperatura em graus Celsius é:" + celsius);

	}

}
