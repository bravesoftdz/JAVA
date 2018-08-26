package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_21 {

	/**
	 * 21. Faça um programa que peça para n pessoas a sua idade, ao final o
	 * programa devera verificar se a média de idade da turma varia entre 0 e
	 * 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou
	 * idosa, conforme a média calculada.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qt_pessoas = 0, media_idade = 0, idade = 0, soma_idade = 0;

		System.out
				.println("Informe a quantiadde de pessoas a ser verificado a idade:");
		qt_pessoas = entrada.nextInt();

		for (int i = 1; i <= qt_pessoas; i++) {
			System.out.println("Informe a idade da pessoa:");
			idade = entrada.nextInt();

			soma_idade = soma_idade + idade;

			media_idade = soma_idade / i;
		}
		System.out.println("Média de idade da turma:" + media_idade);
		if ((media_idade > 0) && (media_idade < 26)) {
			System.out.println("A Turma é jovem!");
		} else if ((media_idade > 25) && (media_idade < 60)) {
			System.out.println("A Turma é adulta!");
		} else {
			System.out.println("A Turma é idosa!");
		}
	}

}
