package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_04 {

	/**
	 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes
	 * com uma taxa anual de crescimento de 3% e que a popula��o de B seja
	 * 200000 habitantes com uma taxa de crescimento de 1.5%.
	 * 
	 * Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para
	 * que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B,
	 * mantidas as taxas de crescimento.
	 * 
	 * Altere o programa anterior permitindo ao usu�rio informar as popula��es e
	 * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
	 * opera��o.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double popA = 80000;
		double popB = 200000;
		int ano = 0;
		double taxaA = 0;
		double taxaB = 0;

		System.out.println("Informe a popula��o do pais A:");
		popA = entrada.nextDouble();
		System.out.println("Informe a popula��o do pais B:");
		popB = entrada.nextDouble();
		System.out.println("Informe a taxa da  popula��o A:");
		taxaA = entrada.nextDouble();
		System.out.println("Informe a taxa da popula��o B:");
		taxaB = entrada.nextDouble();
		while (popA <= popB) {
			popA = popA + (popA * taxaA);
			popB = popB + (popB * taxaB);

			System.out
					.println("Popula��o de A:" + popA + " no " + ano + " ano");
			System.out
					.println("Popula��o de B:" + popB + " no " + ano + " ano");
			System.out.println();
			ano++;
		}
		System.out.println("Quantidade de anos " + "para a popula��o "
				+ "de A atingir a de B:" + ano);

	}

}
