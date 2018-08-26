package Aula_16_09_2014_Exercicio_04;

public class Principal {

	public static void main(String[] args) {

		HomeTheater home = new HomeTheater();
		SistemaDeSom sistemadesom = new SistemaDeSom();
		SistemaDeVideo sistemadevideo = new SistemaDeVideo();

		// Aqui vai os sets->Fazer

		// Aqui mostra os dados
		System.out
				.println("Precisa aprender a parte de Agregação e composição!!!");

		System.out.println("Home Theater");
		System.out.println(home.toString());

		System.out.println("Sistema de Som");
		System.out.println(sistemadesom.toString());

		System.out.println("Sistema de Video");
		System.out.println(sistemadevideo.toString());

	}

}