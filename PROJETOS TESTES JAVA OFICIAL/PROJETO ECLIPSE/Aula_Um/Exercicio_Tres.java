package Aula_Um;

import java.util.Scanner;

public class Exercicio_Tres {

	/**
	 * Enunciado: Fa�a um Programa que pe�a dois n�meros e imprima a soma.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int soma = 0;
		System.out.println("Informe o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Informe o primeiro numero:");
		n2 = entrada.nextInt();

		soma = n1 + n2;

		System.out.println("A soma dos numeros � :" + soma);

	}

}
