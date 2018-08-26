package Aula_Tres_Estrutura_Repeticao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio_33 {
	/*
	 * Faça um programa que receba o valor de uma dívida e mostre uma tabela com
	 * os seguintes dados: valor da dívida, valor dos juros, quantidade de
	 * parcelas e valor da parcela. • Os juros e a quantidade de parcelas seguem
	 * a tabela abaixo: Quantidade de Parcelas % de Juros sobre o valor inicial
	 * da dívida 1 0 3 10 6 15 9 20 12 25
	 * 
	 * Exemplo de saída do programa: Valor da Dívida Valor dos Juros Quantidade
	 * de Parcelas Valor da Parcela R$ 1.000,00 0 1 R$ 1.000,00 R$ 1.100,00 100
	 * 3 R$ 366,00 R$ 1.150,00 150 6 R$ 191,67
	 * 
	 * Arredondamento de valores DecimalFormat df = new
	 * DecimalFormat("#.00000"); df.format(0.912385); // Imprime 0,91238
	 * 
	 * 
	 * double d = 12.548795; BigDecimal bd = new BigDecimal(d).setScale(3,
	 * RoundingMode.HALF_EVEN); System.out.println(bd.doubleValue()); // Imprime
	 * 12.549
	 * 
	 * 
	 * Leia mais em: Arredondando números em Java
	 * http://www.devmedia.com.br/arredondando
	 * -numeros-em-java/28248#ixzz3BRCXN2so
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double vl_divida = 0, vl_juros = 0, vl_parcela = 0, vl_capital_inicial = 0;

		// Formata com quantidade variada de casas decimais
		BigDecimal bd = new BigDecimal(vl_parcela);
		bd.setScale(2, RoundingMode.HALF_EVEN);

		BigDecimal bigdec = new BigDecimal(vl_juros);
		bigdec.setScale(2, RoundingMode.HALF_EVEN);

		System.out.println("Valor da divida:");
		vl_capital_inicial = entrada.nextDouble();
		vl_divida = vl_capital_inicial;

		System.out.println("Valor da dívida ||" + "Valor dos Juros ||"
				+ "Quantidade parcelas ||" + " Valor da parcela");

		for (double i = 1; i <= 12; i++) {
			// Mostra Valor da Divida na 1 Parcela
			if (i == 1) {
				vl_juros = 0;
				vl_parcela = (vl_divida + (vl_divida * vl_juros)) / i;
				vl_divida = (vl_divida + (vl_divida * vl_juros));
				vl_juros = vl_capital_inicial * vl_juros;

				System.out.print("      " + vl_divida + "              "
						+ vl_juros + "                " + i
						+ "                   " + vl_parcela);
				System.out.println();
			}

			if (i == 3) {
				vl_juros = 0.1;
				vl_parcela = (vl_divida + (vl_divida * vl_juros)) / i;
				vl_divida = (vl_divida + (vl_divida * vl_juros));
				vl_juros = vl_capital_inicial * vl_juros;

				System.out.print("      " + vl_divida + "              "
						+ vl_juros + "              " + i
						+ "                   " + vl_parcela);
				System.out.println();
			}

			if (i == 6) {
				vl_juros = 0.15;
				vl_parcela = (vl_divida + (vl_divida * vl_juros)) / i;
				vl_divida = (vl_divida + (vl_divida * vl_juros));
				vl_juros = vl_capital_inicial * vl_juros;

				System.out.print("      " + vl_divida + "              "
						+ vl_juros + "              " + i
						+ "                   " + vl_parcela);
				System.out.println();
			}

			if (i == 9) {
				vl_juros = 0.20;
				vl_parcela = (vl_divida + (vl_divida * vl_juros)) / i;
				vl_divida = (vl_divida + (vl_divida * vl_juros));
				vl_juros = vl_capital_inicial * vl_juros;

				System.out.print("      " + vl_divida + "              "
						+ vl_juros + "              " + i
						+ "                   " + vl_parcela);
				System.out.println();
			}

			if (i == 12) {
				vl_juros = 0.25;
				vl_parcela = (vl_divida + (vl_divida * vl_juros)) / i;
				vl_divida = (vl_divida + (vl_divida * vl_juros));
				vl_juros = vl_capital_inicial * vl_juros;

				System.out.print("      " + vl_divida + "              "
						+ vl_juros + "              " + i
						+ "                   " + vl_parcela);
				System.out.println();
			}
		}
		entrada.close();
	}
}
