package Aula_16_09_2014;

import java.util.Date;

public class Executa_Aluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Gelvazio Camargo");
		aluno.setDataNascimento(new Date());
		aluno.setMatricula(1234);
		
		//Este é igual ao de baixo
		System.out.println(aluno.toString());
		System.out.println(aluno);
		//Aqui embaixo ele ja busca sozinho o método toString
		
		
	}

}
