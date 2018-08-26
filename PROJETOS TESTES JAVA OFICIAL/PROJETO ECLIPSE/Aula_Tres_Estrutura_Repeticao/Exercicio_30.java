package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_30 {

	/**
	 * Uma academia deseja fazer um senso entre seus clientes para descobrir o
	 * mais alto, o mais baixo, a mais gordo e o mais magro, para isto voc� deve
	 * fazer um programa que pergunte a cada um dos clientes da academia seu
	 * c�digo, sua altura e seu peso. O final da digita��o de dados deve ser
	 * dada quando o usu�rio digitar 0 (zero) no campo c�digo. Ao encerrar o
	 * programa tamb�m deve ser informados os c�digos e valores do clente mais
	 * alto, do mais baixo,do mais gordo e do mais magro, al�m da m�dia das
	 * alturas e dos pesos dos clientes.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double contador = 0, codigo = 0, altura = 0, peso = 0;

		double mais_alto = 0, mais_baixo = 0, mais_gordo = 0, mais_magro = 0;
		double codAlto = 0, codBaixo = 0, codGordo = 0, codMagro = 0;

		double soma_altura = 0, soma_peso = 0, media_altura = 0, media_peso = 0;

		do {
			System.out.println("Codigo da pessoa:");
			codigo = entrada.nextInt();

			System.out.println("Altura da pessoa:");
			altura = entrada.nextInt();

			System.out.println("Peso da pessoa:");
			peso = entrada.nextInt();

			if (peso > mais_gordo) {
				mais_gordo = peso;
				codGordo = codigo;
			}

			if (altura > mais_alto) {
				mais_alto = altura;
				codAlto = codigo;
			}

			if (peso < mais_magro) {
				mais_magro = peso;
				codMagro = codigo;
			}

			if (altura < mais_baixo) {
				mais_baixo = altura;
				codBaixo = codigo;
			}

			soma_altura = soma_altura + altura;
			soma_peso = soma_peso + peso;
			contador++;

		} while (codigo != 0);

		media_altura = soma_altura / contador;
		media_peso = soma_peso / contador;

		System.out.println("Pessoa C�digo: " + codAlto
				+ " � a pessoa mais alta com: " + mais_alto + " de altura!");
		System.out.println("Pessoa C�digo: " + codBaixo
				+ " � a pessoa mais baixa com: " + mais_baixo + " de altura!");

		System.out.println("Pessoa C�digo: " + codGordo
				+ " � a pessoa mais gorda com: " + mais_gordo + " de altura!");
		System.out.println("Pessoa C�digo: " + codMagro
				+ " � a pessoa mais magra com: " + mais_magro + " de altura!");

		System.out.println("M�dia dos Pesos: " + media_peso);
		System.out.println("M�dia das Aulturas: " + media_altura);
	}

}
