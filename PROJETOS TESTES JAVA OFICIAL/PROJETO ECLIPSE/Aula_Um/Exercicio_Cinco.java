package Aula_Um;

import java.util.Scanner;

public class Exercicio_Cinco {

	/**
	 * Enunciado: Faça um Programa que converta metros para centímetros.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double metro = 0;
		double centimetros = 0;
		System.out.println("Informe o valor em metros:");
		metro = entrada.nextDouble();

		centimetros = metro * 100;

		System.out.println("Valor: " + metro + " convertido em centimetros é: "
				+ centimetros);
	}

}
