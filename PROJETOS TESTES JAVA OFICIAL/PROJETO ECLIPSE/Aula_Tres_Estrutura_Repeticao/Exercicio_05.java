package Aula_Tres_Estrutura_Repeticao;

public class Exercicio_05 {

	/**
	 * 5. Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo
	 * do outro. Depois modifique o programa para que ele mostre os n�meros um
	 * ao lado do outro.
	 */
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Impress�o dos numeros um embaixo do outro.");

		for (i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("Impress�o dos numeros um ao lado do outro.");

		for (i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
	}

}
