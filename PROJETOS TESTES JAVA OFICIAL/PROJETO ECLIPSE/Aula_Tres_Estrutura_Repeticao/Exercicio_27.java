package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_27 {

	/**
	 * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de
	 * 1,99 e agora possui uma loja de conveniências. Faça um programa que
	 * implemente uma caixa registradora rudimentar. O programa deverá receber
	 * um número desconhecido de valores referentes aos preços das mercadorias.
	 * Um valor zero deve ser informado pelo operador para indicar o final da
	 * compra. O programa deve então mostrar o total da compra e perguntar o
	 * valor em dinheiro que o cliente forneceu, para então calcular e mostrar o
	 * valor do troco. Após esta operação, o programa deverá voltar ao ponto
	 * inicial, para registrar a próxima compra. A saída deve ser conforme o
	 * exemplo abaixo: Lojas Tabajara Produto 1: R$ 2.20 Produto 2: R$ 5.80
	 * Produto 3: R$ 0 Total: R$ 9.00 Dinheiro: R$ 20.00 Troco: R$ 11.00 ...
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double vl_compra = 0, vl_item = 0, dinheiro = 0, troco = 0;

		int contador = 1000;
		System.out.println("Lojas Tabajara");
		for (int i = 1; i < contador; i++) {
			System.out.print("Produto " + i + " : R$ ");
			vl_item = entrada.nextDouble();

			// Soma a venda
			vl_compra = vl_compra + vl_item;

			if (vl_item == 0) {
				System.out.println("Voce escolheu finalizar a venda!");
				System.out.println("Informe os dados!");
				System.out.println("Valor total da Compra:" + vl_compra);
				i = contador;
				System.out.print("Dinheiro: R$ ");
				dinheiro = entrada.nextDouble();
				// Verifica se o dinheiro e suficiente para a compra
				do {

					if (dinheiro < vl_compra) {
						System.out
								.println("Dinheiro Insuficiente!Informe de novo!");
						dinheiro = entrada.nextDouble();
					}

				} while (dinheiro < vl_compra);

				troco = dinheiro - vl_compra;

				System.out.println("------------------------");
				System.out.println("Lojas Tabajara");
				System.out.println("Valor total da Compra:" + vl_compra);
				System.out.print("Dinheiro: R$ ");
				System.out.print("Troco: R$ " + troco);
				System.out.println("Agradecemos a sua peferencia!");
				System.out.println("------------------------");
			}
		}

	}

}
