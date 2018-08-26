package Aula_Um;

import java.util.Scanner;

public class Exercicio_Oito {

	/**
	 * Enunciado: Faça um Programa que pergunte quanto você ganha por hora e o
	 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
	 * salário no referido mês.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor_hora = 0;
		double horas_por_mes = 0;
		double salario = 0;

		System.out.println("Informe quanto você ganha por hora:");
		valor_hora = entrada.nextDouble();
		System.out.println("Informe quantas horas voce trabalha por mes:");
		horas_por_mes = entrada.nextDouble();

		salario = valor_hora * horas_por_mes;

		System.out.println("O Salario do mes é:" + salario);

	}

}
