package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_09 {
	/*
	 * 9. Fa�a um programa que pe�a um texto e coloque-o em um vetor onde cada
	 * car�cter ocupar� uma posi��o do vetor
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = "";

		String array[] = new String[30000];

		System.out.println("Informe  a palavra: ");
		palavra = entrada.next();

		array = palavra.split("");

		for (int i = 1; i < array.length; i++) {
			System.out.println("Letra lida na posicao: " + i + " � ==>"
					+ array[i]);
		}
		entrada.close();

	}

}
