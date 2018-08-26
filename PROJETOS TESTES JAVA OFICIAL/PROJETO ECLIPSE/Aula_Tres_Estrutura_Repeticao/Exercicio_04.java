package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_04 {

	/**
	 * Supondo que a população de um país A seja da ordem de 80000 habitantes
	 * com uma taxa anual de crescimento de 3% e que a população de B seja
	 * 200000 habitantes com uma taxa de crescimento de 1.5%.
	 * 
	 * Faça um programa que calcule e escreva o número de anos necessários para
	 * que a população do país A ultrapasse ou iguale a população do país B,
	 * mantidas as taxas de crescimento.
	 * 
	 * Altere o programa anterior permitindo ao usuário informar as populações e
	 * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
	 * operação.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double popA = 80000;
		double popB = 200000;
		int ano = 0;
		double taxaA = 0;
		double taxaB = 0;

		System.out.println("Informe a população do pais A:");
		popA = entrada.nextDouble();
		System.out.println("Informe a população do pais B:");
		popB = entrada.nextDouble();
		System.out.println("Informe a taxa da  população A:");
		taxaA = entrada.nextDouble();
		System.out.println("Informe a taxa da população B:");
		taxaB = entrada.nextDouble();
		while (popA <= popB) {
			popA = popA + (popA * taxaA);
			popB = popB + (popB * taxaB);

			System.out
					.println("População de A:" + popA + " no " + ano + " ano");
			System.out
					.println("População de B:" + popB + " no " + ano + " ano");
			System.out.println();
			ano++;
		}
		System.out.println("Quantidade de anos " + "para a população "
				+ "de A atingir a de B:" + ano);

	}

}
