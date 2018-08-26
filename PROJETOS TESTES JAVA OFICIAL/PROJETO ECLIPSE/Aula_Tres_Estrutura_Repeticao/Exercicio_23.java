package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_23 {

	/**
	 * 23. Faça um programa que calcule o número médio de alunos por turma. Para
	 * isto, peça a quantidade de turmas e a quantidade de alunos para cada
	 * turma. As turmas não podem ter mais de 40 alunos.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double qt_turma = 0, qt_aluno = 0, media_aluno_turma = 0, soma_aluno = 0;

		System.out.println("Informe a quantidade de turmas: ");
		qt_turma = entrada.nextDouble();
		// Incrementa ate a quantidade de turmas
		for (int i = 1; i <= qt_turma; i++) {
			// //Incrementa ate a quantidade de alunos estar correta
			do {
				System.out.println("Informe a quantidade de alunos da " + i
						+ " turma: ");
				qt_aluno = entrada.nextDouble();

				if ((qt_aluno > 40) || (qt_aluno <= 0)) {
					System.out
							.println("Informe no minimo 1 aluno e no maximo 40 alunos!");
				}

			} while ((qt_aluno > 40) || (qt_aluno <= 0));

			soma_aluno = soma_aluno + qt_aluno;

		}

		media_aluno_turma = soma_aluno / qt_turma;

		System.out.println("A media de alunos é:" + media_aluno_turma);

	}

}
