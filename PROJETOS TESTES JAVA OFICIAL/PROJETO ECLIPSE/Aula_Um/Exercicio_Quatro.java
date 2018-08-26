package Aula_Um;

import java.util.Scanner;

public class Exercicio_Quatro {

	/**
	 * Enunciado: Faça um Programa que peça as 4 notas bimestrais e mostre a
	 * média.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		double media = 0;
		System.out.println("Informe a primeira nota:");
		n1 = entrada.nextInt();
		System.out.println("Informe a segunda nota:");
		n2 = entrada.nextInt();
		System.out.println("Informe a terceira nota:");
		n3 = entrada.nextInt();
		System.out.println("Informe a quarta nota:");
		n4 = entrada.nextInt();

		media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A média das 4 notas é: " + media);

	}

}
