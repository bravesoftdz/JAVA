package Aula_Um;

import java.util.Scanner;

public class Exercicio_Quinze {

	/**
	 * Enunciado: Faça um programa para uma loja de tintas. O programa deverá
	 * pedir o tamanho em metros quadrados da área a ser pintada. Considere que
	 * a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
	 * tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
	 * usuário a quantidades de latas de tinta a serem compradas e o preço
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
		System.out.println("Preço á ser pago:" + preco_latas_tintas);

	}

}
