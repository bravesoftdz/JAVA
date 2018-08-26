package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_06 {

	/**
	 * 6. Faça um programa que imprima na tela apenas os números ímpares entre 1
	 * e 50.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int q = 0, conta = 0, numero_primo = 0, divisor = 0;
		boolean tem_outro_divisor = false;
		char op = ' ';

		do {
			System.out.println("Escrever quantos numeros primos?");
			q = entrada.nextInt();
			conta = 2;
			System.out.println("1");
			System.out.println("2");

			do {
				tem_outro_divisor = false;
				divisor = 2;
				numero_primo = numero_primo + 1;
				do {
					if ((numero_primo % divisor) == 0) {
						tem_outro_divisor = true;
					} else {
						// Incrementa os divisores até o numero atual
						divisor = divisor + 1;
					}
					// Enquanto "tem_outro_divisor" NAO for verdade E (divisor
					// <= numero_primo div 2) faca
				} while ((!tem_outro_divisor) && (divisor <= numero_primo / 2));

				if (!tem_outro_divisor) {
					System.out.println(numero_primo);
					conta = conta + 1;
				}
			} while (conta < q);

			System.out.println();
			System.out.println();
			System.out.println("Continuar (S/N)?");
			op = entrada.next().toUpperCase().charAt(0);
			if (op == 'N') {
				System.out.println("Fim da operação!");
			}
			System.out.println();
		} while (op == 'S');

	}

}
