package Aula_Um;

import java.util.Scanner;

public class Exercicio_Dois {

	/**
	 * @param args
	 *            Enunciado: Fa�a um Programa que pe�a um n�mero e ent�o mostre
	 *            a mensagem O n�mero informado foi [n�mero].
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		System.out.println("Informe um numero:");
		n = entrada.nextInt();
		System.out.println("O numero informado foi: " + n);

	}

}
