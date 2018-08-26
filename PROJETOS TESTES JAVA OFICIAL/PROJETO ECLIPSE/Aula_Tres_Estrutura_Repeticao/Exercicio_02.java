package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_02 {

	/**
	 * 1. Faça um programa que leia um nome de usuário e a sua senha e não
	 * aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e
	 * voltando a pedir as informações.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		String senha = "";
		do {
			System.out.println("Informe o nome do usuario:");
			nome = entrada.next();

			System.out.println("Informe a senha do usuario:");
			senha = entrada.next();

			if (nome.equals(senha)) {
				System.out
						.println("Senha igual ao nome de usuario,informe novamente!");
			}

		} while (nome.equals(senha));
		System.out.println("Fim da digitação!");
	}

}
