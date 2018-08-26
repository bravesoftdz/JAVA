package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_29 {

	/**
	 * Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro
	 * que ser� digitado pelo usu�rio, mas a tabuada n�o deve necessariamente
	 * iniciar em 1 e terminar em 10, o valor inicial e final devem ser
	 * informados tamb�m pelo usu�rio, conforme exemplo abaixo: Montar a tabuada
	 * de: 5 Come�ar por: 4 Terminar em: 7
	 * 
	 * Vou montar a tabuada de 5 come�ando em 4 e terminando em 7: 5 x 4 = 20 5
	 * x 5 = 25 5 x 6 = 30 5 x 7 = 35
	 * 
	 * Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor que o
	 * inicial.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vl_inicial = 0, vl_final = 0, tabuada = 0;

		System.out.println("Informe qual tabuada deseja:");
		tabuada = entrada.nextInt();
		// Valida��o do VL Inicial e VL Final
		do {
			System.out.println("Informe o valor inicial:");
			vl_inicial = entrada.nextInt();

			System.out.println("Informe o valor final:");
			vl_final = entrada.nextInt();

			if (vl_final < vl_inicial) {
				System.out
						.println("Voce informou um vl final maior que inicial , informe de novo!");
			}

		} while (vl_final < vl_inicial);

		for (int i = vl_inicial; i <= vl_final; i++) {
			// 5 x 7 = 35
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}

	}

}
