package Aula_04_Orientacao_A_Objeto_Lista_Um;

/*
 * Enunciado:
 * 1.	Fa�a um programa que pe�a ao usu�rio nome e sobrenome separadamente e ap�s junte-os com 
 * a mensagem �Seu nome completo �: Nome SobreNome�;
 */

public class Executa_Exercicio_01 {
	public static void main(String[] args) {
		Exercicio_01 usuario = new Exercicio_01();
		usuario.setNome("Jo�o ");
		usuario.setSobreNome("da Silva");
		System.out.println("Nome: " + usuario.getNome()
				+ usuario.getSobreNome());
	}

}
