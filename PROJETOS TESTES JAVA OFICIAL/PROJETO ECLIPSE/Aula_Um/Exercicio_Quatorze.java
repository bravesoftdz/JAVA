package Aula_Um;

import java.util.Scanner;

public class Exercicio_Quatorze {

	/**
	 * Enunciado: 10. Fa�a um Programa que pergunte quanto voc� ganha por hora e
	 * o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
	 * sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
	 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa
	 * que nos d�: a. sal�rio bruto. b. quanto pagou ao INSS. c. quanto pagou ao
	 * sindicato. d. o sal�rio l�quido. e. calcule os descontos e o sal�rio
	 * l�quido, conforme a tabela abaixo: f. + Sal�rio Bruto : R$ g. - IR (11%)
	 * : R$ h. - INSS (8%) : R$ i. - Sindicato ( 5%) : R$ j. = Sal�rio Liquido :
	 * R$ Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor_hora = 0;
		double horas_por_mes = 0;
		double salario_bruto = 0;
		double salario_liquido = 0;
		double descontos = 0;

		double IR = 0.11;
		double INSS = 0.08;
		double sindicato = 0.05;

		System.out.println("Informe quanto voc� ganha por hora:");
		valor_hora = entrada.nextDouble();
		System.out.println("Informe quantas horas voce trabalha por mes:");
		horas_por_mes = entrada.nextDouble();

		salario_bruto = valor_hora * horas_por_mes;
		INSS = INSS * salario_bruto;
		sindicato = sindicato * salario_bruto;
		IR = IR * salario_bruto;

		descontos = INSS + sindicato + IR;
		salario_liquido = salario_bruto - descontos;

		System.out.println("O Salario bruto do mes �:" + salario_bruto);
		System.out.println("Valor pago ao INSS : " + INSS);
		System.out.println("Valor pago ao sindicato: " + sindicato);
		System.out.println("Valor pago ao Imposto de Renda : " + IR);

		System.out.println("Total de descontos: " + descontos);

		System.out.println("O Salario liquido do mes �:" + salario_liquido);

	}

}
