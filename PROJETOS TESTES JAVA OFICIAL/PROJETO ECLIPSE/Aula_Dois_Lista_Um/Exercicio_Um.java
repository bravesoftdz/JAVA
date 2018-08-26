package Aula_Dois_Lista_Um;

import java.util.Scanner;

public class Exercicio_Um {

	/**
	 * @param args
	 *            Faça um Programa que peça dois números e imprima o maior
	 *            deles.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, maior = 0;

		System.out.println("Informe o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Informe o segundo numero:");
		n2 = entrada.nextInt();

		if (n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}
		System.out.println("Maior:" + maior);

	}

}
