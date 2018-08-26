package Aula_Um;

import java.util.Scanner;

public class Exercicio_Dezesseis {

	/**
	 * Enunciado: 10. Fa�a um Programa para uma loja de tintas. O programa
	 * dever� pedir o tamanho em metros quadrados da �rea a ser pintada.
	 * Considere que a cobertura da tinta � de 1 litro para cada 6 metros
	 * quadrados e que a tinta � vendida em latas de 18 litros, que custam R$
	 * 80,00
	 * 
	 * ou em gal�es de 3,6 litros, que custam R$ 25,00. Informe ao usu�rio as
	 * quantidades de tinta a serem compradas e os respectivos pre�os em 2
	 * situa��es: comprar apenas latas de 18 litros; comprar apenas gal�es de
	 * 3,6 litros;
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double tamanho = 0;
		double quantidade_latas_tintas = 0;
		double preco_latas_tintas = 0;
		double quantidade_galoes_tintas = 0;
		double preco_galoes_tintas = 0;

		System.out.println("Informe o tamando da residencia a ser pintada:");
		tamanho = entrada.nextDouble();

		quantidade_latas_tintas = tamanho / (6 * 18);
		preco_latas_tintas = quantidade_latas_tintas * 80;

		quantidade_galoes_tintas = tamanho / (2.6 * 6);
		preco_galoes_tintas = quantidade_galoes_tintas * 25;

		System.out.println("Quantidade de latas a serem compradas:"
				+ quantidade_latas_tintas);
		System.out.println("Pre�o � ser pago pelas latas de tintas: "
				+ preco_latas_tintas);
		System.out.println("Quantidade de gal�es a serem compradas:"
				+ quantidade_galoes_tintas);
		System.out.println("Pre�o � ser pago pelos gal�es de tintas: "
				+ preco_galoes_tintas);

	}

}
