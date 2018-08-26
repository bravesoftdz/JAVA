package Teste_Encapsulamento;

public class Pessoa {
	private int codigo;
	private String  nome;
	private String cpf;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
