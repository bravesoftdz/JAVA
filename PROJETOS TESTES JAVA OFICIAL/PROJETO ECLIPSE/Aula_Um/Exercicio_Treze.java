package Aula_Um;

import java.util.Scanner;

public class Exercicio_Treze {

	/**
	 * Enunciado: Jo�o Papo-de-Pescador, homem de bem, comprou um
	 * microcomputador para controlar o rendimento di�rio de seu trabalho. Toda
	 * vez que ele traz um peso de peixes maior que o estabelecido pelo
	 * regulamento de pesca do estado de S�o Paulo (50 quilos) deve pagar uma
	 * multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um
	 * programa que leia a vari�vel peso (peso de peixes) e verifique se h�
	 * excesso. Se houver, gravar na vari�vel excesso e na vari�vel multa o
	 * valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais
	 * vari�veis com o conte�do ZERO OU NEGATIVO.
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
