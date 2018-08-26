package Teste_Encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		
		//Aqui vai os sets
		f.setCodigo(1);
		f.setNome("Geo");
		f.setCpf("061.023.149-99");
		f.setHora_trabalhada(12);
		f.setSalario(5000);
		
		//Dados do Aluno na classe aluno
		aluno a = new aluno();
		a.setMatricula(1234);
		a.setCurso("Computação");
		
		
		//Aqui mostra os dados
		System.out.println(f);
		System.out.println(a);

	}

}
