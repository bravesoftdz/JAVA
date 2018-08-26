package Aula_04_Orientacao_A_Objeto_Lista_Um;

/*
 * Enunciado:
 * 1.	Faça um programa que peça ao usuário nome e sobrenome separadamente e após junte-os com 
 * a mensagem “Seu nome completo é: Nome SobreNome”;
 */

public class Executa_Exercicio_01 {
	public static void main(String[] args) {
		Exercicio_01 usuario = new Exercicio_01();
		usuario.setNome("João ");
		usuario.setSobreNome("da Silva");
		System.out.println("Nome: " + usuario.getNome()
				+ usuario.getSobreNome());
	}

}
