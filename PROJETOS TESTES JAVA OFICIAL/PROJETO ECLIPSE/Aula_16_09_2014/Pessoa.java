package Aula_16_09_2014;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	
	
	public void setNome(String nome){
		this.nome=nome;		
	}
	
	public void setDataNascimento(Date dataNascimento){
		this.dataNascimento=dataNascimento;
	}	
	
	public String getNome(){
		return nome;
	}
	
	public Date getDataNascimento(){
		return dataNascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}

}
