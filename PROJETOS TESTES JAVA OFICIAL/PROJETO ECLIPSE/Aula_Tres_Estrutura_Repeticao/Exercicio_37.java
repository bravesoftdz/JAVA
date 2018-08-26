package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_37 {

	/*
	 * Desenvolver um programa para verificar a nota do aluno em uma prova com
	 * 10 questões, o programa deve perguntar ao aluno a resposta de cada
	 * questão e ao final comparar com o gabarito da prova e assim calcular o
	 * total de acertos e a nota (atribuir 1 ponto por resposta certa). Após
	 * cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno
	 * vai utilizar o sistema. Após todos os alunos terem respondido informar:
	 * a. Maior e Menor Acerto; b. Total de Alunos que utilizaram o sistema; c.
	 * A Média das Notas da Turma. Gabarito da Prova: 01  A 02  B 03  C 04 
	 * D 05  E 06  E 07  D 08  C 09  B 10  A
	 * 
	 * Após concluir isto você poderia incrementar o programa permitindo que o
	 * professor digite o gabarito da prova antes dos alunos usarem o programa.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double controle = 0, maior_acerto = 0, menor_acerto = 0, soma_nota = 0, media_nota = 0, nota = 0, tot_aluno = 0;

		String alternativa = "";
		String gabarito[] = new String[11];

		// Digitação do Gabarito
		System.out.println("Professor!Informe os dados do gabarito da prova!");

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe a resposta da questão: " + i);
			gabarito[i] = entrada.next();
		}
		System.out.println("Inicio da Digitação das Alternativas!");
		// Inicio da Verificação das notas pelos alunos
		do {
			// Digitacao das Notas
			for (int i = 1; i <= 10; i++) {
				System.out.println("Informe a alternativa da questão-> " + i);
				alternativa = entrada.next();

				if (alternativa.equals(gabarito[i])) {
					nota++;
				}
			}

			System.out.println("Sua nota foi ->" + nota);

			// Verificação da Maior e Menor Nota
			if (tot_aluno == 0) {
				maior_acerto = nota;
				menor_acerto = nota;
			}

			if (nota > maior_acerto) {
				maior_acerto = nota;
			}

			if (nota < menor_acerto) {
				menor_acerto = nota;
			}

			System.out.println("Outro aluno usara o programa? 1-Sim, 2-Não.");
			controle = entrada.nextInt();

			soma_nota = soma_nota + nota;
			tot_aluno++;

			// Zera a Nota para proximo aluno usar o sistema
			nota = 0;

		} while (controle == 1);

		media_nota = soma_nota / tot_aluno;

		System.out.println("Maior Nota da Turma:" + maior_acerto);
		System.out.println("Menor Nota da Turma:" + menor_acerto);
		System.out.println("Total de alunos que usaram o sistema:" + tot_aluno);
		System.out.println("Média de Nota da Turma:" + media_nota);

	}

}
