package Aula_Tres_Estrutura_Repeticao;

public class Exercicio_05 {

	/**
	 * 5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo
	 * do outro. Depois modifique o programa para que ele mostre os números um
	 * ao lado do outro.
	 */
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Impressão dos numeros um embaixo do outro.");

		for (i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("Impressão dos numeros um ao lado do outro.");

		for (i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
	}

}
