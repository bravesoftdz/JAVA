package Aula_Tres_Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio_32 {
	/*
	 * Foi feita uma estat�stica em cinco cidades brasileiras para coletar dados
	 * sobre acidentes de tr�nsito. Foram obtidos os seguintes dados:
	 * 
	 * a. C�digo da cidade; b. N�mero de ve�culos de passeio (em 1999); c.
	 * N�mero de acidentes de tr�nsito com v�timas (em 1999).
	 * 
	 * Deseja-se saber: d. Qual o maior e menor �ndice de acidentes de transito
	 * e a que cidade pertence; e. Qual a m�dia de ve�culos nas cinco cidades
	 * juntas; f. Qual a m�dia de acidentes de tr�nsito nas cidades com menos de
	 * 2.000 ve�culos de passeio.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigo = 0, nr_veiculo_99 = 0, nr_acid_99 = 0;
		int maior_indice = 0, menor_indice = 0, media_veiculo = 0, soma_veiculo = 0, conta_acid_menor_2000 = 0, media_acidente = 0, soma_acidente = 0;
		int cod_maior_indice = 0, cod_menor_indice = 0;
		String nome_cidade = "", nome_menor_indice = "", nome_maior_indice = "";

		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o codigo da cidade:");
			codigo = entrada.nextInt();

			System.out.println("Nome da cidade:");
			nome_cidade = entrada.next();

			System.out.println("N�mero de ve�culos de passeio (em 1999):");
			nr_veiculo_99 = entrada.nextInt();

			System.out
					.println("N�mero de acidentes de tr�nsito com v�timas (em 1999):");
			nr_acid_99 = entrada.nextInt();

			if (nr_acid_99 > maior_indice) {
				maior_indice = nr_acid_99;
				cod_maior_indice = codigo;
				nome_maior_indice = nome_cidade;
			}

			if (nr_acid_99 < menor_indice) {
				menor_indice = nr_acid_99;
				cod_menor_indice = codigo;
				nome_menor_indice = nome_cidade;
			}

			if (nr_veiculo_99 < 2000) {
				soma_acidente = soma_acidente + nr_acid_99;
				conta_acid_menor_2000++;
			}

			soma_veiculo = soma_veiculo + nr_veiculo_99;
		}

		media_veiculo = soma_veiculo / 5;
		media_acidente = soma_acidente / conta_acid_menor_2000;

		System.out
				.println("Maior �ndice de acidentes de transito � da cidade de c�digo: "
						+ cod_maior_indice
						+ " de nome:"
						+ nome_maior_indice
						+ " e � de: " + maior_indice);
		System.out
				.println("Menor �ndice de acidentes de transito � da cidade de c�digo: "
						+ cod_menor_indice
						+ " de nome:"
						+ nome_menor_indice
						+ " e � de: " + menor_indice);
		System.out.println("Media de Veiculos em 1999: " + media_veiculo);
		System.out
				.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos de passeio:"
						+ media_acidente);

		entrada.close();
	}

}
