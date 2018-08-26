package Aula_Um;

import java.util.Scanner;

public class Exercicio_Quatorze {

	/**
	 * Enunciado: 10. Faça um Programa que pergunte quanto você ganha por hora e
	 * o número de horas trabalhadas no mês. Calcule e mostre o total do seu
	 * salário no referido mês, sabendo-se que são descontados 11% para o
	 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa
	 * que nos dê: a. salário bruto. b. quanto pagou ao INSS. c. quanto pagou ao
	 * sindicato. d. o salário líquido. e. calcule os descontos e o salário
	 * líquido, conforme a tabela abaixo: f. + Salário Bruto : R$ g. - IR (11%)
	 * : R$ h. - INSS (8%) : R$ i. - Sindicato ( 5%) : R$ j. = Salário Liquido :
	 * R$ Obs.: Salário Bruto - Descontos = Salário Líquido.
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

		System.out.println("Informe quanto você ganha por hora:");
		valor_hora = entrada.nextDouble();
		System.out.println("Informe quantas horas voce trabalha por mes:");
		horas_por_mes = entrada.nextDouble();

		salario_bruto = valor_hora * horas_por_mes;
		INSS = INSS * salario_bruto;
		sindicato = sindicato * salario_bruto;
		IR = IR * salario_bruto;

		descontos = INSS + sindicato + IR;
		salario_liquido = salario_bruto - descontos;

		System.out.println("O Salario bruto do mes é:" + salario_bruto);
		System.out.println("Valor pago ao INSS : " + INSS);
		System.out.println("Valor pago ao sindicato: " + sindicato);
		System.out.println("Valor pago ao Imposto de Renda : " + IR);

		System.out.println("Total de descontos: " + descontos);

		System.out.println("O Salario liquido do mes é:" + salario_liquido);

	}

}
