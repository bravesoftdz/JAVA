package Aula_16_09_2014_Exercicio_01;

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica pessoafisica=new PessoaFisica(); 
		PessoaJuridica pessoajuridica=new PessoaJuridica(); 
		
		pessoafisica.setNome("Gelvazio Camargo");
		pessoafisica.setCpf("061.023.149-99");
		pessoafisica.setEstadoCivil("Solteiro");
		pessoafisica.setEndereco("Rua dos Testes");
		
		pessoajuridica.setNome("Mercado Imperatriz");
		pessoajuridica.setCnpj("099.999.777.0001-00");
		pessoajuridica.setTipoEmpresa("Simples Nacional");
		pessoajuridica.setEndereco("Rua dos Testes Juridicos.");
		
		
		//Chama todos os dados das classes
		System.out.println(pessoafisica.toString());
		System.out.println(pessoajuridica.toString());
		
		//Método Antigo
		System.out.println("//Método Antigo");
		System.out.println(pessoafisica.getNome());
		System.out.println(pessoafisica.getCpf());
		System.out.println(pessoafisica.getEstadoCivil());
		System.out.println(pessoafisica.getEndereco());
		
		System.out.println(pessoajuridica.getNome());
		System.out.println(pessoajuridica.getCnpj());
		System.out.println(pessoajuridica.getTipoEmpresa());
		System.out.println(pessoajuridica.getEndereco());
		
		
	}

}
