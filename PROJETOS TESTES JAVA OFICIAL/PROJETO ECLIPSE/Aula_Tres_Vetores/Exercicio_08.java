package Aula_Tres_Vetores;

import java.util.Scanner;

public class Exercicio_08 {
	/*
	 * 8.Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas)
	 * gere uma senha para o usuário. Para isto o usuário deve informar o
	 * tamanho da senha que deseja, este tamanho deve ser menor que a quantidade
	 * de letras no vetor. A senha gerada deve seguir o padrão "consoante+vogal"
	 * para tamanhos pares "consoante+vogal e terminada em consoante" para
	 * tamanhos ímpares.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String alfabeto[] = new String[28];

		String senha = "", tipo = "";

		int tamanho = 0, conta_posicao = 0;

		alfabeto[1] = "a";
		alfabeto[2] = "b";
		alfabeto[3] = "c";
		alfabeto[4] = "d";
		alfabeto[5] = "e";
		alfabeto[6] = "f";
		alfabeto[7] = "g";
		alfabeto[8] = "i";
		alfabeto[9] = "j";
		alfabeto[10] = "k";
		alfabeto[11] = "l";
		alfabeto[12] = "m";
		alfabeto[13] = "n";
		alfabeto[14] = "o";
		alfabeto[15] = "p";
		alfabeto[16] = "q";
		alfabeto[17] = "r";
		alfabeto[18] = "s";
		alfabeto[19] = "t";
		alfabeto[20] = "u";
		alfabeto[21] = "v";
		alfabeto[22] = "x";
		alfabeto[23] = "w";
		alfabeto[24] = "y";
		alfabeto[25] = "z";

		do {
			System.out
					.println("Informe o tamanho da senha menor que 27 e maior ou igual a 2 caracteres.");
			tamanho = entrada.nextInt();

			if ((tamanho > 27) || (tamanho < 2)) {
				System.out.println("Tamanho inválido!");
			}

		} while ((tamanho > 27) || (tamanho < 2));
		/*
		 * "consoante+vogal" para tamanhos pares
		 * "consoante+vogal e terminada em consoante" para tamanhos ímpares.
		 */
		// dois parametros
		// 1 para par
		// 1 para consoante

		// Inicia o contador para ter o controle das posicoes da senha
		conta_posicao = 0;
		// Verifica o tipo de senha a ser gerado
		if ((tamanho % 2) == 0) {
			// programacao de Par
			// Define o ti´po da senha pra mostrar no final
			tipo = "consoante+vogal  pois é um  tamanho par!";

			for (int i = 1; i <= 25; i++) {
				// Insere a vogal apenas quando o contaposicao é par e apenas
				// se a letra for vogal
				if ((conta_posicao % 2) == 0) {
					// Verifica se a letra é vogal
					if ((alfabeto[i].equals("a")) || (alfabeto[i].equals("e"))
							|| (alfabeto[i].equals("i"))
							|| (alfabeto[i].equals("o"))
							|| (alfabeto[i].equals("u"))) {

						// Incrementa a letra vogal na Senha
						senha = senha + alfabeto[i];
						// incrementa a posicao, pois houve insercao da letra na
						// senha
						conta_posicao++;
					}
				} else {// Incrementa quando o contaposicao é par e apenas se a
						// letra for consoante

					if ((alfabeto[i].equals("a")) || (alfabeto[i].equals("e"))
							|| (alfabeto[i].equals("i"))
							|| (alfabeto[i].equals("o"))
							|| (alfabeto[i].equals("u"))) {

						// Aqui não incrementa nada
					} else {
						// Incrementa aqui
						// Incrementa a letra consoante na Senha
						senha = senha + alfabeto[i];
						// incrementa a posicao, pois houve insercao da letra na
						// senha
						conta_posicao++;
					}
				}
				// Verifica se o tamanho da senha ja esta ok
				if (conta_posicao == tamanho) {
					System.out.println("Senha Completa daqui pra frente!");
					// Incrementa o total no i para parar o loop
					i = 25;
				} else {
					// Incrementa o i pra não parar o loop
					// antes de terminar de formar a senha
					// e faz iniciar o alfabeto de novo caso tenha chegado no
					// fim
					// do mesmo
					if (i == 25) {
						i = 1;
					}
				}
			}

		} else {

			// Programacao de impar
			tipo = "consoante+vogal e terminada em consoante, pois é um tamanho ímpar.";
			for (int i = 1; i <= 25; i++) {
				// Insere a vogal apenas quando o contaposicao é par e apenas
				// se a letra for vogal

				if (conta_posicao == (tamanho - 1)) {
					// Insere a ultima letra apenas como consoante
					if ((alfabeto[i].equals("a")) || (alfabeto[i].equals("e"))
							|| (alfabeto[i].equals("i"))
							|| (alfabeto[i].equals("o"))
							|| (alfabeto[i].equals("u"))) {

						// Aqui não incrementa nada
					} else {
						// Incrementa aqui
						// Incrementa a letra consoante na Senha
						senha = senha + alfabeto[i];
						// incrementa a posicao, pois houve insercao da letra na
						// senha
						conta_posicao++;
					}

				} else {
					if ((conta_posicao % 2) == 0) {
						// Verifica se a letra é vogal
						if ((alfabeto[i].equals("a"))
								|| (alfabeto[i].equals("e"))
								|| (alfabeto[i].equals("i"))
								|| (alfabeto[i].equals("o"))
								|| (alfabeto[i].equals("u"))) {

							// Incrementa a letra vogal na Senha
							senha = senha + alfabeto[i];
							// incrementa a posicao, pois houve insercao da
							// letra na senha

							conta_posicao++;
						}
					} else {// Incrementa quando o contaposicao é par e apenas
							// se a letra for consoante
						if ((alfabeto[i].equals("a"))
								|| (alfabeto[i].equals("e"))
								|| (alfabeto[i].equals("i"))
								|| (alfabeto[i].equals("o"))
								|| (alfabeto[i].equals("u"))) {

							// Aqui não incrementa nada
						} else {
							// Incrementa aqui
							// Incrementa a letra consoante na Senha
							senha = senha + alfabeto[i];
							// incrementa a posicao, pois houve insercao da
							// letra na senha
							conta_posicao++;
						}
					}
				}
				// Verifica se o tamanho da senha ja esta ok
				if (conta_posicao == tamanho) {
					System.out.println("Senha Completa daqui pra frente!");
					// Incrementa o total no i para parar o loop
					i = 25;
				} else {
					// Incrementa o i pra não parar o loop
					// antes de terminar de formar a senha
					// e faz iniciar o alfabeto de novo caso tenha chegado
					// no fim
					// do mesmo
					if (i == 25) {
						i = 1;
					}
				}
				// Fim do loop da programacao impar
			}
		}

		System.out.println("Tamanho da senha: " + tamanho);
		System.out.println("Tipo da senha gerada: " + tipo);
		System.out.println("Senha gerada 1: " + senha);

		entrada.close();
	}
}
