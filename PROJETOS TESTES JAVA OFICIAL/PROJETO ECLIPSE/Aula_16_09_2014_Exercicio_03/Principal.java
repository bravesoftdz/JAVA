package Aula_16_09_2014_Exercicio_03;

public class Principal {

	public static void main(String[] args) {
		ContaEspecial contaespecial= new ContaEspecial();
		ContaSimples contasimples= new ContaSimples();
		contaespecial.setAgencia(1234);
		contaespecial.setBanco("Banco do Brasil");
		contaespecial.setNumeroconta(21212);
		contaespecial.setDiasSemJuros(100);
		contaespecial.setLimite(1000);
		contaespecial.setSaldo(1550);
		
		contasimples.setAgencia(1234);
		contasimples.setBanco("Caixa Economica");
		contasimples.setNumeroconta(21212);
		contasimples.setSaldo(1550);
		
		//Aqui vai os SETS
		
		//Aqui mostra os dados
		System.out.println("Dados da Conta Especial");
		System.out.println(contaespecial.toString());

		System.out.println("Dados da Conta Simples");
		System.out.println(contasimples.toString());

	}

}
