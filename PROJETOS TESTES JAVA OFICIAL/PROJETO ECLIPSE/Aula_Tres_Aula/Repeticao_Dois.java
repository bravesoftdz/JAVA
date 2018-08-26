package Aula_Tres_Aula;

import java.util.Scanner;

public class Repeticao_Dois {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tab = 0;// Variaveis sempre devem ser inicializadas
		// Usado para validação de usuario
		do {
			System.out.println("Informe um numero:");
			tab = entrada.nextInt();
		} while (tab <= 0);

		// As vezes neste caso é necessario fazer uma
		// entrada forçada,para garantir que o programa rode ao menos uma
		// vez este loop.

		tab = 0;
		while (tab <= 0) {
			System.out.println("Informe um numero:");
			tab = entrada.nextInt();
		}

	}

}
