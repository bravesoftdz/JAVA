package Aula_16_09_2014_Exercicio_01;

public class Pessoa {
	private String nome;
	private String endereco;
	
	
	public void setNome(String nome){
		this.nome=nome;		
	}
	
	public void setEndereco(String endereco){
		this.endereco=endereco;
	}	
	
	public String getNome(){
		return nome;
	}
	
	public String getEndereco(){
		return endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

}
