package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_02 {

	/**
	 * 1. Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
	 * aceite a senha igual ao nome do usu�rio, mostrando uma mensagem de erro e
	 * voltando a pedir as informa��es.
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
		System.out.println("Fim da digita��o!");
	}

}
