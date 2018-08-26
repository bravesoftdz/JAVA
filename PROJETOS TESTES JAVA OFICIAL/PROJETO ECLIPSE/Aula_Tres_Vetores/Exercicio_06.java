package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_06 {
	/*
	 * 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e
	 * armazene num vetor a média de cada aluno, imprima o número de alunos com
	 * média maior ou igual a 7.0.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double soma = 0, nota = 0, media = 0;
		double vetorMedia[] = new double[11];

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe as notas do " + i + " aluno.");

			for (int j = 1; j <= 4; j++) {
				System.out.println("Informe a " + j + " nota.");
				nota = entrada.nextInt();

				soma = soma + nota;
			}
			media = soma / 4;

			// Recebe a media na posicao
			vetorMedia[i] = media;

			// Zera a soma para o novo aluno
			soma = 0;

		}
		System.out.println("Lista de alunos com media maior ou igual a 7");
		for (int i = 0; i <= 10; i++) {
			if ((vetorMedia[i]) >= 7) {
				System.out.println(+i
						+ " aluno com nota maior que 7 e media de:"
						+ vetorMedia[i]);
			}
		}

		// Fechamento da inserção dos dados
		entrada.close();
	}

}
