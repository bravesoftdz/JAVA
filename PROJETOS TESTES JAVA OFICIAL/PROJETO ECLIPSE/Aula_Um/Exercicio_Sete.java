package Aula_Um;

import java.util.Scanner;

public class Exercicio_Sete {

	/**
	 * Enunciado: Faça um Programa que calcule e mostre a área de um quadrado.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado = 0;
		double area = 0;
		System.out.println("Informe o valor do lado do quadrado:");
		lado = entrada.nextDouble();
		area = lado * lado;

		System.out.println("Area do quadrado é:" + area);

	}

}
