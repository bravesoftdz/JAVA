/**
 * 
 */
package Aula_Tres_Vetores;

import java.util.Scanner;

/**
 * @author Gelvazio
 *
 */
public class Exercicio_11 {

	/**
	 * 11. Fa�a um programa que tenha como entrada v�rias palavras separadas por
	 * ; (rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma
	 * em uma posi��o do vetor
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = "";

		String array[] = new String[30000];

		System.out
				.println("Informe  nomes separados por ';' (ponto e virgula)  ");
		palavra = entrada.next();

		array = palavra.split(";");
		System.out.println("Valor do Array na posicao: " + array[1]);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nome lido na posicao: " + i + " � ==>"
					+ array[i]);
		}
		entrada.close();
	}

}
