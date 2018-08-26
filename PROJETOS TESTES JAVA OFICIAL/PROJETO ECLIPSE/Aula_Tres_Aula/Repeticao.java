package Aula_Tres_Aula;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tab = 0;
		int inicio = 0;
		int fim = 0;

		System.out.println("Informe o inicio:");
		inicio = entrada.nextInt();

		System.out.println("Informe o fim:");
		fim = entrada.nextInt();

		System.out.print("Carregando");
		for (int x = 0; x <= 10; x++) {
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();

		System.out.println("Informe um numero:");
		tab = entrada.nextInt();

		for (int x = inicio; x <= fim; x++) {
			System.out.println(tab + " X " + x + " = " + (tab * x));
		}

	}

}
