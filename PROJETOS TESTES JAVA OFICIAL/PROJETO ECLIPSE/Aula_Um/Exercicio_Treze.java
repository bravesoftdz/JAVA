package Aula_Um;

import java.util.Scanner;

public class Exercicio_Treze {

	/**
	 * Enunciado: João Papo-de-Pescador, homem de bem, comprou um
	 * microcomputador para controlar o rendimento diário de seu trabalho. Toda
	 * vez que ele traz um peso de peixes maior que o estabelecido pelo
	 * regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma
	 * multa de R$ 4,00 por quilo excedente. João precisa que você faça um
	 * programa que leia a variável peso (peso de peixes) e verifique se há
	 * excesso. Se houver, gravar na variável excesso e na variável multa o
	 * valor da multa que João deverá pagar. Caso contrário mostrar tais
	 * variáveis com o conteúdo ZERO OU NEGATIVO.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso_peixes = 0;
		double multa = 4;
		double excesso = 0;

		System.out.println("Informe o peso dos peixes pescados: ");
		peso_peixes = entrada.nextDouble();

		if (peso_peixes > 50) {
			excesso = peso_peixes - 50;
			multa = excesso * multa;
		} else {
			excesso = 0;
			multa = 0;
		}
		System.out.println("Peso dos peixes pescados: " + peso_peixes);
		System.out.println("Quantidade em excesso:  " + excesso);
		System.out.println("Multa a ser paga: " + multa);
	}

}
