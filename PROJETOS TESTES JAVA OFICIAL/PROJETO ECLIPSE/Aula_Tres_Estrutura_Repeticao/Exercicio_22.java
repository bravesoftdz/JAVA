package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_22 {

	/**
	 * 22. Numa elei��o existem tr�s candidatos. Fa�a um programa que pe�a o
	 * n�mero total de votantes. Pe�a para cada votante votar e ao final mostrar
	 * o n�mero de votos de cada candidato.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cand1 = 0, cand2 = 0, cand3 = 0, tot_votantes = 0, voto = 0;

		System.out.println("Numero de votantes:");
		tot_votantes = entrada.nextInt();

		for (int i = 0; i < tot_votantes; i++) {
			System.out
					.println("Informe 1-candidato Jo�o, 2-candidato Pedro,3-candidato Maria");
			voto = entrada.nextInt();

			if (voto == 1) {
				cand1++;
			}
			if (voto == 2) {
				cand2++;
			}
			if (voto == 3) {
				cand3++;
			}
			if ((voto != 1) && (voto != 2) && (voto != 3)) {
				System.out.println("Voto Invalido!");
			}
		}

		System.out.println("Votos do Candidato Jo�o: " + cand1);
		System.out.println("Votos do Candidato Pedro: " + cand2);
		System.out.println("Votos do Candidato Maria: " + cand3);

	}

}
