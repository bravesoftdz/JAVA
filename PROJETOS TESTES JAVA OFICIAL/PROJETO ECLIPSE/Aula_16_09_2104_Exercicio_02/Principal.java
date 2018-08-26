package Aula_16_09_2104_Exercicio_02;

public class Principal {
	public static void main(String[] args) {
		Livro livro = new Livro();
		CD cd = new CD();
		VHS vhs= new VHS();
		
		//Fazer os Sets aqui

		//Precisa Fazer as validações dos 
		//dados nos sets e gets
		
		//Mostra os codigos depois
		System.out.println("Dados dos Livros");
		System.out.println(livro.toString());
		
		System.out.println("Dados dos CDs");
		System.out.println(cd.toString());
		
		System.out.println("Dados dos VHs");
		System.out.println(vhs.toString());
	}
}
