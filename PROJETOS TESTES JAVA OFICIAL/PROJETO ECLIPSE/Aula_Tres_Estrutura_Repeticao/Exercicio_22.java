package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_22 {

	/**
	 * 22. Numa eleição existem três candidatos. Faça um programa que peça o
	 * número total de votantes. Peça para cada votante votar e ao final mostrar
	 * o número de votos de cada candidato.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cand1 = 0, cand2 = 0, cand3 = 0, tot_votantes = 0, voto = 0;

		System.out.println("Numero de votantes:");
		tot_votantes = entrada.nextInt();

		for (int i = 0; i < tot_votantes; i++) {
			System.out
					.println("Informe 1-candidato João, 2-candidato Pedro,3-candidato Maria");
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

		System.out.println("Votos do Candidato João: " + cand1);
		System.out.println("Votos do Candidato Pedro: " + cand2);
		System.out.println("Votos do Candidato Maria: " + cand3);

	}

}
