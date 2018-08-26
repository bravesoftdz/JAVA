package Aula_Tres_Estrutura_Repeticao;

public class Exercicio_25 {

	/**
	 * O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com
	 * cerca de 10 caixas. Para agilizar o cálculo de quanto cada cliente deve
	 * pagar ele desenvolveu um tabela que contém o número de itens que o
	 * cliente comprou e ao lado o valor da conta. Desta forma a atendente do
	 * caixa precisa apenas contar quantos itens o cliente está levando e olhar
	 * na tabela de preços. Você foi contratado para desenvolver o programa que
	 * monta esta tabela de preços, que conterá os preços de 1 até 50 produtos,
	 * conforme o exemplo abaixo: Lojas Quase Dois - Tabela de preços 1 - R$
	 * 1.99 2 - R$ 3.98 ... 50 - R$ 99.50
	 */
	public static void main(String[] args) {
		double vl_compra = 1.99, vl_item = 1.99;

		System.out.println("Tabela abaixo:");

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$->" + vl_compra);
			vl_compra = vl_compra + vl_item;
		}
	}

}
