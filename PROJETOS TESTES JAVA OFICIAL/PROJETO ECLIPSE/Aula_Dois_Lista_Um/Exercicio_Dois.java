package Aula_Dois_Lista_Um;

import java.util.Scanner;

public class Exercicio_Dois {

	/**
	 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
	 * positivo, negativo ou zero
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;

		System.out.println("Informe o numero:");
		n = entrada.nextInt();

		if (n < 0) {
			System.out.println("Valor negativo:" + n);
		} else if (n > 0) {
			System.out.println("Valor positivo:" + n);
		} else {
			System.out.println("Valor zerado: " + n);
		}

	}

}
