package Aula_Tres_Vetores;

/**
 * @author Gelvazio
 *
 */
import java.util.Scanner;

public class Exercicio_10 {

	/**
	 * 10. Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta
	 * data e coloque cada item em uma posição de um vetor de inteiros de
	 * tamanho 3.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String data = "";
		int[] vet = new int[3];

		System.out.println("Informe a Data de nascimento no padrão dd/mm/aaaa");
		data = entrada.next();

		String array[] = new String[3];

		array = data.split("/");
		vet[0] = Integer.parseInt(array[0]);
		vet[1] = Integer.parseInt(array[1]);
		vet[2] = Integer.parseInt(array[2]);

		System.out.println("Impressao dos dados do Array");
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);

		entrada.close();
		// Acima esta certo
		/*
		 * 
		 * break; System.out.println("Impressão do Ano em String:");
		 * 
		 * contador=1;
		 * 
		 * for(int i=0; i<data.length();i++){
		 * //System.out.print(" "+data.charAt(i)); //Precisa ter a "" no inicio
		 * senao da um erro. aux_comparacao=(""+data.charAt(i));
		 * 
		 * if(aux_comparacao.equals("/")){
		 * System.out.println("Valor de aux_numero: "+aux_numero);
		 * 
		 * //Conversao da String auxiliar em inteiro para armazenar no vetor
		 * aux_conversao=Integer.parseInt(aux_numero); vetor[i]=aux_conversao;
		 * 
		 * //Limpa a variavel do numero aux_numero=""; aux_conversao=0;
		 * 
		 * System.out.println("Valor de aux_conversao: "+aux_conversao);
		 * System.out.println("Valor armazenado no vetor: "+vetor[contador]);
		 * 
		 * contador++; }else{ //Incrementa a String que pega o numero
		 * aux_numero=aux_numero+data.charAt(i);
		 * System.out.println("Valor de aux_numero "+aux_numero); } }
		 * System.out.println("Impressao dos dados no vetor."); for(int
		 * i=0;i<3;i++){ System.out.print (" "+vetor[i]); }
		 */

	}

}
