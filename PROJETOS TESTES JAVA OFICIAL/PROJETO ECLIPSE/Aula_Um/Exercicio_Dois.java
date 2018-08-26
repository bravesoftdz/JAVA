package Aula_Um;

import java.util.Scanner;

public class Exercicio_Dois {

	/**
	 * @param args
	 *            Enunciado: Faça um Programa que peça um número e então mostre
	 *            a mensagem O número informado foi [número].
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		System.out.println("Informe um numero:");
		n = entrada.nextInt();
		System.out.println("O numero informado foi: " + n);

	}

}
