package Aula_Um;

import java.util.Scanner;

public class Exercicio_Onze {

	/**
	 * Enunciado: Tendo como dados de entrada a altura de uma pessoa, construa
	 * um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
	 * (72.7*altura) – 58.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura = 0;
		double peso_ideal = 0;

		System.out.println("Informe a altura da pessoa:");
		altura = entrada.nextDouble();

		peso_ideal = (72.7 * altura) - 58;

		System.out.println("Peso ideal da pessoa é de :" + peso_ideal);

	}

}
