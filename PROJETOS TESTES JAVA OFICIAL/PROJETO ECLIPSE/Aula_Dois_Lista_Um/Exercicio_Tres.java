package Aula_Dois_Lista_Um;

import java.util.Scanner;

public class Exercicio_Tres {

	/**
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
	 * Conforme a letra escrever: F - Feminino, M - Masculino.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra = "";
		System.out.println("Informe a letra F feminino ou M masculino:");
		letra = entrada.next();

		if ((letra.equals("F")) || (letra.equals("f"))) {
			System.out.println("F - Feminino");
		} else if ((letra.equals("M")) || (letra.equals("m"))) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Informe uma letra válida!");
		}

	}

}
