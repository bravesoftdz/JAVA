package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_03 {

	/**
	 * 1. Faça um programa que leia e valide as seguintes informações: a. Nome:
	 * maior que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que
	 * zero; d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		double salario = 0;
		char sexo = ' ';
		char estado_civil = '0';
		int continua = 0;
		do {

			do {
				System.out.println("Informe o nome:");
				nome = entrada.next();
				if (nome.length() < 3) {
					System.out
							.println("Informe nome com mais de 3 caracteres!");
				}
			} while (nome.length() < 3);

			do {
				System.out.println("Informe a idade:");
				idade = entrada.nextInt();
				if ((idade <= 0) || (idade > 150)) {
					System.out
							.println("Informe uma idade maior que Zero e menor que 150!");
				}
			} while ((idade <= 0) || (idade > 150));

			do {
				System.out.println("Informe o salario:");
				salario = entrada.nextDouble();
				if (salario <= 0) {
					System.out.println("Informe um salario maior que zero!");
				}
			} while (salario <= 0);

			do {
				System.out.println("Informe o sexo m Masculino ou f Feminino:");
				sexo = entrada.next().toLowerCase().charAt(0);
				if ((sexo != 'f') && (sexo != 'm')) {
					System.out
							.println("Informe um sexo válido (m Masculino ou F Feminino)!");
				}
			} while ((sexo != 'f') && (sexo != 'm'));

			do {
				System.out
						.println("Informe o estado civil  (c - casado, s - solteiro,v - viuvo,d - divorciado)");
				estado_civil = entrada.next().toLowerCase().charAt(0);
				if ((estado_civil != 's') && (estado_civil != 'c')
						&& (estado_civil != 'v') && (estado_civil != 'd')) {
					System.out
							.println("Informe um  estado civil valido!  (c - casado, s - solteiro,v - viuvo,d - divorciado)");
				}
			} while ((estado_civil != 's') && (estado_civil != 'c')
					&& (estado_civil != 'v') && (estado_civil != 'd'));

			System.out.println("Deseja continuar a digitação? 1-Sim  0-Não");
			continua = entrada.nextInt();

			if (continua == 0) {
				System.out.println("Fim da digitação!");
			}
		} while (continua == 1);
	}

}
