package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_12 {

	/**
	 * 12. A série de Fibonacci é formada pela seqüência
	 * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o
	 * n−ésimo termo.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int termo = 0, cont1 = 0, cont2 = 0, serie = 0;
		System.out
				.println("Informe ate qual termo calcular a serie de fibonacci:");
		termo = entrada.nextInt();

		cont1 = 1;
		cont2 = 1;
		System.out.print(cont1 + " " + cont2);
		// 1,1,2,3,5,8,13,21,34,55
		for (int i = 0; i < termo; i++) {
			serie = cont1 + cont2;
			System.out.print(" " + serie);// 2
			cont2 = cont1;// 2
			cont1 = serie;// 3
		}
	}

}
