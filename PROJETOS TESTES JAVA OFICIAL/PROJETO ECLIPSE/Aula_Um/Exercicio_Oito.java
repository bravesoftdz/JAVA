package Aula_Um;

import java.util.Scanner;

public class Exercicio_Oito {

	/**
	 * Enunciado: Fa�a um Programa que pergunte quanto voc� ganha por hora e o
	 * n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
	 * sal�rio no referido m�s.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor_hora = 0;
		double horas_por_mes = 0;
		double salario = 0;

		System.out.println("Informe quanto voc� ganha por hora:");
		valor_hora = entrada.nextDouble();
		System.out.println("Informe quantas horas voce trabalha por mes:");
		horas_por_mes = entrada.nextDouble();

		salario = valor_hora * horas_por_mes;

		System.out.println("O Salario do mes �:" + salario);

	}

}
