package Aula_Tres_Estrutura_Repeticao;

public class Exercicio_15 {

	/**
	 * 15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ...
	 * + (1*2)/37.
	 */
	public static void main(String[] args) {

		System.out
				.println("Calculo da serie S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37");

		int i = 1, soma = 0;
		int cont1 = 0, cont2 = 0;

		System.out.println("S = " + i + "/" + i);
		// S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37");

		cont1 = 37;
		cont2 = 38;

		for (i = 2; i <= 37; i++) {

			System.out.println("S = (" + cont1 + " * " + cont2 + ")/" + i);

			soma = soma + ((cont1 * cont2) / i);
		}

		System.out.println("Total da Serie= " + soma);

	}

}
