package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_24 {

	/**
	 * Fa�a um programa que calcule o valor total investido por um colecionador
	 * em sua cole��o de CDs e o valor m�dio gasto em cada um deles. O usu�rio
	 * dever� informar a quantidade de CDs e o valor para em cada um.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0, vl_medio = 0, qt_cd = 0, vl_cd = 0;

		System.out.println("Informe a quantidade de CDs.");
		qt_cd = entrada.nextDouble();

		for (int i = 1; i <= qt_cd; i++) {
			System.out.println("Informe o valor pago pelo: " + i + " CD.");
			vl_cd = entrada.nextDouble();

			soma = soma + vl_cd;
		}
		vl_medio = soma / qt_cd;

		System.out.println("Valor total investido: " + soma);
		System.out.println("Valor medio gasto:" + vl_medio);
	}

}
