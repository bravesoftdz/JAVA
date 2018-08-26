package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_04 {

	/**
	 * Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
	 * consoantes foram lidas. Imprima as consoantes.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String vetor[] = new String[11];
		String consoante[] = new String[11];

		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe a " + i + " letra.");
			vetor[i] = entrada.next();

			if (vetor[i].toLowerCase().equals("a")) {
				System.out.println("A digitado");
				consoante[i] = vetor[i];
			}
			// Se a letra for diferente de vogais, incrementa o vetor de
			// consoantes
			if ((vetor[i].toLowerCase().equals("a"))
					|| (vetor[i].toLowerCase().equals("e"))
					|| (vetor[i].toLowerCase().equals("i"))
					|| (vetor[i].toLowerCase().equals("o"))
					|| (vetor[i].toLowerCase().equals("u"))) {
				System.out.println("Vogal digitada");

			} else {
				System.out.println("Consoante digitada");
				consoante[i] = vetor[i];
			}
		}
		System.out.println("Lista das consoantes digitadas");

		for (int i = 1; i <= 10; i++) {

			if ((vetor[i].toLowerCase().equals("a"))
					|| (vetor[i].toLowerCase().equals("e"))
					|| (vetor[i].toLowerCase().equals("i"))
					|| (vetor[i].toLowerCase().equals("o"))
					|| (vetor[i].toLowerCase().equals("u"))) {
				System.out.println("Vogal digitada");

			} else {
				System.out.println("Consoante digitada");
				System.out.println(consoante[i] + " ");
			}
		}
		entrada.close();
	}

}
