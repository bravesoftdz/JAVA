package Aula_Um;

import java.util.Scanner;

public class Exercicio_Seis {

	/**
	 * Enunciado: Fa�a um Programa que pe�a o raio de um c�rculo, calcule e
	 * mostre sua �rea. Formula = Area= raio * Pi;
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio = 0;
		double area = 0;
		// Constante PI
		double Pi = 3.14;
		System.out.println("Informe o raio do circulo:");
		raio = entrada.nextDouble();

		area = raio * Pi;

		System.out.println("Area do circuo �:" + area);

	}

}
