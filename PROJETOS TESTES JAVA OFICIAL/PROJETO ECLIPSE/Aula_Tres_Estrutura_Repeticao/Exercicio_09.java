package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_09 {

	/**
	 * 9. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
	 * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
	 * deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: Tabuada
	 * de 5: 5 x 1 = 5 5 x 2 = 10 ... 5 x 10 = 50
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Informe o numero para a tabuada de 10:");
			numero = entrada.nextInt();

			if ((numero < 1) || (numero > 10)) {
				System.out
						.println("Informe um numero maior que zero e menor igual a 10!");
			}

		} while ((numero < 1) || (numero > 10));

		System.out.println("Tabuada de: " + numero);

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
