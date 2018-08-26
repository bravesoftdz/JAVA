package Aula_Tres_Vetores;

/**
 * @author Gelvazio
 *
 */
import java.util.Scanner;

public class Exercicio_12 {

	/**
	 * 12.Faça um Programa que peça a idade e a altura de 5 pessoas, armazene
	 * cada informação no seu respectivo vetor. Imprima a idade e a altura na
	 * ordem inversa a ordem lida. Mostrar também idade e altura do mais velho,
	 * mais novo, mais baixo e mais alto. Mostrar idade e altura de quem está
	 * abaixo e acima da média de idade e altura;
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double tamanho_vetores = 6.0;
		double tamanho_for_repeticao = 5.0;

		double vetor_idade[] = new double[(int) tamanho_vetores];
		double vetor_altura[] = new double[(int) tamanho_vetores];
		double vetor_idade_inversa[] = new double[(int) tamanho_vetores];
		double vetor_altura_inversa[] = new double[(int) tamanho_vetores];

		double mais_velho = 0, mais_novo = 0, mais_alto = 0, mais_baixo = 0, soma_altura = 0, soma_idade = 0, media_altura = 0, media_idade = 0;

		double contador = 1;// Inicia com 1 pra igualar a variavel do i de
							// controle

		String nome[] = new String[(int) tamanho_vetores];

		double idade_acima_media[] = new double[(int) tamanho_vetores];
		double altura_acima_media[] = new double[(int) tamanho_vetores];
		double idade_abaixo_media[] = new double[(int) tamanho_vetores];
		double altura_abaixo_media[] = new double[(int) tamanho_vetores];

		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o nome da :" + i + " pessoa:");
			nome[i] = entrada.next();
			System.out.println("Informe a idade da :" + i + " pessoa:");
			vetor_idade[i] = entrada.nextDouble();
			System.out.println("Informe a altura da :" + i + " pessoa:");
			vetor_altura[i] = entrada.nextDouble();

			if ((vetor_idade[i]) > mais_velho) {
				mais_velho = vetor_idade[i];
			}

			if ((vetor_idade[i]) < mais_novo) {
				mais_novo = vetor_idade[i];
			}

			if ((vetor_altura[i]) > mais_alto) {
				mais_alto = vetor_altura[i];
			}

			if ((vetor_altura[i]) < mais_baixo) {
				mais_baixo = vetor_altura[i];
			}

			soma_altura = soma_altura + vetor_altura[i];
			soma_idade = soma_idade + vetor_idade[i];

			media_altura = soma_altura / contador;
			media_idade = soma_idade / contador;

			// Verifica se a idade esta acima da media
			if ((vetor_idade[i]) > media_idade) {
				idade_acima_media[i] = vetor_idade[i];
			}
			// Verifica se a altura esta acima da media
			if ((vetor_altura[i]) > media_altura) {
				altura_acima_media[i] = vetor_altura[i];
			}

			// Verifica se a idade esta abaixo da media
			if ((vetor_idade[i]) < media_idade) {
				idade_abaixo_media[i] = vetor_idade[i];
			}
			// Verifica se a altura esta abaixo da media
			if ((vetor_altura[i]) > media_altura) {
				altura_abaixo_media[i] = vetor_altura[i];
			}

			contador++;
		}
		// Inversao da idade e altura
		for (int i = 1; i >= 0; i--) {
			vetor_idade[i] = vetor_idade_inversa[i];
			vetor_altura[i] = vetor_altura_inversa[i];
		}

		System.out.println("Idade e a altura na ordem inversa a ordem lida");

		for (int i = 1; i <= tamanho_for_repeticao; i++) {
			System.out.println("Altura na posicao :" + i + " é de :"
					+ vetor_altura_inversa[i]);
			System.out.println("Idade na posicao :" + i + " é de :"
					+ vetor_idade_inversa[i]);
		}

		/*
		 * Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
		 * também idade e altura do mais velho, mais novo, mais baixo e mais
		 * alto. Mostrar idade e altura de quem está abaixo e acima da média de
		 * idade e altura;
		 */
		System.out.println("Idade da pessoa mais velha: " + mais_velho);
		System.out.println("Idade da pessoa mais nova: " + mais_novo);
		System.out.println("Idade da pessoa mais alta: " + mais_alto);
		System.out.println("Idade da pessoa mais baixa: " + mais_baixo);

		System.out.println("Media da Altura: " + media_altura);
		System.out.println("Media da idade: " + media_idade);

		System.out.println("Lista das Pessoas com Altura Acima da Media:");
		for (int i = 1; i <= 5; i++) {
			if (altura_acima_media[i] > 0) {
				System.out.println("Altura da : " + i + "pessoa é de:"
						+ altura_acima_media[i]);
			}
		}

		System.out.println("Lista das Pessoas com Altura Abaixo da Media");
		for (int i = 1; i <= 5; i++) {
			if (altura_abaixo_media[i] > 0) {
				System.out.println("Altura da : " + i + "pessoa é de:"
						+ altura_abaixo_media[i]);
			}
		}

		System.out.println("Lista das Pessoas com Idade Acima da Media");
		for (int i = 1; i <= 5; i++) {
			if (idade_acima_media[i] > 0) {
				System.out.println("Altura da : " + i + "pessoa é de:"
						+ idade_acima_media[i]);
			}
		}

		System.out.println("Lista das Pessoas com Idade Abaixo da Media");
		for (int i = 1; i <= 5; i++) {
			if (idade_abaixo_media[i] > 0) {
				System.out.println("Altura da :" + i + "pessoa é de:"
						+ idade_abaixo_media[i]);
			}
		}
		entrada.close();

	}

}
