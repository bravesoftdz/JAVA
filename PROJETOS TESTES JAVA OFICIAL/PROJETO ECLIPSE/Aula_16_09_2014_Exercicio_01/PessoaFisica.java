package Aula_16_09_2014_Exercicio_01;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String estadoCivil;
	
	public PessoaFisica(){
		//Instancia a Classe Pessoa
	}
	
	public void setCpf(String cpf){
		this.cpf=cpf;		
	}
	
	public void setEstadoCivil(String estadoCivil){
		this.estadoCivil=estadoCivil;
	}	
	
	public String getCpf(){
		return cpf;
	}
	
	public String getEstadoCivil(){
		return estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CPF [cpf=");
		builder.append(cpf);
		builder.append(", estado civil=");
		builder.append(estadoCivil);
		builder.append("]");
		return builder.toString();
	}

}
