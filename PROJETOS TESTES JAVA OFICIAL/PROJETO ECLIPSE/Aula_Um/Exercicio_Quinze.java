package Aula_Um;

import java.util.Scanner;

public class Exercicio_Quinze {

	/**
	 * Enunciado: Fa�a um programa para uma loja de tintas. O programa dever�
	 * pedir o tamanho em metros quadrados da �rea a ser pintada. Considere que
	 * a cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a
	 * tinta � vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
	 * usu�rio a quantidades de latas de tinta a serem compradas e o pre�o
	 * total.
	 * 
	 * 1 lata= 18 * 3 = 54 mt 54=80
	 * 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double tamanho = 0;
		double quantidade_latas_tintas = 0;
		double preco_latas_tintas = 0;

		System.out.println("Informe o tamando da residencia a ser pintada:");
		tamanho = entrada.nextDouble();

		quantidade_latas_tintas = tamanho / 54;
		preco_latas_tintas = quantidade_latas_tintas * 80;

		System.out.println("Quantidade de latas a serem compradas:"
				+ quantidade_latas_tintas);
		System.out.println("Pre�o � ser pago:" + preco_latas_tintas);

	}

}
