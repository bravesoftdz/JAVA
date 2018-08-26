package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_36 {
	/*
	 * Em uma eleição presidencial existem quatro candidatos. Os votos são
	 * informados por meio de código. Os códigos utilizados são: 1 , 2, 3, 4 -
	 * Votos para os respectivos candidatos (você deve montar a tabela ex: 1 
	 * Jose/ 2- João/etc) 5  Voto Nulo 6  Voto em Branco
	 * 
	 * Faça um programa que calcule e mostre: O total de votos para cada
	 * candidato; O total de votos nulos; O total de votos em branco; A
	 * percentagem de votos nulos sobre o total de votos; A percentagem de votos
	 * em branco sobre o total de votos. Para finalizar o conjunto de votos
	 * tem-se o valor zero.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, perc_nulo = 0, perc_branco = 0, tot_votantes = 0, voto = 0, nulo = 0, branco = 0;

		do {
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
			if (voto == 4) {
				cand4++;
			}
			if (voto == 5) {
				nulo++;
			}
			if (voto == 6) {
				branco++;
			}
			if ((voto != 1) && (voto != 2) && (voto != 3) && (voto != 4)
					&& (voto != 5) && (voto != 6) && (voto != 0)) {
				System.out.println("Voto Invalido!");
			}
			tot_votantes++;
		} while (voto != 0);

		perc_nulo = (perc_nulo * 100) / tot_votantes;
		perc_branco = (perc_branco * 100) / tot_votantes;

		System.out.println("Votos do Candidato João: " + cand1);
		System.out.println("Votos do Candidato Pedro: " + cand2);
		System.out.println("Votos do Candidato Maria: " + cand3);
		System.out.println("Votos do Candidato César: " + cand4);
		System.out.println("Votos Nulos: " + nulo);
		System.out.println("Votos em Branco: " + branco);

	}

}
