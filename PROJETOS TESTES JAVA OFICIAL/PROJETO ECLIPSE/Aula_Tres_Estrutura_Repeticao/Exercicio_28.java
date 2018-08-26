package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_28 {

	/**
	 * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
	 * programa que leia as um conjunto indeterminado de temperaturas, e informe
	 * ao final a menor e a maior temperaturas informadas, bem como a média das
	 * temperaturas.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temp = 0, contador = 0, maior = 0, menor = 0, media = 0, soma = 0;

		System.out
				.println("Informe a quantidade de temperaturas as ser verificadas!");
		contador = entrada.nextDouble();

		for (int i = 1; i <= contador; i++) {
			System.out.println("Informe a :" + i + " temperatura.");
			temp = entrada.nextDouble();

			if (i == 1) {
				maior = temp;
				menor = temp;
			} else {
				if (temp > maior) {
					maior = temp;
				}
				if (temp < menor) {
					menor = temp;
				}
			}

			soma = soma + temp;

		}

		media = soma / contador;

		System.out.println("Maior Temperatura:" + maior);

		System.out.println("Menor Temperatura:" + menor);

		System.out.println("Media das Temperaturas:" + media);

	}

}
